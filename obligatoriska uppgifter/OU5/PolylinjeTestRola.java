import java.util.*;
import java.io.*;   //PrintWriter

public class PolylinjeTestRola
{
    public  static  void  main (String [] args)
    {
        PrintWriter     out = new  PrintWriter (System.out , true);

        // test a constructor  and a transformer
        Punkt     p1 = new  Punkt ("A", 5, 6);
        Punkt     p2 = new  Punkt ("B", 3, 7);
        Punkt     p3 = new  Punkt ("C", 4, 1);
        Punkt     p4 = new  Punkt ("D", -5, 9);
        Punkt     p5 = new  Punkt ("E", 1, -6);
        Punkt[] polylinje = {p1, p2, p3, p4, p5};
        Polylinje pol = new Polylinje(polylinje);

        out.println (pol);

        //test inspectors
        String     c = pol.getFarg();
        int     w = pol.getBredd();
        Punkt[] v = pol.getHorn();

        for (int i = 0; i < polylinje.length; i++) {
            System.out.print(polylinje[i] + " ");
        }
        out.println(" ");
        out.println ( c + " " + w + " ");

        //test mutators
        pol.setFarg  ("Red");
        pol.setBredd  (5);
        out.println (pol.getFarg() + " " + pol.getBredd());

        //test l?ngd
        double     lan = pol.langd();
        System.out.println(lan);

        //test laggTill
        Punkt lastPoint = new Punkt("F", 99, 99);
        pol.laggTill(lastPoint);
        System.out.println(pol);

        //test laggTillFramfor
        Punkt somePoint = new Punkt("G", 100, 100);
        pol.laggTillFramfor(somePoint, "D");
        System.out.println(pol);

        //test taBort
        pol.taBort("D");
        System.out.println(pol);

       //test iterator
        Polylinje.PolylinjeIterator iterator = pol.new PolylinjeIterator();

        while (iterator.finnsHorn())
        {
            System.out.println(iterator.horn());
            iterator.gaFram();
        }
    }
}