import java.util.ArrayList;

public class Hospital {
   private String name;
   private Address address;
   private String phone;

   private ArrayList<HospitalEmployee> employees;

    public Hospital(String name, Address address, String phone, ArrayList<HospitalEmployee> employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<HospitalEmployee> getHospitalEmployees() {
        return employees;
    }

    public void setHospitalEmployees(ArrayList<HospitalEmployee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                ", employees=" + employees +
                '}';
    }
}
