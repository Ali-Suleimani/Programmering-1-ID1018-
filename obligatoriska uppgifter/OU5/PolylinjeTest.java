//Demo java
import java.util.*;
import java.io.*; //PrintWriter;

public class PolylinjeTest{

  public static void main (String[] args){
  PrintWriter out = new PrintWriter (System.out, true);
  out.println("PolylinjeTest");

  //Testar att skapa 3 hörn som matas in i polylinje
  Punkt p1 = new Punkt ("A", 2, 5),
	    p2 = new Punkt ("B", 3, 3),
	    p3 = new Punkt ("C", 4, 6),
	    p4 = new Punkt ("D", 5, 7);
	    Punkt [] polylinje = {p1, p2, p3, p4};
	    Polylinje pol = new Polylinje(polylinje);
	    out.println (pol);

	    //create an inspector
	    String f = pol.getFarg();
	    int    b = pol.getBredd();
	    Punkt[] h = pol.getHorn();

	    for (int i = 0; i < polylinje.length; i++)
	    {
			System.out.print(polylinje[i]+ " ");
		}
		out.println (" ");
		out.println ( f + " " + b + " ");

		//test the mutators
		pol.setFarg ("red");
		pol.setBredd (2);
		out.println (pol.getFarg() + " " + pol.getBredd());

		//Test längd
		double len = pol.langd ();
		System.out.println(len);

		//laggtill
		Punkt lastPoint = new Punkt("F", 99, 99);
		pol.laggTill(lastPoint);
		System.out.println(pol);

		//laggTillFramfor
		Punkt somePoint = new Punkt ("G", 100, 100);
		pol.laggTillFramfor(somePoint, "D");
		System.out.println(pol);

		//taBort
		pol.taBort("D");
		System.out.println(pol);

		//testa polylinjeIterator
		Polylinje.PolylinjeIterator iterator = pol.new PolylinjeIterator();
		while (iterator.finnsHorn())
		{
			System.out.println(" " + iterator.horn());
			iterator.gaFram();
		}

    }
}















