//Demo.java

import java.util.*;
class Heltalsmatris
{
public static void main (String []args)

{
	System.out.println("en heltalsmatris");

	Scanner in = new Scanner (System.in);
	in.useLocale (Locale.US);

	int [][] v = new int[3 + 1][3 + 1];
	System.out.println ("ange 12 heltal, 4 heltal per rad");

	for (int i = 0; i < v.length; i++)
		for (int j = 0; j < v[i].length; j++)
		v[i][j] = in.nextInt ();
	System.out.println();

	//största heltalet och heltalens medelvärde för varje rad

	int [] max = new int[v.length];
	double [] mean = new double[v.length];
	int  sum = 0;
	for (int i = 0; i < v.length; i++)
	{
		max[i] = v [i][0];
		sum = v[i][0];
		for (int j = 2; j < v[i].length; j++)
		{
		  if (v[i][j] > max[i])
		  max[i] = v[i][j];
		  sum += v[i][j];
		}
	mean[i] = (double) sum / (v[i].length - 1);
	}
  //visa resultat
  System.out.println("De största heltalen och medelvärdet- radvis");
  for (int i = 0; i < v.length; i++)
  System.out.printf ("%4d |  %7.2f\n", max[i], mean[i]);
  System.out.println ();

}

}