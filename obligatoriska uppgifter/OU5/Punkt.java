//Demo java
// Min egen kod

public class Punkt
{
	private String namn = null;
	private double x;
	private double y;

     // klassens konstruktor
     //en konstruktor som skapar en f�rvald punkt
	public Punkt (String namn, int x, int y)
	{
		//this.x and this.y �r x och y koordinater som deklarerades privat
		this.namn = namn;
		this.x = x;
		this.y = y;
	}
	//konstruktor som skapar en punkt med given x-koordinat
	public Punkt (double x)
	{
		this.x = x;
		y = 0;
	}
	// en konstruktor som skapar en punkt med givna koordinator
	public Punkt (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
    //en konstruktor som skapar en punkt utifr�n en given punkt
    // vi skapar en ny punkt p.x utifr�n punkten this.x som �r definerade i
    // l�ngst upp i classen som privat
	public Punkt (Punkt p)
	{
		this.x = p.x;
		this.y = p.y;
	}
   //Metoder
   //getX returnerar punktens x-koordinater
   //Eftersom x och y �r privata m�ste vi anv�nda getX f�r att komma �t den
   public double getX ()
   {
	   return this.x;
   }
   //getY returnerar punktens y-koordinater
   public double getY()
   {
	   return this.y;
   }
   public String getNamn()
   {
   	   return namn;
   }

   public void setX (double x)
    {
   		this.x=x;
	}

    public void setY (double y)
    {
     		this.y = y;
  	}

  /* public double avstand ()
    {
   	 double d = 0;
   	 d = Math.sqrt (this.x * this.x + this.y * this.y);
   	 return d;
    }*/

   public double avstand (Punkt p)
   {
	   double d = 0;
	   d = Math.sqrt ((p.x - this.x) * (p.x - this.x) +
	                  (p.y - this.y) * (p.y - this.y));
	   return d;
   }
    // toString g�r att vi f�r v�rdet p� x och ist�llet att f� dess plast i minnet t .ex. som punkt@hsduy87890
    public String toString()
    {
   	  String s = "";
   	  s = "(" + x + ", " + y + ")";
   	  return s;
    }

}
//Slut p� kod






