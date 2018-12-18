package Aufgabe1;

public class Mensch extends Säugetier {

    public Mensch(String name, int alter, String geschlecht){
        super(name, alter, geschlecht);
    }
    //Überschreiben der printall methode, mit # trennen, S für String, I für int
    @Override
    public String printAll() {
        return String.format("S#I#S", getName(), getAlter(), getGeschlecht());
    }
}

