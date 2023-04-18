public class Accounting extends HospitalEmployee {
    private String jobDescription;

    public Accounting(String firstName, String lastName, Address address, String phone, String employeeID, String jobDescription) {
        super(firstName, lastName, address, phone, employeeID);
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "jobDescription='" + jobDescription + '\'' +
                '}';
    }
}
