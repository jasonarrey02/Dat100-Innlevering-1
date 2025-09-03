import java.util.Scanner;

class O1 {
    public static void main(String[] args) {
        double trinnskatt = 0;
        int skatt = 0;

        Scanner myobj = new Scanner(System.in);
        System.out.println("Hva er din bruttoinntekt?");
        int lønn = myobj.nextInt();

        if (lønn < 217400) {
            trinnskatt = 0;
            skatt = (int) (lønn * trinnskatt / 100);
        } else if (lønn < 306050) {
            trinnskatt = 1.7;
            skatt = (int) (lønn * trinnskatt / 100);
        } else if (lønn < 697150) {
            trinnskatt = 4.0;
            skatt = (int) (lønn * trinnskatt / 100);
        } else if (lønn < 942400) {
            trinnskatt = 13.7;   // (check correct %)
            skatt = (int) (lønn * trinnskatt / 100);
        } else if (lønn < 1410750) {
            trinnskatt = 16.7;   // (check correct %)
            skatt = (int) (lønn * trinnskatt / 100);
        } else {
            trinnskatt = 17.7;
            skatt = (int) (lønn * trinnskatt / 100);

        }

        System.out.println("*******************************");
        System.out.println("Din bruttoinntekt er: " + lønn +
                "\nDin trinnskatt er: " + trinnskatt + "%" +
                "\nDin årlige skatt er: " + skatt + "kr" );
        System.out.println("*******************************");


    }
}