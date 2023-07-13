import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList();
        ArrayList<Kunde> kunden = new ArrayList();
        ArrayList<Reisepaket> reisepakete = new ArrayList();


        Scanner sc = new Scanner(System.in);

        int operation = 0;
        while (operation != 100) {
            System.out.println("Welche Operation moechten Sie durchfuehren?");
            System.out.println(" 1- Mitarbeiter hinzufuegen");
            System.out.println(" 2- Mitarbeiter auflisten");
            System.out.println(" 3- Mitarbeiter suchen");
            System.out.println(" 4- Kunde hinzufuegen");
            System.out.println(" 5- Kunden auflisten");
            System.out.println(" 6- Kunde suchen");
            System.out.println(" 7- Reisepaket hinzufuegen");
            System.out.println(" 8- Alle Reisepakete auflisten");
            System.out.println(" 9- Reisepaket suchen");
            System.out.println(" 10- Reisepaketpreis aendern");
            System.out.println(" 11- Reisepaket an Kunden verkaufen");
            System.out.println(" 12- Alle Reisepakete eines Kunden auflisten");
            System.out.println(" 100 - Programm beenden");

            try {
                operation = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("Bitte geben Sie eine gueltige Option ein.");
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Fehler:" + e);
            }



            if (operation == 1) {
                System.out.println("Geben Sie die 7-stellige BuergerID ein.");
                String bID = sc.nextLine();
                while(!Person.checkBuergerID(bID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die 7-stellige BuergerID ein. (Es muss nur aus Ziffern bestehen.)");
                    bID = sc.nextLine();
                };
                System.out.println("Geben Sie den Namen ein.");
                String n = sc.nextLine();
                while(!Person.checkName(n)) {
                    System.out.println("Falsch Format! Bitte geben Sie den Namen ein. (Es muss eine Länge von mindestens 2 haben und nur aus Buchstaben, Punkt-Zeichen und Leerzeichen bestehen.)");
                    n = sc.nextLine();
                };
                System.out.println("Geben Sie den Nachnamen ein.");
                String nn = sc.nextLine();
                while(!Person.checkNachName(nn)) {
                    System.out.println("Falsch Format! Bitte geben Sie den Nachnamen ein. (Es muss eine Länge von mindestens 2 haben und nur aus Buchstaben bestehen.)");
                    nn = sc.nextLine();
                };
                Mitarbeiter m = new Mitarbeiter(bID, n, nn);
                mitarbeiter.add(m);
            }
            else if (operation == 2) {
                for (Integer i = 0; i < mitarbeiter.size(); i++) {
                    System.out.println("\n" + (i+1) + ". Mitarbeiter: " + mitarbeiter.get(i));
                }

            } else if (operation == 3) {
                System.out.println("Geben Sie die BuergerID ein.");
                String bID = sc.nextLine();
                while(!Person.checkBuergerID(bID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die 7-stellige BuergerID ein. (Es muss nur aus Ziffern bestehen.)");
                    bID = sc.nextLine();
                };
                int mIndex = mitarbeiter.indexOf(new Mitarbeiter(bID));
                if (mIndex == -1) {
                    System.out.println("Person konnte nicht gefunden werden");
                }
                else {
                    System.out.println(mitarbeiter.get(mIndex));
                }

            } else if (operation == 4) {
                System.out.println("Geben Sie die 7-stellige BuergerID ein.");
                String bID = sc.nextLine();
                while(!Person.checkBuergerID(bID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die 7-stellige BuergerID ein. (Es muss nur aus Ziffern bestehen.)");
                    bID = sc.nextLine();
                };
                System.out.println("Geben Sie den Namen ein.");
                String n = sc.nextLine();
                while(!Person.checkName(n)) {
                    System.out.println("Falsch Format! Bitte geben Sie den Namen ein. (Es muss eine Länge von mindestens 2 haben und nur aus Buchstaben, Punkt-Zeichen und Leerzeichen bestehen.)");
                    n = sc.nextLine();
                };
                System.out.println("Geben Sie den Nachnamen ein.");
                String nn = sc.nextLine();
                while(!Person.checkNachName(nn)) {
                    System.out.println("Falsch Format! Bitte geben Sie den Nachnamen ein. (Es muss eine Länge von mindestens 2 haben und nur aus Buchstaben bestehen.)");
                    nn = sc.nextLine();
                };
                Kunde k = new Kunde(bID, n, nn);
                kunden.add(k);

            } else if (operation == 5) {
                for (Integer i = 0; i < kunden.size(); i++) {
                    System.out.println("\n" + (i+1) + ". Kunde: " + kunden.get(i));
                }
            } else if (operation == 6) {
                System.out.println("Geben Sie die BuergerID ein.");
                String bID = sc.nextLine();
                while(!Person.checkBuergerID(bID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die 7-stellige BuergerID ein. (Es muss nur aus Ziffern bestehen.)");
                    bID = sc.nextLine();
                };
                int kIndex = kunden.indexOf(new Kunde(bID));
                if (kIndex == -1) {
                    System.out.println("Person konnte nicht gefunden werden");
                }
                else {
                    System.out.println(kunden.get(kIndex));
                }
            } else if (operation == 7) {
                System.out.println("Geben Sie die PaketID ein.");
                String pID = sc.nextLine();
                while(!Reisepaket.checkPaketID(pID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die PaketID ein. (Es muss nur aus Ziffern bestehen.)");
                    pID = sc.nextLine();
                };

                System.out.println("Geben Sie die Destination ein.");
                String destination = sc.nextLine();

                System.out.println("Geben Sie das Datum ein. (dd/mm/yyyy)");
                String datum = sc.nextLine();

                System.out.println("Geben Sie das Dauer ein.");
                String dauer = sc.nextLine();

                System.out.println("Geben Sie das Preis ein.");
                String preis = sc.nextLine();

                Reisepaket r = new Reisepaket(pID, destination, datum, dauer, preis);
                reisepakete.add(r);


            } else if (operation == 8) {
                for (Integer i = 0; i < reisepakete.size(); i++) {
                    System.out.println("\n" + (i+1) + ". Reisepaket: " + reisepakete.get(i));
                }
            } else if (operation == 9) {
                System.out.println("Geben Sie die PaketID ein.");
                String pID = sc.nextLine();
                while(!Reisepaket.checkPaketID(pID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die PaketID ein. (Es muss nur aus Ziffern bestehen.)");
                    pID = sc.nextLine();
                };
                int pIndex = reisepakete.indexOf(new Reisepaket(pID));
                if (pIndex == -1) {
                    System.out.println("Reisepaket konnte nicht gefunden werden");
                }
                else {
                    System.out.println(reisepakete.get(pIndex));
                }

            } else if (operation == 10) {
                System.out.println("Geben Sie die PaketID ein.");
                String pID = sc.nextLine();
                while(!Reisepaket.checkPaketID(pID)) {
                    System.out.println("Falsch Format! Bitte geben Sie die PaketID ein. (Es muss nur aus Ziffern bestehen.)");
                    pID = sc.nextLine();
                };
                int pIndex = reisepakete.indexOf(new Reisepaket(pID));
                if (pIndex == -1) {
                    System.out.println("Reisepaket konnte nicht gefunden werden");
                }
                else {
                    System.out.println("Geben Sie die preis ein.");
                    String preis = sc.nextLine();
                    Reisepaket r = (Reisepaket) reisepakete.get(pIndex);
                    r.setPreis(preis);
                }

            } else if (operation == 11) {
                System.out.println("Geben sie die Buerger ID ein:");
                String bid = sc.nextLine();
                int index = kunden.indexOf(new Kunde(bid));
                if (index == -1) {
                    System.out.println("Kunde konnte nicht gefunden werden");
                }
                else {
                    Kunde k = kunden.get(index);
                    System.out.println("Geben sie die Reisepaket ID ein:");
                    String rid = sc.nextLine();
                    index = reisepakete.indexOf(new Reisepaket(rid));
                    if (index == -1) {
                        System.out.println("Reisepaket konnte nicht gefunden werden");
                    }
                    else {
                        Reisepaket rp = reisepakete.get(index);
                        k.addReisePaket(rp);
                    }
                }
            } else if (operation == 12) {
                System.out.println("Geben sie die Buerger ID ein");
                String bid = sc.nextLine();
                int index = kunden.indexOf(new Kunde(bid));
                if (index == -1) {
                    System.out.println("Kunde konnte nicht gefunden werden");
                }
                else {
                    Kunde k = kunden.get(index);
                    System.out.println(k.getReisepakete());
                }

            }
        }

    }

}