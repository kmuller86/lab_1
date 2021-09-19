import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 27;
        if((wiek % 3) == 0)
            System.out.println("Wiek jest podzielny przez 3");
        else
            System.out.println("Wiek nie jest podzielny przez 3");

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int nrIndeksu = 58997;
        String wynik = (nrIndeksu % 2 == 0) ? "Parzysty!" : "Nieparzysty!";
        System.out.println(wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scannner = new Scanner(System.in);
        System.out.print("Podaj liczbe rzeczywista: ");
        double liczba = scannner.nextDouble();
        if(liczba < 0)
            System.out.println("Liczba ujemna.");
        else if(liczba == 0)
            System.out.println("ZERO!");
        else if(liczba < 10.45)
            System.out.println("Liczba dodatnia, mniejsza od 10,45");
        else
            System.out.println("Liczba wieksza od 10,45");
    }
}
