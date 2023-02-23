//Demo java
class ElementSortering
{
	public static void main (String []args)
	{
		int [] sortera = {50, 20, 10, 45, 12, 16, 19, 51, 7, 14, 18, 19, 23};
		System.out.println(java.util.Arrays.toString (sortera));

		//vi ska sortera elementen utifr�n deras storlek
		sort (sortera);
		System.out.println("det minsta elementet �r");

	}

	public static void sort (int[] sortera)
	{
		//positioenen f�r det aktuella minsta element
		int minpos = 0;

		//en hj�lpvariabel som anv�nds n�r tv� element byter plats
		int e = 0;

		//fyll positionerna med r�tt element
		for (int pos = 0; pos < sortera.length - 1; pos++)
		{
			//best�m position for det minsta i den j�rf�rbara delsekvensen
			minpos = pos;
			for (int p = pos +1; p < sortera.length; p++)

				if (sortera[p] < sortera[minpos])
				minpos = p;

				//bytplast mellan det minsta och det f�srta element
				e = sortera[pos];
				sortera[pos] = sortera[minpos];
				sortera[minpos] = e;


		}
	}
}