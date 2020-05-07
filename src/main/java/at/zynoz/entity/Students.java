package at.zynoz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Table(name = "students")
public class Students extends AbstractBaseEntity<Students, Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_phone")
    private long contactPhone;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "parent_first_name")
    private String parentFirstName;

    @Column(name = "parent_last_name")
    private String parentLastName;

    @Column(name = "parent_contact_email")
    private String parentContactEmail;

    @Column(name = "parent_contact_phone")
    private long parentContactPhone;

//    @Column(name = "is_sibling")
//    private boolean isSibling;

    @Column(name = "created")
    private LocalDate created;

    @PrePersist
    private void init() {
        setCreated(LocalDate.now());
    }

}
