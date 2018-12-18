package Aufgabe1;

public abstract class Säugetier {
    // Attribute
    private String name;
    private int alter;
    private String geschlecht;
    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    //Konstruktor mit den Attributen erstellt
    public Säugetier(String name, int alter, String geschlecht){
        this.name=name;
        this.alter=alter;
        this.geschlecht=geschlecht;
    }
    // Abstrakte Methode mit String rückgabewert erstellt
    public abstract String printAll();
}


