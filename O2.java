import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hvor mange poeng fikk du?");

            int poeng = myobj.nextInt();

            if (poeng >= 90 && poeng <= 100) {
                System.out.println("Du får karakter A!");
            } else if (poeng > 80 && poeng < 89) {
                System.out.println("Du får karakter B!");
            } else if (poeng > 60 && poeng < 79) {
                System.out.print("Du får karakter C");
            } else if (poeng > 50 && poeng < 59) {
                System.out.println("Du får karakter D");
            } else if (poeng > 40 && poeng < 49) {
                System.out.println("Du får karakter E");
            } else {
                System.out.println("Du får dessverre stryk");

                do {
                    if (poeng < 0 || poeng > 100) {
                        System.out.println("Ugyldig poengsum! Venligst skriv in ny poengsum mellom 0 - 100");
                        poeng = myobj.nextInt();
                    }
                } while (poeng < 0 || poeng > 100);

            }
        }
    }
}