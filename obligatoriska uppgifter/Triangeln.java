//Demo java
import java.util.*;

public class Triangeln
{
	/*Denna class beräknar Arean, omkretsen och bisektrisen av en triangel.
	Trangeln har även en omskriven cirkel kring triangeln och en inskriven cirkeln in i triangeln.
    Användaren matar in värdena för triangelns sidor och vinklar i grader.
    De matimatiska formlerna för beräkning av traingelns area, bisketris, cirklens radianer
    är hämtad från den här länken https://sv.wikipedia.org/wiki/Triangel*/

	//Användaren matar in och beräkna arean på triangeln. s är semiperimetern dvs triangelns halva omkrets
	public static double area1(double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double hello = Math.sqrt(s*(s - A)*(s - B)*(s-C));
		return hello;
	 }

    //Metod för att beräkna omkretsen
	public static double omkrets1(double A, double B, double C)
	{
		double m = (A + B + C);
		return m;
	}

	/*Bisektris  är en linje som delar vinkeln mellen två sidor i två lika delar.Användaren
	kan mata in längden på två vilka sidor som helts och får besiktris linjen*/
    public static double bisektris (double B , double C, double a)
	{
		double bis = 2 * B * C * Math.cos (a / 2);
		double bi = bis/ (B + C);
		return bi;
	}

    /*Metod för att beräkna radianen på den inre cirkeln. Den inskrivna cirkelns mittpunkt är
    bisektrise linjernas skärningspunkt.*/
    public static double inreRadian (double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double radian = Math.sqrt( (s-A)*(s-B)*(s-C)/s);
		return radian;
	}

	/*metod för att beräkna radianer på den yttre cirkeln. Den omskriva cirkelns centrum
	ligger i skärningspunkten av sidornas mittpunktsnormaler*/
    public static double yttreRadian (double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double f = A*B*C;
		double radian = f/(Math.sqrt(16*s*(s-A)*(s-B)*(s-C)));
		return radian;

	}

	/*Metod för att beräkna medianer på triangeln. Median är en linje från ett hörn som
	delar motstående sidan i två lika delar. Vi behöver tre metoder för att beräkna alla tre medianer på triangeln*/
	public static double median1 (double A, double B, double C)
	{
		double median = (0.5*Math.sqrt(2*B*B + 2*C*C - A*A));
		return median;
	}

	public static double median2 (double A, double B, double C)
	{
		double median = (0.5*Math.sqrt(2*A*A + 2*C*C - B*B));
		return median;

	}

	public static double median3 (double A, double B, double C)
	{
		double median = (0.5*Math.sqrt(2*A*A + 2*B*B - C*C));
		return median;
	}
}