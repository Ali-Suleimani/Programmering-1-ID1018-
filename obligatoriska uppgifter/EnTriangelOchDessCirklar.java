//Demo java
import java.util.*;
class EnTriangelOchDessCirklar
{
	public static void main (String[]args)
	{
		System.out.println("mata in sidorna på triangeln");

		Scanner in = new Scanner (System.in);

		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();

		System.out.println("mata in vinklarna på triangeln");
		//System.out.println("mata in vinklarna på den yttre triangeln");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		//omvandla vinklar till radianer
		a = Math.toRadians (a);
		b = Math.toRadians (b);
		c = Math.toRadians (c);

		//beräkna arean

		double area = Triangeln.area1(A,B,C);
        System.out.println("arean av triangeln är:" + area);

        //beräkna Omkretsen
        double omkrets = Triangeln.omkrets1(A,B,C);
        System.out.println("omkretsen av triangeln är:" + omkrets);

        // beräkna bisektrisen
        double bisektris = Triangeln.bisektris (B,C, a);
        System.out.println("besektrisen är" + bisektris);

        // beräkna radianen på den inre cirkeln
        double inreRadian = Triangeln.inreRadian (A, B, C);
        System.out.println("radianen på inre cirklen är" + inreRadian);

        //Bereäkna radianer på de yttre cirkeln
        double yttreRadianer = Triangeln.yttreRadian (A, B, C);
        System.out.println(" radianen på den yttrecirklen är:" + yttreRadianer);

        //beräkna medianen på trianglarna
        double median1 = Triangeln.median1 (A, B, C);
        System.out.println("median1 på triangeln är:" + median1);

        double median2 = Triangeln.median1 (A, B, C);
        System.out.println("median2 på triangeln är:" + median2);

        double median3 = Triangeln.median3 (A, B, C);
        System.out.println(" median3 på trangeln är:" + median3);
	}
}