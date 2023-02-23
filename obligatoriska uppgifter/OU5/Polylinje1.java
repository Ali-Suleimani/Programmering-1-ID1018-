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
	    //Vi skapar en toString för att få alla punkter, färge och beredden i rad
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

		//lägg till ett hörn i polylinjen
		public void laggTill (Punkt horn)
		{
			Punkt[]    h = new Punkt[this.horn.length + 1];
			int i = 0;
			for (i = 0; i < this.horn.length; i++)
			h[i] = this.horn[1];
			h[i] = new Punkt (horn);
			this.horn = h;
		}

	    //lägg till en hörn till linjen
		public void laggTillFramfor (Punkt horn, String hornNamn)
		{
			//bestäm position för det hörn som ska läggas till
			int pos = 0;
			while (pos < this.horn.length && (!this.horn[pos].getNamn().equals(hornNamn)))
			pos++;
			//om det inte finns plats i vektorn för det hörnet som ska läggas till
			if (!(pos < this.horn.length))
			return;
			//vi skapar plats för hörnet som ska läggas till genom att utöka vektorn med 1
			Punkt [] h = new Punkt [this.horn.length + 1];
			int i = 0;

            //här kopierar vi vi allat framför positionen för det hörn som som ska läggas till
			while (i<pos)
			{
				h[i] = this.horn[i];
				i ++;
			}

            //här lägger vi till det hörnet som vi skapade plats för
			h[i] = new Punkt (horn);
			while (i < this.horn.length)
			{   //alla andra hörn efter det hörn som vi läggde till flyttas ett steg åt höger
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

