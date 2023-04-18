public class Appointment {

    private Doctor doctor;
    private Patient patient;
    private Illness illness;

    private DateTime date;

    public Appointment(Doctor doctor, Patient patient, Illness illness, DateTime date) {
        this.doctor = doctor;
        this.patient = patient;
        this.illness = illness;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public DateTime getDateTime() {
        return date;
    }

    public void setDateTime(DateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", illness=" + illness +
                ", date=" + date +
                '}';
    }
}