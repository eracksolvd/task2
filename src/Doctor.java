import java.util.Objects;

public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String firstName, String lastName, Address address, String phone, String employeeID, String specialty) {
        super(firstName, lastName, address, phone, employeeID);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor{" + "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                "specialty='" + specialty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor doctor)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getSpecialty(), doctor.getSpecialty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpecialty());
    }
}
