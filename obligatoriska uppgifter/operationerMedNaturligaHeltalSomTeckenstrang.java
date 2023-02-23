//Demo java
import java.util.*;
import static java.lang.System.out;
class operationerMedNaturligaHeltalSomTeckenstrang
{
	public static void main (String[]args)
	{
		out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
		// mata in tv� naturliga heltal
		Scanner    in = new Scanner (System.in);
		out.println ("tv� naturliga heltal:");
		String    tal1 = in.next ();
		String    tal2 = in.next ();
		out.println ();
		// addera heltalenoch visa resultatet
		String    summa = addera (tal1, tal2);
		visa (tal1, tal2, summa, '+');
		// subtrahera heltalen och visa resultatet
		//koden h�r
		String v�rdet = subtrahera (tal1, tal2);
		visa (tal1, tal2, v�rdet, '-');

	}
	// addera tar emot tv� naturliga heltal givna somteckenstr�ngar, och returnerar deras
	// summa somen teckenstr�ng.
	public static String addera (String tal1, String tal2)
	{

		StringBuilder tal = new StringBuilder ("");
		int siffra1 = 0;
		int siffra2 = 0;
		int sum = 0;
		int siffra = 0;
		int minnessiffra = 0;
		int pos1 = tal1.length () -1;
		int pos2 = tal2.length () - 1;
		while (pos1 >= 0 && pos2 >= 0)
		{
			siffra1 = tal1.charAt (pos1) - 48;
			siffra2 = tal2.charAt (pos2) - 48;
			sum = minnessiffra + siffra1 + siffra2;
			siffra = sum % 10;
			tal.insert(0, siffra);
			minnessiffra = sum/10;
			pos1--;
			pos2--;
		}
		while (pos1>= 0)
		//utf�r om f�rsta heltalet �r l�ngre
		{
			siffra1 = tal1.charAt (pos1) - 48;
			sum = minnessiffra + siffra1;
			siffra = sum % 10;
			tal.insert (0, siffra);
			minnessiffra = sum/10;
			pos1--;
		}
		while (pos2 >= 0)
		{
			//utf�r om det andra heltalet �r l�ngre
			siffra2 = tal2.charAt (pos2) - 48;
			sum = minnessiffra + siffra2;
			siffra = sum % 10;
			tal.insert (0, siffra);
			minnessiffra = sum/ 10;
			pos2--;
		}
		if (minnessiffra > 0)
		{
			tal.insert(0, minnessiffra);

		}
     return tal.toString();
  }
	// subtrahera tar emot tv� naturliga heltal givna somteckenstr�ngar, och returnerar
	// deras differens somen teckenstr�ng.
	// Det f�rsta heltalet �r inte mindre �n det andra heltalet.

	public static String subtrahera (String tal1, String tal2)
	{
		StringBuilder tal = new StringBuilder ("");
		int siffra1 = 0;
		int siffra2 = 0;
		int v�rdet = 0;
		int siffra = 0;
		int borrow = 0;
		int pos1 = tal1.length () -1;
		int pos2 = tal2.length () - 1;
		int    len1 = tal1.length ();
		int    len2 = tal2.length ();
		int    len  = resultat.length ();
		int    maxLen = Math.max (Math.max (len1, len2), len);
		int    maxLen = Math.max (len1, len2);
		tal1 = sattLen (tal1, maxLen -len1);
		tal2 = sattLen (tal2, maxLen -len2);
		int minnessiffra = 0;
		int siffra;



		while (pos1 >= 0 && pos2 >= 0)
		{
			siffra1 = tal1.charAt (pos1) - 48;
		    siffra2 = tal2.charAt (pos2) - 48;
		    pos1--;
		    pos2--;
		    borrow = 0;

			if (siffra1 < siffra2 && borrow != 1)
			{
				siffra = siffra1 + 10;
			    siffra = siffra - siffra2;
				tal.insert(0, siffra);
				borrow = 1;
			}

			else
            {
				siffra = siffra1 - siffra2;
                tal.insert(1, siffra);
                borrow = 0;
			}

		}


		while (pos1 >= 0 && pos2 < 0)
		{
			siffra1 = tal1.charAt(pos1) - 48;
			if (borrow ==0)
			{
				siffra = tal1.charAt(pos1) - 48;
				tal.insert(0, siffra);
			}
			if (borrow == 1 && siffra1 == 0)
			{
				tal.insert(0, 9);
			}
			if (borrow == 1 && siffra1 !=0)
			{
				siffra = (tal1.charAt(pos1)- 48) -1;
				tal.insert(0, siffra);
			}
			pos1 --;
			pos2--;
		}

	}

	public static void visa (String tal1, String tal2,String resultat, char operator)
	{
		// s�tt en l�mplig l�ngd p� heltalen och resultatet
		int    len1 = tal1.length ();
		int    len2 = tal2.length ();
		int    len  = resultat.length ();
		int    maxLen = Math.max (Math.max (len1, len2), len);
		tal1 = sattLen (tal1, maxLen -len1);
		tal2 = sattLen (tal2, maxLen -len2);
		resultat = sattLen (resultat, maxLen -len);
		// visa heltalen och resultatet

		out.println ("  " + tal1);
		out.println ("" + operator + " " + tal2);
		for (int i = 0; i < maxLen + 2; i++)
		out.print ("-");
		out.println ();
		out.println ("  " + resultat + "\n");
	}
	// sattLen l�gger till ett angivet antal mellanslagi b�rjan av en given str�ng
	public static String sattLen (String s, int antal)
	{
		StringBuilder    sb = new StringBuilder (s);
		for (int i = 0; i < antal; i++)
		sb.insert (0, " ");

		return sb.toString ();
	}
}
