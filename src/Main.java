import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Address address00 = new Address("7982 Westminster Rd.", "Washington", "PA", "15301" );
        Address address01= new Address("7167 East Fairview Street", "Kaukauna", "WI", "54130" );
        Address address02 = new Address("17 Snake Hill Street", "Hillsborough", "NJ", "08844" );
        Address address03 = new Address("2 Monroe Drive", "Bountiful", "UT", "84010" );
        Address address04 = new Address("618 Edgemont Ave.", "Marion", "NC", "28752" );
        Address address05 = new Address("7207 West Heritage Ave.", "Corona", "NY", "11368" );
        Address address06 = new Address("54 Squaw Creek Dr.", "Willoughby", "OH", "44094" );
        Address address07 = new Address("7130 Euclid Street", "Menasha", "WI", "54952" );

        Doctor doctor00 = new Doctor("Bob", "McFrog", address00, "2344678836", "00", "Surgery");
        Doctor doctor01 = new Doctor("John", "Roberts", address01, "3446788367", "01", "Allergies");
        Doctor doctor02 = new Doctor("Rob", "Hamilton", address02, "4467883678", "02", "Cancer");
        Doctor doctor03 = new Doctor("Dave", "Johnson", address03, "4678836712", "03", "General Medicine");

        Accounting accountant1 = new Accounting("Lisa", "Smith", address04,"2453459348", "04", "Sends invoices and collects payment");

        ArrayList<HospitalEmployee> hospitalEmployees = new ArrayList<>();
        hospitalEmployees.add(doctor00);
        hospitalEmployees.add(doctor01);
        hospitalEmployees.add(doctor02);
        hospitalEmployees.add(doctor03);
        hospitalEmployees.add(accountant1);

        Illness illness00 = new Illness(00, "Cancer");
        Illness illness01 = new Illness(01, "Broken Bone");
        Illness illness02 = new Illness(02, "Allergies");
        Illness illness03 = new Illness(03, "Cold");
        Illness illness04 = new Illness(04, "Stomach Ache");
        Illness illness05 = new Illness(05, "Flu");
        Illness illness06 = new Illness(06, "Covid");

        ArrayList<Illness> illnesses = new ArrayList<>();
        illnesses.add(illness00);
        illnesses.add(illness01);
        illnesses.add(illness02);
        illnesses.add(illness03);
        illnesses.add(illness04);
        illnesses.add(illness05);
        illnesses.add(illness06);

        Hospital hospital00 = new Hospital("Hospital of Bob", address00, "2347641345", hospitalEmployees);

//        System.out.println(hospital00);

        Patient patient00 = new Patient("Rob", "Johnson", address05, "2340959045", "00", "Blue Shield");
        Patient patient01 = new Patient("Faith", "Greeves", address06, "9340959045", "01", "Blue Cross");
        Patient patient02= new Patient("Summer", "Casey", address07, "4340959045", "02", "Kaiser");

        System.out.println(patient00);
//        System.out.println(hospital00);
//        System.out.println(doctor00);


    }
}