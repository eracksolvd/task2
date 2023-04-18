import java.util.Objects;

public class Patient extends Person {
    private String patientID;
    private String insurerName;

    public Patient(String firstName, String lastName, Address address, String phone, String patientID, String insurerName) {
        super(firstName, lastName, address, phone);
        this.patientID = patientID;
        this.insurerName = insurerName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        return Objects.equals(getPatientID(), patient.getPatientID()) && Objects.equals(getInsurerName(), patient.getInsurerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientID(), getInsurerName());
    }
}

