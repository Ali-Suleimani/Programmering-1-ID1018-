
class Kostnad
{
	public static void main (String[] args)
	{
		//System.out.println("kostnad");
		//System.out.println();

		java.util.Scanner
		in = new java.util.Scanner (System.in);
		in.useLocale (java.util.Locale.US);

		System.out.print ("Antal böcker:");
		int   antal = in.nextInt ();
		System.out.print ("pris på böckerna: ");
		double  pris = in.nextDouble ();

		double   kostnad = antal * pris;

		System.out.println ("Den totala kostnaden: " + kostnad);
	}
}
