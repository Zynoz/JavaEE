package at.zynoz.persistence;

import at.zynoz.entity.AbstractBaseEntity;
import at.zynoz.entity.Student;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public interface Repository<ENTITY extends AbstractBaseEntity<ENTITY, PK>, PK extends Number> {

    int save(Connection connection, ENTITY ENTITY);

    int delete(Connection connection, ENTITY entity);

    int deleteById(Connection connection, PK id);

    long count(Connection connection);

    boolean exists(Connection connection, PK id);

    Optional<ENTITY> findById(Connection connection, PK id);

    List<Student> findAll(Connection connection);
}
