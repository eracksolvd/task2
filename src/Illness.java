public class Illness {

    private int illnessID;
    private String name;

    public Illness(int illnessID, String name) {
        this.illnessID = illnessID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Illness{" +
                "illnessID=" + illnessID +
                ", name='" + name + '\'' +
                '}';
    }
}
