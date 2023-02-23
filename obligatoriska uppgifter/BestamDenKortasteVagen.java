//Demo java
import java.util.*;
class BestamDenKortasteVagen
{
    public static void main (String[]args)
    {

		System.out.println("mata in antal mellanstationer i Z2 ");
		Scanner in = new Scanner (System.in);
		int z2 = in.nextInt();
		System.out.println("mata in antal mellanstationer i z3");
		int z3 = in.nextInt();
		System.out.println("mata in antal vägar i z2 och z3");

		double[] a = new double[z2];
		double[][] b = new double[z2][z3];
		double[] c = new double[z3];
		//double [] d = new double[z4];

		for (int i = 0; i < z2;i++)
		{
			a[i] = in.nextDouble();
			for (int j = 0; j < z3; j++)
			{
				b[i][j] = in.nextDouble();
			}
		 }
		//metod för z3 0ch z4
		for (int i = 0; i < z3;i++)
		{
			c[i]= in.nextDouble();

		}

		double station = DenKortasteVagen.vaglangd(a,b,c);
		System.out.println("kortaste vägen är"+ station);
		int [] stationer = DenKortasteVagen.mellanstationer(a,b,c);
		System.out.println("U" + stationer [0] + " V" + stationer[1]);
	}
 }
