package Aufgabe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aufruf
{
    public static void main (String[]args)
    {
        List<Auto> liste1= new ArrayList<>();
        liste1.add(new Auto( (short) 4,"blau",(short)190,(short)5,(short)6,"Audi"));
        liste1.add(new Auto( (short) 4,"green",(short)125,(short)5,(short)4,"Skoda"));
        liste1.add(new Auto( (short) 4,"yellow",(short)150,(short)5,(short)8,"VW"));
        liste1.add(new Auto( (short) 4,"pink",(short)90,(short)3,(short)10,"Mercedes"));
        liste1.add(new Auto( (short) 4,"grey",(short)450,(short)3,(short)12,"BMW"));
        Collections.sort(liste1);


        for (Auto a: liste1)
        {
            System.out.println(a);
        }

    }
}
