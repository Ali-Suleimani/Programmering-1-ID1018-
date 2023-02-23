//Demo java
import java.util.Random;
class valjPolylinje
{
	public static final Random rand = new Random ();
	public static final int ANTAL_POLYLINJE = 10;

	public static void main (String []args)
	{
		// skapa ett antal slumpm�ssiga polylinjer
		Polylinje [] polylinjer = new Polylinje[ANTAL_POLYLINJE];
		for (int i = 0; i < ANTAL_POLYLINJE; i++)
		polylinjer[i] = slumpPolylinje ();

		//visa polylinjerna
		for ( int i = 0; i < polylinjer.length; i++)
		System.out.println("polylinjer: " + polylinjer[i] + "\n langd: " + polylinjer[i].langd());



		// best�m den kortaset av de polylinjerna
		Polylinje kortast = polylinjer[0];
		for ( int i = 0; i < polylinjer.length; i++)
		if ( polylinjer[i].getFarg() == "gul" && ( polylinjer[i].langd() < kortast.langd() || kortast.getFarg() != "gul" ) )
		kortast = polylinjer[i];

		// visa den valda polylinjen
		if (kortast.getFarg() != "gul")
		System.out.println(" kortaste gula polylinje: \n Det saknas gula polylinje");
		else
		System.out.println("kortaste gula polylinjen" + kortast+ "shjk" + kortast.langd());


	}

	//slumppunkt returnerar en punkt med ett slumpm�ssigt namn
	// det engelska alfabethet, och slumpm�ssiga koordinater

	public static Punkt slumpPunkt ()
	{
	  String n = "" + (char) (65 + rand.nextInt (26));
	  int x = rand.nextInt (11);
	  int y = rand.nextInt (11);
	  return new Punkt (n, x, y);

	}

	// slumpPolylinje returnerar en slumpm�ssig polylinje, varsf�rg �r antingen bl�, eller r�d
	//eller gul.Namn p� polylinjens h�rn �r stora bokst�ver i det engelskaalfabetet. Tv� h�rn
	//kan inte ha samma namn.

	public static Polylinje slumpPolylinje ()
	{
		// skapa en tom polylinje, och l�gg till h�rn till den
		Polylinje polylinje = new Polylinje ();
		int    antalHorn = 2 + rand.nextInt (7);
		boolean[] valdNamn = new boolean[26];

		Punkt valdPunkt = null;
		while (antalValdaHorn < antalHorn){
			valdPunkt = slumpPunkt();
			int index = valdPunkt.getNamn().charAt(0)-65;
			if(valdNamn[index] == false){
				polylinje.laggTill(valdPunkt);
				valdNamn[index] = true;

				antalValdaHorn++;

			}
		}

		//s�tt f�rg
		String farger[] = {"gul", "r�d", "bl�"};
		polylinje.setFarg(farger[rand.nextInt(3)]);
		return polylinje;



		/*char valtNamn[] = new char[antalHorn];

			for (int i = 0; i < antalHorn; i++)
			{
				boolean Available = !true;
				Punkt p = new Punkt(slumpPunkt());

				//While loop f�r kontolera om ett namn upprepas
				while (!Available)
				{
					Available = true;
					for(char n = 0; n < valtNamn.length; n++)
						if (p.getNamn().toCharArray()[0] == n)
						{
							Available = false;
							break;
						}
						else if (n == valtNamn[antalHorn - 1] || !Available)
							break ;

					   if (!Available)
						//generate new name and retry
						p = new Punkt(slumpPunkt());
				}

				valtNamn[i] = p.getNamn().toCharArray()[0];
				polylinje.laggTill(p);
			}
			// s�tt f�rg
			String farger[] = {"gul","rod","bla"};
			polylinje.setFarg(farger[rand.nextInt(3)]);

			return polylinje;*/
    }
}
