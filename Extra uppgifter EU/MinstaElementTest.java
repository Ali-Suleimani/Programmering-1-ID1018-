//Demo java
import java.util.Scanner;
class MinstaElementTest
{
	public static void main (String []args)
	{
		// element är antal de elementen som är representerade, dvs representerar alla siffrorna
		int [] element = {50, 60, 40, 10, 11, 15, 5, 9, 14, 16, 12, 17, 18,
		                  34, 45, 33, 13};

		System.out.println(java.util.Arrays.toString (element));

		//det minsta elementet
		//vi sätter m till det misnta elementet
		int m = min (element);
		System.out.println("det minsta elementet är" + m + ".");
	}

		// min returnerar det minsta elementet i en sekventiellsamling.
			// Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException.
			public static int min (int[] element)throws IllegalArgumentException
			{
				// i if satsen kollar vi om selvenssamlingen är tomt genom att sätta element.length==0
				if (element.length == 0)
				throw new IllegalArgumentException ("tom samling");

				// hör ihop med spårutskriften 2:
				// här sätter vi m som minsta element i index noll
		        int    m = element[0];


                // här sätter vi den aktuella första elementet = 1 och kollar om den är mindre än övriga element
                // om den aktuella element är mindre än övriga ska ska vi kolla på övriga element
		        for (int pos = 1; pos < element.length; pos++)
		            if (element[pos] < m)
		            m = element[pos];
		            return m;

	}

}