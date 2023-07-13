import java.lang.reflect.Array;

public class Mitarbeiter extends Person {
    private String jobPosition;
    private Float monatlichesGehalt;
    private String[] aufgaben;

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setMonatlichesGehalt(Float monatlichesGehalt) {
        this.monatlichesGehalt = monatlichesGehalt;
    }

    public void setAufgaben(String[] aufgaben) {
        this.aufgaben = aufgaben;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public Float getMonatlichesGehalt() {
        return monatlichesGehalt;
    }

    public String[] getAufgaben() {
        return aufgaben;
    }

    public Mitarbeiter(String bID) {
        super(bID);
    }

    public  Mitarbeiter(String bID, String n) {
        super(bID, n);
    }

    @Override
    public String toString() {
        return "\nBuerger ID: " + this.getBuergerID() + "\nName: " + this.getName() + "\nNachname: " + this.getNachname();
    }

    public  Mitarbeiter(String bID, String n, String nn) {
        super(bID, n, nn);
    }

    public  Mitarbeiter(String bID, String n, String[] ag) {
        super(bID, n);
        aufgaben = ag;
    }
}
