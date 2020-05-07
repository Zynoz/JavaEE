package at.zynoz.persistence;

import at.zynoz.entity.AbstractBaseEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public abstract class AbstractBaseRepository<ENTITY extends AbstractBaseEntity<ENTITY, PK>, PK extends Number> implements Repository<ENTITY, PK>, SQLColumnSupport {

    private final String ID_WHERE_CLAUSE = " WHERE " + getPrimaryKeyColumnName() + " = ?";

    private final String SQL_DELETE_BY_ID = "DELETE FROM " + getTableName() + " WHERE " + getPrimaryKeyColumnName() + " = ?";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + asQueryColumnList(getColumnNames()) + " VALUES " + getPlaceholdersFor(getColumnNames());

    private final String SQL_COUNT = "SELECT count(1) FROM " + getTableName();

    private final String SQL_EXISTS = SQL_COUNT + ID_WHERE_CLAUSE;

    private PreparedStatement stmtDeleteById;

    private PreparedStatement stmtCount;
    private PreparedStatement stmtExists;

    public final int save(Connection connection, ENTITY entity) {
        return entity.isNew() ? insert(connection, entity) : update(connection, entity);
    }

    public final int delete(Connection connection, ENTITY entity) {
        return entity.isNew() ? 1 : deleteById(connection, entity.getId());
    }

    @Override
    public final int deleteById(Connection connection, PK id) {
        try {
            if (stmtDeleteById == null) {
                stmtDeleteById = connection.prepareStatement(SQL_DELETE_BY_ID);
            }
            stmtDeleteById.setLong(1, id.longValue());
            int rowsAffected = stmtDeleteById.executeUpdate();
            return rowsAffected;
        } catch (SQLException e) {
            throw PersistenceException.forSQLException(e);
        }
    }

    @Override
    public long count(Connection connection) {
        try {
            if (stmtCount == null) {
                stmtCount = connection.prepareStatement(SQL_COUNT);
            }
            ResultSet rs = stmtCount.executeQuery();
            if (rs.next()) return rs.getLong(1);
            else {
                throw PersistenceException.forUnexpectedBehaviour(SQL_COUNT);
            }
        } catch (SQLException e) {
            throw PersistenceException.forSQLException(e);
        }
    }

    @Override
    public boolean exists(Connection connection, PK id) {
        try {
            if (stmtExists == null) {
                stmtExists = connection.prepareStatement(SQL_EXISTS);
            }

            stmtExists.setLong(1, id.longValue());

            ResultSet rs = stmtExists.executeQuery();

            return (rs.next()) && rs.getLong(1) > 0;
        } catch (SQLException e) {
            throw PersistenceException.forSQLException(e);
        }
    }

    @Override
    public Optional findById(Connection connection, PK id) {
        return Optional.empty();
    }

    @Override
    public Optional findByAll(Connection connection) {
        return Optional.empty();
    }

    private int update(Connection connection, ENTITY entity) {
        return 0;
    }

    private int insert(Connection connection, ENTITY entity) {
        return 0;
    }

    protected abstract String getTableName();

    protected abstract List<String> getColumnNames();

    protected String getPrimaryKeyColumnName() {
        return "id";
    }

    protected String getVersionColumnName() {
        return "version";
    }
}
