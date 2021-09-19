import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        double liczbaA = 34, liczbaB = 12, liczbaC = 2;
        boolean boolA = false, boolB = true, boolC = false;
        System.out.println((liczbaA + liczbaB) * liczbaC / liczbaA);
        System.out.println((liczbaA - liczbaB * liczbaC / liczbaA) % 2);

        System.out.println((boolA || boolB) && (boolB || boolC));
        System.out.println((boolA || !boolB) || !(boolA && boolC));
        System.out.println((boolA || boolB) && (boolB || boolC) && !(liczbaA > liczbaB) || !(liczbaC == liczbaA));
    }
}
