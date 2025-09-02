import java.util.Scanner;

class O1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Hva er din bruttoinntekt?");
        int lønn = myobj.nextInt();

        if (lønn < 217400) {
            System.out.println("Du betaler ikke trinnskatt");
        } else if (lønn < 306050) {
            System.out.println("Du betaler 1,7% trinnskatt");
        } else if (lønn < 697150) {
            System.out.println("Du betaler 4,0% trinnskatt");
        } else if (lønn < 942400) {
            System.out.println("Du betaler 13,7% trinnskatt");
        } else if (lønn < 1410750) {
            System.out.println("Du betaler 16,7% trinnskatt");
        } else  {
            System.out.println("Du betaler 17,7% trinnskatt");
        }
    }
}