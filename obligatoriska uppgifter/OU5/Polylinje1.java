//Demo java
import java.util.*;
class Polylinje1
{
	    private Punkt[]    horn;
		private String     farg = "svart";
		private int        bredd = 1;

		public Polylinje1 ()
		{
		this.horn = new Punkt[0];
		}

		public Polylinje1 (Punkt[] horn)
		{
		  this.horn = horn;
		}
	    //Vi skapar en toString f�r att f� alla punkter, f�rge och beredden i rad
		public String toString ()
		{
			StringBuilder sb= new StringBuilder ();
			for (int i = 0; i < horn.length; i++)
			sb.append(horn[i]);
			sb.append("(" + farg + "," + bredd + ")");
			return sb.toString();
		}


		public Punkt[] getHorn ()
		{
			return horn;

		}
		public String getFarg ()
		{
			return farg;
		}

		public int getBredd ()
		{
			return bredd;
		}

		public void setFarg(String farg)
		{
			this.farg = farg;
		}
		public void setBredd (int bredd)
		{
			this.bredd = bredd;
		}

		public double langd ()
		{
			double len = 0;
			for (int i = 0; i < horn.length - 1; i++);
			return len;
		}

		//l�gg till ett h�rn i polylinjen
		public void laggTill (Punkt horn)
		{
			Punkt[]    h = new Punkt[this.horn.length + 1];
			int i = 0;
			for (i = 0; i < this.horn.length; i++)
			h[i] = this.horn[1];
			h[i] = new Punkt (horn);
			this.horn = h;
		}

	    //l�gg till en h�rn till linjen
		public void laggTillFramfor (Punkt horn, String hornNamn)
		{
			//best�m position f�r det h�rn som ska l�ggas till
			int pos = 0;
			while (pos < this.horn.length && (!this.horn[pos].getNamn().equals(hornNamn)))
			pos++;
			//om det inte finns plats i vektorn f�r det h�rnet som ska l�ggas till
			if (!(pos < this.horn.length))
			return;
			//vi skapar plats f�r h�rnet som ska l�ggas till genom att ut�ka vektorn med 1
			Punkt [] h = new Punkt [this.horn.length + 1];
			int i = 0;

            //h�r kopierar vi vi allat framf�r positionen f�r det h�rn som som ska l�ggas till
			while (i<pos)
			{
				h[i] = this.horn[i];
				i ++;
			}

            //h�r l�gger vi till det h�rnet som vi skapade plats f�r
			h[i] = new Punkt (horn);
			while (i < this.horn.length)
			{   //alla andra h�rn efter det h�rn som vi l�ggde till flyttas ett steg �t h�ger
				h[i+1] = this.horn[i];
				i++;
			}
			this.horn = h;


		}
		public void taBort (String hornNamn)
		{
			int pos = 0;
			while (pos < this.horn.length && (!this.horn[pos].getNamn().equals(hornNamn)))
			if (!(pos < this.horn.length))
			return;
			//ta bort hornet
			Punkt [] h = new Punkt [this.horn.length - 1];
			int i = 0;

			while (i < pos)
			{
				h[i] = this.horn[i];
				i++;
		    }
		    i = pos +1;
		    //h[i] = new Punkt (horn);
		    while (i < this.horn.length)
		    {
				h[i-1] = this.horn[i];
				i++;
			}
		     this.horn = h;
		}
	}

