//Demo java
// min egen kod
import java.io.PrintWriter;
class punktTest
{
	public static void main(String[]args)
	{
	   PrintWriter out = new PrintWriter (System.out, true);
	   // testa en konstruktor och en transformator

	   Punkt p1 = new Punkt ("A", 3, 6);
	   Punkt p2 = new Punkt ("B", 5, 9);
	   out.println(p1 + " " + p2);
	   //tessta inspektorer

	   String n = p1.getNamn ();
	   double x = p1.getX ();
	   double y = p1.getY ();
	   out.println (n + " " + x + " " + y);

	   //testa en komparator och en kombinator
	   double d = p1.avstand (p2);
	   out.println ("avståndet mellan punkterna är den");
	   out.println (d);

	   // boolean b = p1.equals (p2);
	   //out.println (b);

	   String s1 = p1.toString();
	   String s2 = p2.toString();
	   boolean b = s1.equals(s2);
        out.println (b);

	   //testa en mutatorer

	   p2.setX (1);
	   p2.setY (2);
	   out.println(p2);

	   //testa en konstruktor
	   Punkt p = new Punkt (p1);
	   out.println (p);
	}
}
//Slut på kod




