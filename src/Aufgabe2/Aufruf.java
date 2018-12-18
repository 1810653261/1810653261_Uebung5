package Aufgabe2;

public class Aufruf {
    public static void main(String [] args){
        Mensch alex1 = new Mensch("Alex", "Joachimstaller", 18);
        alex1.Status();

        Student alex2 = new Student("Alex", "Joachimstaller", 18, 1810653261, "Web");
        alex2.Status();
    }
}
