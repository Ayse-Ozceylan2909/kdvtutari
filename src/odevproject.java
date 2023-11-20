import java.util.Scanner;
public class odevproject {
    public static void main(String[] args) {
        double tutar , kdvOrani , kdvOran , kdvTutari , kdvliTutar ;

        Scanner input = new Scanner(System.in);
        System.out.println("ücreti giriniz :");
        tutar = input.nextDouble();

        if(tutar<=1000) {
            kdvOrani = 0.18;
            kdvTutari = tutar * kdvOrani;
            kdvliTutar = tutar + kdvTutari;

            System.out.println("KDV Oranı :" + kdvOrani);
            System.out.println("KDV'li Tutar : " + kdvliTutar);
        }
       else {
        kdvOran = 0.8;
        kdvTutari = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
        }

    }
}
