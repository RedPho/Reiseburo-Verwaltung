import java.util.Date;

public class Reisepaket{
    private String paketID;
    private String destination;
    private String datum;
    private String dauer;
    private String preis;


    public void setPaketID(String pid) {
        this.paketID = pid;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setDauer(String dauer) {
        this.dauer = dauer;
    }

    public  void setPreis(String preis) {
        this.preis = preis;
    }


    public String getPaketID() {
        return paketID;
    }

    public String getDestination() {
        return destination;
    }

    public String getDatum() {
        return datum;
    }

    public String getDauer() {
        return dauer;
    }

    public String getPreis() {
        return preis;
    }


    @Override
    public boolean equals(Object x) {
        Reisepaket temp = (Reisepaket) x;
        return this.getPaketID().equals(temp.getPaketID());
    }

    @Override
    public String toString() {
        return "\nPaket ID: " + this.getPaketID() + "\nDestination: " + this.getDestination() + "\nDatum: " + this.getDatum() + "\nDauer " + this.getDauer() + "\nPreis: " + this.getPreis();
    }

    public static Boolean checkPaketID(String bID) {
        return bID.matches("[1-9][0-9]*");
    }



    public Reisepaket(String paketID) {
        this.paketID = paketID;
    }
    public Reisepaket(String paketID, String destination) {
        this.paketID = paketID;
        this.destination = destination;
    }
    public Reisepaket(String paketID, String destination, String datum) {
        this.paketID = paketID;
        this.destination = destination;
        this.datum = datum;
    }

    public Reisepaket(String paketID, String destination, String datum, String dauer) {
        this.paketID = paketID;
        this.destination = destination;
        this.datum = datum;
        this.dauer = dauer;
    }
    public Reisepaket(String paketID, String destination, String datum, String dauer, String preis) {
        this.paketID = paketID;
        this.destination = destination;
        this.datum = datum;
        this.dauer = dauer;
        this.preis = preis;
    }

}
