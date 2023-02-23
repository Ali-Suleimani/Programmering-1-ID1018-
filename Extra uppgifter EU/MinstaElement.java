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
			System.out.println("det minsta elementet är" + m + ".");

	}
	// min returnerar det minsta elementet i en sekventiellsamling.
	// Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException.
	public static int min (int[] element)throws IllegalArgumentException
	{
		if (element.length == 0)
		throw new IllegalArgumentException ("tom samling");

		// hör ihop med spårutskriften 2:
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
			// skilj ur en delsekvens med de tänkbara elementen
			i = 0;
			j = 0;

			while (j < antaletPar)
			{
				delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];
				i += 2;
			}

             //Byt if satsen med if satsen från boken, sidan 212
			if (antaletOparadeElement == 1)
			delsekvens[j] = sekvens[2 * sekvens.length + antaletOparadeElement -1];

			// utgå nu ifrån delsekvensen
			sekvens = delsekvens;
			antaletPar = antaletTankbaraElement /2;
			antaletOparadeElement = antaletTankbaraElement % 2;
			antaletTankbaraElement = antaletPar +antaletOparadeElement;

			// spårutskrift 1 –för att följasekvensen
			System.out.println (java.util.Arrays.toString (sekvens));

			// spårutskrift 2 -för att avsluta loopen i förväg
			// (för att kunna se vad som händer i början)
			 if (antalVarv++ == 10)
			 System.exit (0);
		}

		// sekvens[0] är det enda återstående tänkbara elementet
		//-det är det minsta elementet
		return sekvens[0];

	}

}