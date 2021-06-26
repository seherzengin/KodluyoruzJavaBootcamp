import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int  acilis_ucreti = 10, mesafe;
        double toplam_tutar, tutar, perKm = 2.20;//perKm => km başına tutan tutarı ifade etmektedir.

        Scanner sc = new Scanner(System.in);
        System.out.println("Gidilen km : ");
        mesafe = sc.nextInt();

        tutar = perKm * mesafe;
        toplam_tutar = acilis_ucreti + tutar ;

        toplam_tutar = (toplam_tutar < 20) ? 20 : toplam_tutar;
        System.out.println("Toplam tutar : " + toplam_tutar);

    }
}
