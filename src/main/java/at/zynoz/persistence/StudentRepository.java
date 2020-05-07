package at.zynoz.persistence;

import at.zynoz.entity.Students;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository extends AbstractBaseRepository<Students, Long> {

    @Override
    public long count(Connection connection) {
        return 0;
    }

    @Override
    public Optional<Students> findById(Connection connection, Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Students> findByAll(Connection connection) {
        return Optional.empty();
    }

    @Override
    protected String getTableName() {
        return "students";
    }

    @Override
    protected List<String> getColumnNames() {
        List<String> columns = new ArrayList<>();
        columns.add("task");
        columns.add("isCompleted");
        columns.add("dueDate");
        columns.add("dateCompleted");
        columns.add("dateCreated");
        return columns;
    }
}
