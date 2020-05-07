package at.zynoz.persistence;

import java.sql.SQLException;

public class PersistenceException extends RuntimeException {

    private PersistenceException(String msg) {
        super(msg);
    }

    private PersistenceException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public static PersistenceException forSQLException(SQLException sqlE) {
        return new PersistenceException("An error occured during communication with the database.", sqlE);
    }

    public static PersistenceException forUnexpectedBehaviour(String sql) {
        String msg = String.format("An unexpected behaviour was detected on the following query: %s", sql);
        return new PersistenceException(msg);
    }
}
