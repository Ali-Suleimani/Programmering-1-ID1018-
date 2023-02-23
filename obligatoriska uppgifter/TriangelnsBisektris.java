//Demo java
import java.util.*;
class TriangelnsBisektris
{
   public static void main(String []args)
   {

   Scanner in = new Scanner(System.in);
   Scanner scan = new Scanner(System.in);
       System.out.print("Enter the base: ");
       int base = scan.nextInt();
       System.out.print("Enter the height: ");
       int height = scan.nextInt();
       double area = (0.5) * (base * height);
    System.out.println("The area of triangle is: "+area);

   //DEklarera olika metoder för att beräkna triangelns sidor, omkrets, area osv

   /*System.out.println("Deklarera metoder");
   System.out.println();*/
   //Deklarera triangelns sidor

   /*double A = in.nextDouble();
   double B = in.nextDouble();
   double C = in.nextDouble();
   double H = in.nextDouble();
   System.out.println();

   System.out.println("Mata in triangelns bas och för att räkna arean");
   double Area = (B*H)/2;
   System.out.println("Traingelns are är:" + Area);
   System.out.println();

   //Deklarera triangelns vinklar
   double a = in.nextDouble();
   double b = in.nextDouble();
   double c = in.nextDouble();
   System.out.println();

   //Beräkna triangelns area
   /*System.out.println("Mata in triangelns bas och för att räkna arean");
   double Area = (B*H)/2;
   System.out.println("Traingelns are är:" + Area);
    System.out.println();*/
  }
 }