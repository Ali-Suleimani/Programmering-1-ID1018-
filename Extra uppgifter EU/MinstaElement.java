//demo java
public class MinstaElement
{
	public static void main (String []args)
		{
			int [] element = {50, 60, 40, 10, 11, 15, 5, 9, 14, 16, 12, 17, 18,
			                  34, 45, 33, 13};

			System.out.println(java.util.Arrays.toString (element));

			//det minsta elementet
			int m = min (element);
			System.out.println("det minsta elementet �r" + m + ".");

	}
	// min returnerar det minsta elementet i en sekventiellsamling.
	// Om samlingen �r tom, kastas ett undantag av typen IllegalArgumentException.
	public static int min (int[] element)throws IllegalArgumentException
	{
		if (element.length == 0)
		throw new IllegalArgumentException ("tom samling");

		// h�r ihop med sp�rutskriften 2:
		int    m = element[0];

		int[]    sekvens = element;
		int      antaletPar = sekvens.length / 2;
		int      antaletOparadeElement = sekvens.length % 2;
		int      antaletTankbaraElement =antaletPar +antaletOparadeElement;
		int[]    delsekvens = new int[antaletTankbaraElement];
		int      i = 0;
		int      j = 0;

		while (antaletPar >1)
		{
			// skilj ur en delsekvens med de t�nkbara elementen
			i = 0;
			j = 0;

			while (j < antaletPar)
			{
				delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];
				i += 2;
			}

             //Byt if satsen med if satsen fr�n boken, sidan 212
			if (antaletOparadeElement == 1)
			delsekvens[j] = sekvens[2 * sekvens.length + antaletOparadeElement -1];

			// utg� nu ifr�n delsekvensen
			sekvens = delsekvens;
			antaletPar = antaletTankbaraElement /2;
			antaletOparadeElement = antaletTankbaraElement % 2;
			antaletTankbaraElement = antaletPar +antaletOparadeElement;

			// sp�rutskrift 1 �f�r att f�ljasekvensen
			System.out.println (java.util.Arrays.toString (sekvens));

			// sp�rutskrift 2 -f�r att avsluta loopen i f�rv�g
			// (f�r att kunna se vad som h�nder i b�rjan)
			 if (antalVarv++ == 10)
			 System.exit (0);
		}

		// sekvens[0] �r det enda �terst�ende t�nkbara elementet
		//-det �r det minsta elementet
		return sekvens[0];

	}

}