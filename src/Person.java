public abstract class Person{
    private String buergerID;
    private String name;
    private String nachname;
    private Integer alter;
    public void setBuergerID(String buergerID) {
        this.buergerID = buergerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(Integer alter) {
        if(alter > 0 && alter < 150) {
            this.alter = alter;
        }
    }
    public String getBuergerID() {
        return buergerID;
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public Integer getAlter() {
        return alter;
    }


    @Override
    public boolean equals(Object x) {
        Person temp = (Person) x;
        return buergerID.equals(temp.getBuergerID());
    }

    public static Boolean checkBuergerID(String bID) {
        return bID.matches("[1-9][0-9]{6}");
    }

    public static Boolean checkName(String n) {
        return n.matches("[a-zA-Z .]{2,}");
    }

    public static Boolean checkNachName(String nn) {
        return nn.matches("[a-zA-Z]{2,}");
    }

    public Person(String buergerID) {
        this.buergerID = buergerID;
    }
    public Person(String buergerID, String name) {
        this.buergerID = buergerID;
        this.name = name;
    }
    public  Person(String buergerID, String name, String nachname) {
        this.buergerID = buergerID;
        this.name = name;
        this.nachname = nachname;
    }

}
