import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        String imie, nazwisko;
        int wiek, nrIndeksu;
        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        System.out.print("Podaj imie: ");
        imie = scan.next();
        System.out.print("Podaj nazwisko: ");
        nazwisko = scan.next();
        System.out.print("Podaj wiek: ");
        wiek = scan.nextInt();
        System.out.print("Podaj nr indeksu: ");
        nrIndeksu = scan.nextInt();

        System.out.println("Imie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek + ", nr indeksu: " + nrIndeksu);
        System.out.printf("Imie: %s, naziwsko: %s, wiek: %d, nr indeksu: %d\n", imie, nazwisko, wiek, nrIndeksu);
        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        int liczbaA, liczbaB;
        System.out.print("Podaj liczbe 1: ");
        liczbaA = scan.nextInt();
        System.out.print("Podaj liczbe 2: ");
        liczbaB = scan.nextInt();
        System.out.println(liczbaA + liczbaB);
        System.out.println(liczbaA - liczbaB);
        System.out.println(liczbaA * liczbaB);
        System.out.println(liczbaA / liczbaB);
        System.out.println(liczbaA % liczbaB);
    }
}
