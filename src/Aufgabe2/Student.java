package Aufgabe2;

// Klasse student und erbung
public class Student extends Mensch {
    private int martikelnummer;
    private String studiengang;
    // Konstruktor
    public Student(String vorname, String nachname, int alter, int martikelnummer, String Studiengang) {
        super(vorname, nachname, alter);
        this.martikelnummer=martikelnummer;
        this.studiengang=studiengang;
    }
    //Getter und Setter
    public int getMartikelnummer() {
        return martikelnummer;
    }

    public void setMartikelnummer(int martikelnummer) {
        this.martikelnummer = martikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
    @Override
    public void Status(){
        System.out.println("Es handelt sich um einen Studenten, sein vorname ist " + getVorname() + " sein Nachname lautet " + getNachname() + " sein alter beträgt " + getAlter() + "Jahre" + "Seine Martikelnummer ist: " + getMartikelnummer() + " und besucht den Studiengan: " + getStudiengang());
    }
}
