import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tab = new double[5];
        // powinno byc i++, jest drobna różnica między tymi operatorami ;) ogólnie jest ok
        for(int i = 0; i < tab.length; ++i) {
            tab[i] = i + 0.34;
            System.out.printf("%f ", tab[i]);
        }
    }
}
