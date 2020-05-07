package at.zynoz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class AbstractBaseEntity<ENTITY extends AbstractBaseEntity<ENTITY, PK>, PK extends Number> {

    protected PK id;

    protected Integer version;


    public final boolean isNew() {
        return id == null;
    }

}
