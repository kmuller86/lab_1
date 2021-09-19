public class Main {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji
        String tekst = "Jakis tekst";
        int liczbaC = 13;
        double liczbaR = 3.04;
        System.out.println("Przykładowy tekst w lini.");
        System.out.println("Przykładowy" + " " + "tekst" + " " + "w" + " " + "lini.");
        System.out.println(tekst + " i liczba " + liczbaC);

        System.out.print("Jakis");
        System.out.print(" tekst i liczba ");
        System.out.print(liczbaR + "\n");

        System.out.printf("%s oraz %d i %f\n", tekst, liczbaC, liczbaR);
        System.out.printf("Tylko string: '%s'\n", tekst);
        System.out.printf("Tylko liczba calkowita: '%d'\n", liczbaC);
        System.out.printf("Tylko liczba rzeczywista: '%f'\n", liczbaR);
    }
}
