//Demo java
import java.util.*;
class EnTriangelOchDessCirklar
{
	public static void main (String[]args)
	{
		System.out.println("mata in sidorna p� triangeln");

		Scanner in = new Scanner (System.in);

		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();

		System.out.println("mata in vinklarna p� triangeln");
		//System.out.println("mata in vinklarna p� den yttre triangeln");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		//omvandla vinklar till radianer
		a = Math.toRadians (a);
		b = Math.toRadians (b);
		c = Math.toRadians (c);

		//ber�kna arean

		double area = Triangeln.area1(A,B,C);
        System.out.println("arean av triangeln �r:" + area);

        //ber�kna Omkretsen
        double omkrets = Triangeln.omkrets1(A,B,C);
        System.out.println("omkretsen av triangeln �r:" + omkrets);

        // ber�kna bisektrisen
        double bisektris = Triangeln.bisektris (B,C, a);
        System.out.println("besektrisen �r" + bisektris);

        // ber�kna radianen p� den inre cirkeln
        double inreRadian = Triangeln.inreRadian (A, B, C);
        System.out.println("radianen p� inre cirklen �r" + inreRadian);

        //Bere�kna radianer p� de yttre cirkeln
        double yttreRadianer = Triangeln.yttreRadian (A, B, C);
        System.out.println(" radianen p� den yttrecirklen �r:" + yttreRadianer);

        //ber�kna medianen p� trianglarna
        double median1 = Triangeln.median1 (A, B, C);
        System.out.println("median1 p� triangeln �r:" + median1);

        double median2 = Triangeln.median1 (A, B, C);
        System.out.println("median2 p� triangeln �r:" + median2);

        double median3 = Triangeln.median3 (A, B, C);
        System.out.println(" median3 p� trangeln �r:" + median3);
	}
}