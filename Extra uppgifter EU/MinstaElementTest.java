//Demo java
import java.util.Scanner;
class MinstaElementTest
{
	public static void main (String []args)
	{
		// element �r antal de elementen som �r representerade, dvs representerar alla siffrorna
		int [] element = {50, 60, 40, 10, 11, 15, 5, 9, 14, 16, 12, 17, 18,
		                  34, 45, 33, 13};

		System.out.println(java.util.Arrays.toString (element));

		//det minsta elementet
		//vi s�tter m till det misnta elementet
		int m = min (element);
		System.out.println("det minsta elementet �r" + m + ".");
	}

		// min returnerar det minsta elementet i en sekventiellsamling.
			// Om samlingen �r tom, kastas ett undantag av typen IllegalArgumentException.
			public static int min (int[] element)throws IllegalArgumentException
			{
				// i if satsen kollar vi om selvenssamlingen �r tomt genom att s�tta element.length==0
				if (element.length == 0)
				throw new IllegalArgumentException ("tom samling");

				// h�r ihop med sp�rutskriften 2:
				// h�r s�tter vi m som minsta element i index noll
		        int    m = element[0];


                // h�r s�tter vi den aktuella f�rsta elementet = 1 och kollar om den �r mindre �n �vriga element
                // om den aktuella element �r mindre �n �vriga ska ska vi kolla p� �vriga element
		        for (int pos = 1; pos < element.length; pos++)
		            if (element[pos] < m)
		            m = element[pos];
		            return m;

	}

}