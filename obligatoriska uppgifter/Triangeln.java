//Demo java
import java.util.*;

public class Triangeln
{
	/*Denna class ber�knar Arean, omkretsen och bisektrisen av en triangel.
	Trangeln har �ven en omskriven cirkel kring triangeln och en inskriven cirkeln in i triangeln.
    Anv�ndaren matar in v�rdena f�r triangelns sidor och vinklar i grader.
    De matimatiska formlerna f�r ber�kning av traingelns area, bisketris, cirklens radianer
    �r h�mtad fr�n den h�r l�nken https://sv.wikipedia.org/wiki/Triangel*/

	//Anv�ndaren matar in och ber�kna arean p� triangeln. s �r semiperimetern dvs triangelns halva omkrets
	public static double area1(double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double hello = Math.sqrt(s*(s - A)*(s - B)*(s-C));
		return hello;
	 }

    //Metod f�r att ber�kna omkretsen
	public static double omkrets1(double A, double B, double C)
	{
		double m = (A + B + C);
		return m;
	}

	/*Bisektris  �r en linje som delar vinkeln mellen tv� sidor i tv� lika delar.Anv�ndaren
	kan mata in l�ngden p� tv� vilka sidor som helts och f�r besiktris linjen*/
    public static double bisektris (double B , double C, double a)
	{
		double bis = 2 * B * C * Math.cos (a / 2);
		double bi = bis/ (B + C);
		return bi;
	}

    /*Metod f�r att ber�kna radianen p� den inre cirkeln. Den inskrivna cirkelns mittpunkt �r
    bisektrise linjernas sk�rningspunkt.*/
    public static double inreRadian (double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double radian = Math.sqrt( (s-A)*(s-B)*(s-C)/s);
		return radian;
	}

	/*metod f�r att ber�kna radianer p� den yttre cirkeln. Den omskriva cirkelns centrum
	ligger i sk�rningspunkten av sidornas mittpunktsnormaler*/
    public static double yttreRadian (double A, double B, double C)
	{
		double s = (A+B+C)/2;
		double f = A*B*C;
		double radian = f/(Math.sqrt(16*s*(s-A)*(s-B)*(s-C)));
		return radian;

	}

	/*Metod f�r att ber�kna medianer p� triangeln. Median �r en linje fr�n ett h�rn som
	delar motst�ende sidan i tv� lika delar. Vi beh�ver tre metoder f�r att ber�kna alla tre medianer p� triangeln*/
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