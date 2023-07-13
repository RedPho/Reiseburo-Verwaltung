import java.util.ArrayList;

public class Kunde extends Person {
    private String kundennummer;
    private String[] reiseZiele;
    private String unterkunft;
    private ArrayList<Reisepaket> reisepakete = new ArrayList();


    public void setKundennummer(String kundennummer) {
        this.kundennummer = kundennummer;
    }

    public void setReiseZiele(String[] reiseZiele) {
        this.reiseZiele = reiseZiele;
    }

    public void setUnterkunft(String unterkunft) {
        this.unterkunft = unterkunft;
    }

    public void setReisepakete(ArrayList<Reisepaket> rp) {
        this.reisepakete = rp;
    }

    public String getKundennummer() {
        return kundennummer;
    }

    public String[] getReiseZiele() {
        return reiseZiele;
    }

    public String getUnterkunft() {
        return unterkunft;
    }

    public ArrayList<Reisepaket> getReisepakete() {
        return reisepakete;
    }

    public void addReisePaket(Reisepaket rp) {
        reisepakete.add(rp);
    }

    @Override
    public String toString() {
        return "\nBuerger ID:" + this.getBuergerID() + "\nName:" + this.getName() + "\nNachname:" + this.getNachname() + "\nReisepakete:" + this.getReisepakete();
    }

    public Kunde(String bId) {
        super(bId);
    }
    public Kunde(String bId, String n, String nn) {
        super(bId, n, nn);
    }
    public Kunde(String bId, String knummer) {
        super(bId);
        kundennummer = knummer;
    }
    public Kunde(String bId, String knummer, String[] rZiel) {
        super(bId);
        kundennummer = knummer;
        reiseZiele = rZiel;
    }
}