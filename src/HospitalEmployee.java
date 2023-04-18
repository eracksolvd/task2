import java.util.Objects;

public class HospitalEmployee extends Person {
    private String employeeID;

    public HospitalEmployee(String firstName, String lastName, Address address, String phone, String employeeID) {
        super(firstName, lastName, address, phone);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "HospitalEmployee{" +
                "employeeID='" + employeeID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HospitalEmployee that)) return false;
        return Objects.equals(employeeID, that.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

}
