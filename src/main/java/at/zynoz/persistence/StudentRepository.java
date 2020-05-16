package at.zynoz.persistence;

import at.zynoz.entity.Student;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository extends AbstractBaseRepository<Student, Long> {

    @Override
    public long count(Connection connection) {
        return 0;
    }

    @Override
    public Optional<Student> findById(Connection connection, Long id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll(Connection connection) {

        return null;
    }

    public List<Student> findAllByNameLike(Connection con, String search) {
        return null;
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
