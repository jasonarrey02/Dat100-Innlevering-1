import java.util.Scanner;

class O3 {
    public static void main(String[] args) {
        int result = 1;
        Scanner fakultet = new Scanner(System.in);
        System.out.println("Hvilke heltall vil du beregne fakultet til?");
        int n = fakultet.nextInt();
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(result);
        }

    }
}
