//Demo java
import java.util.*;
import static java.lang.System.out;
class testaKod
{

    public static void main(String[] args)
    {
        System.out.println("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");// mata in två naturliga heltal
        Scanner in = new Scanner(System.in);
        System.out.println("två naturliga heltal:");
        String tal1 = in.next();
        String tal2 = in.next();
        System.out.println();// addera heltalen och visa resultatet
        String summa = addera(tal1, tal2);
        visa(tal1, tal2, summa, '+');// subtrahera heltalen och visa resultatet
        String differens = subtrahera(tal1, tal2);
        visa(tal1, tal2, differens, '-');
    }
     public static String addera(String tal1, String tal2)
	    {
	        int len1 = tal1.length();
	        int len2 = tal2.length();
	        int maxLen = Math.max(len1, len2); //största av len1, len2 och len
	        tal1 = sattLen(tal1, maxLen - len1);
	        tal2 = sattLen(tal2, maxLen - len2);
	        //tal1.substring(tal1.length() - 1);
	        //tal1.charAt(maxLen-1);
	        int minnessiffra = 0;
	        int siffra;
	        String resultat = "";

	        for (int i = maxLen - 1; i >= 0; i--)
	        {
	            char a = tal1.charAt(i);
	            char b = tal2.charAt(i);
	            int a1 = 0;
	            if (a != ' ')
	            {
	                a1 = a - '0';
	            }
	            int b1 = 0;

	            if (b != ' ')
	            {
	                b1 = b - '0';
	            }
	            siffra = a1 + b1;
	            if (minnessiffra == 1)
	            {
	                siffra = minnessiffra;
	            }
	            if (siffra >= 10)
	            {
	                minnessiffra = 1;
	                siffra = 10;
	            }
	            else
	            {
	                minnessiffra = 0;
	            }

	            resultat = siffra + resultat;
	        }

	        if (minnessiffra == 1)
	        {
	            resultat = 1 + resultat;
	        }

	        return resultat;
       }
     public static String subtrahera(String tal1, String tal2)
	    {

	        int len1 = tal1.length();
	        int len2 = tal2.length();
	        int maxLen = Math.max(len1, len2); //största av len1, len2 och len
	        tal1 = sattLen(tal1, maxLen - len1);
	        tal2 = sattLen(tal2, maxLen - len2);
	        //tal1.substring(tal1.length() - 1);
	        //tal1.charAt(maxLen-1);
	        int minnessiffra = 0;
	        int siffra;
	        String resultat = "";

	        for (int i = maxLen - 1; i >= 0; i--)
	        {
	            char a = tal1.charAt(i);
	            char b = tal2.charAt(i);
	            int a1 = 0;
	            if (a != ' ')
	            {
	                a1 = a - '0';
	            }
	            int b1 = 0;
	            if (b != ' ')
	            {
	                b1 = b - '0';
	            }

	            if (minnessiffra == 1)
	            {
	                a1 -= 1;
	                minnessiffra = 0;
	            }

	            siffra = a1 - b1;
	            if (siffra < 0)
	            {
	                siffra += 10;
	                minnessiffra = 1;
	            }

	            /*if (i == 0 && siffra == 0)
	            {
	                break;
	            }*/
	            resultat = siffra + resultat;

	        }

	        return resultat;

	    }
	// visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation
	// utförd i samband med hetalen

	    public static void visa(String tal1, String tal2, String resultat, char operator)
	    {
	// sätt en lämplig längd på heltalen och resultatet
	        int len1 = tal1.length();
	        int len2 = tal2.length();
	        int len = resultat.length();
	        int maxLen = Math.max(Math.max(len1, len2), len); //största av len1, len2 och len
	        tal1 = sattLen(tal1, maxLen - len1);
	        tal2 = sattLen(tal2, maxLen - len2);
	        resultat = sattLen(resultat, maxLen - len);
	// visa heltalen och resultatet
	        System.out.println("  " + tal1);
	        System.out.println("" + operator + " " + tal2);
	        for (int i = 0; i < maxLen + 2; i++)
	        {
	            System.out.print("-");
	        }
	        out.println();
	        System.out.println("  " + resultat + "\n");
	    }
	// sattLen lägger till ett angivet antal mellanslag i början av en given sträng

	    public static String sattLen(String s, int antal)
	    {
	        StringBuilder sb = new StringBuilder(s);
	        for (int i = 0; i < antal; i++)
	        {
	            sb.insert(0, " ");
	        }
	        return sb.toString();
	    }
	}

