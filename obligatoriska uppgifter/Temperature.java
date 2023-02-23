//Demo.java
import java.util.*;
class Temperature
{
   public static void main(String[]args)
   {
   		System.out.println("TEMPERATUR");

   		Scanner in = new Scanner (System.in);
   		in.useLocale (Locale.US);

   		//mata in antal veckor
   		System.out.println("Mata in antal veckor");
   		int antalVeckor = in.nextInt();

   		//mata in antal mätningar per vecka
   		System.out.print("Mata in antal mätningar per vecka");
   		int antalMatningarPerVecka = in.nextInt();

   		//plats att lagra temperaturer
   		double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];


   		//mata in antal temperaturerna för varje vecka
   		for (int vecka = 1; vecka <= antalVeckor; vecka ++)
   		{
   			System.out.println (" tempraturer för vecka " + vecka + ":");
   			for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
   			t[vecka][matning] = in.nextDouble ();
   		}

   		System.out.println ();

   		//Visa den minsta, största och medeltempraturen, veckovis
   		System.out.println("minsta, största, medel och summan av temperaturerna för varje vecka");
   		double[] minT = new double[antalVeckor + 1];
   		double[] maxT = new double[antalVeckor + 1];
    	double[] sumT = new double[antalVeckor + 1];
    	double[] medelT = new double[antalVeckor + 1];

        for (int vecka = 1; vecka <= antalVeckor; vecka++)
        {
			minT[vecka]   = t[vecka][1];
			medelT[vecka] = t[vecka][1];
			maxT[vecka]   = t[vecka][1];
			sumT[vecka]   = t[vecka][1];
			for (int matning = 2; matning <= antalMatningarPerVecka; matning++)
	        {
				if (t[vecka][matning] < minT[vecka])
				{
					 minT[vecka] = t[vecka][matning];
				}

				if (t[vecka][matning] > maxT[vecka])
				{
				   maxT[vecka] = t[vecka][matning];
				}

				sumT[vecka] += t[vecka][matning];
           }
	       medelT[vecka]= sumT[vecka] / antalMatningarPerVecka;

	    System.out.println( minT[vecka]);
	    System.out.println( maxT[vecka]);
	    System.out.println( medelT[vecka]);
        }

    	//Visa den minsta, den största och medeltemperaturen, hela mätperioden
    	System.out.println("största, minsta och medeltemperaturen för hela perioden");
    	double minTemp = minT[1];
    	double maxTemp = maxT[1];
    	double sumTemp = sumT[1];
    	double medelTemp = 0;

  		 for (int vecka = 2; vecka <= antalVeckor; vecka++)
  		 {
				if (minT[vecka] < minTemp)

				minTemp = minT[vecka];

				if (maxT[vecka] > maxTemp)
				maxTemp = maxT[vecka];

				sumTemp += sumT[vecka];
	     }
	     medelTemp =  sumTemp / (antalVeckor*antalMatningarPerVecka);

   		 System.out.println(minTemp);
   		 System.out.println(maxTemp);
    	 System.out.println(medelTemp);
   }
}