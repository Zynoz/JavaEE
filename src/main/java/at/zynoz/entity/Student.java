package at.zynoz.entity;

public class Student extends AbstractBaseEntity<Student, Long> {

    String firstName;
    String lastName;
    String contactEmail;
    String contactPhone;
    String birthDate;
    String parentFirstName;
    String parentLastName;
    String parentContactEmail;
    String parentContactPhone;

    public Student() {
    }

    public Student(String firstName, String lastName, String contactEmail, String contactPhone, String birthDate, String parentFirstName, String parentLastName, String parentContactEmail, String parentContactPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.birthDate = birthDate;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentContactEmail = parentContactEmail;
        this.parentContactPhone = parentContactPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentContactEmail() {
        return parentContactEmail;
    }

    public void setParentContactEmail(String parentContactEmail) {
        this.parentContactEmail = parentContactEmail;
    }

    public String getParentContactPhone() {
        return parentContactPhone;
    }

    public void setParentContactPhone(String parentContactPhone) {
        this.parentContactPhone = parentContactPhone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", parentFirstName='" + parentFirstName + '\'' +
                ", parentLastName='" + parentLastName + '\'' +
                ", parentContactEmail='" + parentContactEmail + '\'' +
                ", parentContactPhone='" + parentContactPhone + '\'' +
                ", id=" + id +
                ", version=" + version +
                '}';
    }
}
