import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte mojByte = 56;
        short mojShort = -15678;
        int mojInt = 1653443;
        long mojLong = 679078753;
        float mojFloat = 345.56f;
        double mojDouble = 1234.56d;
        boolean mojBoolean = false;
        char mojChar = 'A';
        String mojString = "Tekst";

        System.out.println(mojByte + " " + mojShort + " " + mojInt + " " + mojLong);
        System.out.println(mojFloat + " " + mojDouble + " " + mojBoolean + " " + mojChar + " " + mojString);
        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        //a)
        int liczbaA = 456, liczbaB = -345;
        System.out.println("Dzialania na liczbach calkowitych:");
        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaA % liczbaB);
        //b)
        double liczbaX = 37.12, liczbaY = 456.67;
        System.out.println("Dzialania na liczbach rzeczywistych:");
        System.out.println(liczbaX + liczbaY);
        System.out.println(liczbaX - liczbaY);
        System.out.println(liczbaX * liczbaY);
        System.out.println(liczbaX / liczbaY);
        System.out.println(liczbaX % liczbaY);
    }
}
