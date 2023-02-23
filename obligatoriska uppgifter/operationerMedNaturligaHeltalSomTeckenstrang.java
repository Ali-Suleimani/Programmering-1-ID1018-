//Demo java
import java.util.*;
import static java.lang.System.out;
class operationerMedNaturligaHeltalSomTeckenstrang
{
	public static void main (String[]args)
	{
		out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
		// mata in två naturliga heltal
		Scanner    in = new Scanner (System.in);
		out.println ("två naturliga heltal:");
		String    tal1 = in.next ();
		String    tal2 = in.next ();
		out.println ();
		// addera heltalenoch visa resultatet
		String    summa = addera (tal1, tal2);
		visa (tal1, tal2, summa, '+');
		// subtrahera heltalen och visa resultatet
		//koden här
		String värdet = subtrahera (tal1, tal2);
		visa (tal1, tal2, värdet, '-');

	}
	// addera tar emot två naturliga heltal givna somteckensträngar, och returnerar deras
	// summa somen teckensträng.
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
		//utför om första heltalet är längre
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
			//utför om det andra heltalet är längre
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
	// subtrahera tar emot två naturliga heltal givna somteckensträngar, och returnerar
	// deras differens somen teckensträng.
	// Det första heltalet är inte mindre än det andra heltalet.

	public static String subtrahera (String tal1, String tal2)
	{
		StringBuilder tal = new StringBuilder ("");
		int siffra1 = 0;
		int siffra2 = 0;
		int värdet = 0;
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
		// sätt en lämplig längd på heltalen och resultatet
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
	// sattLen lägger till ett angivet antal mellanslagi början av en given sträng
	public static String sattLen (String s, int antal)
	{
		StringBuilder    sb = new StringBuilder (s);
		for (int i = 0; i < antal; i++)
		sb.insert (0, " ");

		return sb.toString ();
	}
}
