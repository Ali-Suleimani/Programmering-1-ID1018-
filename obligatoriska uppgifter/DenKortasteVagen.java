//Demo java
class DenKortasteVagen
{
    public static double vaglangd(double a[], double b[][], double c[])
    {
		//beräkna avståndet di mellan startstation och destination
		double kortasteVaglangd = a[0]+b[0][0]+c[0];
		double vaglangd = 0;

		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = 0; j < b.length - 1; j++)
			{
			   vaglangd = a[i]+b[i][j]+c[j];

				if (vaglangd > kortasteVaglangd)
				{
					kortasteVaglangd = vaglangd;
				}
			}
		}

		return kortasteVaglangd;
	}

	public static int [] mellanstationer(double a[], double b[][], double c[])
	{
		double kortasteMellanstationer = a[0]+b[0][0]+c[0];
		double mellanstation = 0;
		int[] index = new int[2];
		/*int mellanstationer [i] = 1;
		int mellanstationer [j] = 1;
		//mellanstationer = new double[2];*/

		for (int i = 0; i < a.length - 1; i++)
		{
			for (int j = 0; j < b.length - 1; j++)
			{
			   mellanstation = a[i]+b[i][j]+c[j];

				if (mellanstation > kortasteMellanstationer)
				{
					mellanstation = kortasteMellanstationer;

					index[0] = i;
					index [1] = j;

				}
			}
		}return index;

	}
}



