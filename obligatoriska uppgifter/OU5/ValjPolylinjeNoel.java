import java.security.SecureRandom;
import java.util.*;

public class ValjPolylinjeNoel {

    public static final Random rand = new Random ();
    public static final int ANTAL_POLYLINJER =3;

    public static void main (String[] args) {
        int i = 0;
        // skapa ett antal slumpmässiga polylinjer
        Polylinje[] plylin = new Polylinje[ANTAL_POLYLINJER];
        for ( i = 0; i < ANTAL_POLYLINJER; i++) {
            plylin[i] = slumpPolylinje();
        }
        // visa polylinjerna
        System.out.println("ALLA SLUMPADE POLYLINJER");
        System.out.println("-------------------------------------------");
        for ( i = 0; i < ANTAL_POLYLINJER; i++){
            System.out.println(plylin[i]);
    }
        System.out.println("-------------------------------------------");
        // bestäm den kortaste av de polylinjer som är gula

        //tar reda på antalet gula plylinjer för att bestäma längden på vektorn pos[]
            int antGul = 0;
            for ( i = 0; i < ANTAL_POLYLINJER; i++) {
                if (plylin[i].getFarg().equals("Gul")) {
                 ++antGul;
                 }
             }
            //position på alla gula polylinjer i ply vektorn
            int pekare = 0;
            int[] pos = new int[antGul];
            for ( i = 0; i < ANTAL_POLYLINJER; i++){
                if (plylin[i].getFarg().equals("Gul")){
                    pos[pekare++] = i;
                }
            }
            try {
                //hittar den kortaste polylinjen
                Polylinje minGul = plylin[pos[0]];
                for (i = 1; i < antGul; i++) {
                    if (minGul.langd() > plylin[pos[i]].langd()) {
                        minGul = plylin[pos[i]];
                    }
                }
                System.out.println("-------------------------------------------");
                System.out.println("DEN MINSTA GULA PLYLINJEN ÄR: " + minGul);
                System.out.println("-------------------------------------------");
            }
            catch (Exception e){
                System.out.println("------------------------");
                System.out.println("GUL POLYLINJE SAKNAS!");
                System.out.println("------------------------");
            }
        // visa den valda polylinjen
    }

        // slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i
        // det engelska alfabetet, och slumpmässiga koordinater.
    public static Punkt slumpPunkt ()
    {
        String n = "" + (char) (65 + rand.nextInt (26));
        int x = rand.nextInt (11);
        int y = rand.nextInt (11);
        return new Punkt (n, x, y);
    }
        // slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd
        // eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn
        // kan inte ha samma namn.
    public static Polylinje slumpPolylinje () {
        // skapa en tom polylinje, och lägg till hörn till den

        Polylinje plylin = new Polylinje ();
        int antalHorn = 2 + rand.nextInt (7);
        int antalValdaHorn = 0;
        boolean[] valdaNamn = new boolean[26];
        // ett och samma namn kan inte förekomma flera gånger
        // Punkt valdPunkt = null;
        char valtChar = 0;
        while (antalValdaHorn < antalHorn)
        {
            Punkt tpunkt = slumpPunkt();
            int pos = tpunkt.getA().charAt(0) - 65;

            if (valdaNamn[pos] == false ) {
                plylin.laggTill(tpunkt);
                valdaNamn[pos] = true;
                antalValdaHorn++;
            }
        }
        // sätt färg
        int fargbestam = rand.nextInt(3);
        if (fargbestam == 0) {
            plylin.setFarg("Blå");
        }
        else if (fargbestam ==1) {
            plylin.setFarg("Röd");
        }
        else {
            plylin.setFarg("Gul");
        }
        return plylin;
    }
}
