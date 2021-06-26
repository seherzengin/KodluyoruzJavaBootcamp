import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        double armutFiyat= 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;

        Scanner sc = new Scanner(System.in);
        System.out.println("Armut kaç kilo : ");
        armut = sc.nextInt();
        double armutHesap = armut * armutFiyat;

        System.out.println("Elma kaç kilo : ");
        elma = sc.nextInt();
        double elmaHesap = elma * elmaFiyat;

        System.out.println("Domates kaç kilo : ");
        domates = sc.nextInt();
        double domatesHesap = domates * domatesFiyat;

        System.out.println("Muz kaç kilo : ");
        muz = sc.nextInt();
        double muzHesap = muz * muzFiyat;

        System.out.println("Patlıcan kaç kilo : ");
        patlican = sc.nextInt();
        double patlicanHesap = patlican * patlicanFiyat;

        double toplamTutar = armutHesap + elmaHesap + domatesHesap + muzHesap + patlicanHesap;
        System.out.println("Toplam tutar : " + toplamTutar);

    }
}
