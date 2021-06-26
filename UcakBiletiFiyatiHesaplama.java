import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int mesafe, yas, yolculuk_tipi;
        double  normal_tutar, indirimli_tutar, yas_indirimi, gd_bilet_indirimi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz : ");
        mesafe = sc.nextInt();

        System.out.println("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculuk_tipi = sc.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        normal_tutar = mesafe * 0.10;


        if((mesafe > 0)&&(yas > 0)&&(yolculuk_tipi == 1 || yolculuk_tipi == 2)){
            if((yas < 12) && (yolculuk_tipi == 2)){
                System.out.println("Normal tutar : " + normal_tutar);
                yas_indirimi = normal_tutar * 0.50;
                System.out.println("Yaş indirimi : " + yas_indirimi);
                indirimli_tutar = normal_tutar - yas_indirimi;
                System.out.println("İndirimli tutar : " + indirimli_tutar);
                gd_bilet_indirimi = indirimli_tutar * 0.20;
                System.out.println("Gidiş Dönüş Bilet İndirimi : " + gd_bilet_indirimi);
                double toplam_tutar = (indirimli_tutar - gd_bilet_indirimi) * 2;
                System.out.println("Toplam tutar : " + toplam_tutar);
            }
            else if((yas < 12) && (yolculuk_tipi == 1)){
                System.out.println("Normal tutar : " + normal_tutar);
                yas_indirimi = normal_tutar * 0.50;
                System.out.println("Yaş indirimi : " + yas_indirimi);
                indirimli_tutar = normal_tutar - yas_indirimi;
                System.out.println("İndirimli tutar : " + indirimli_tutar);
                System.out.println("Toplam tutar : " + indirimli_tutar);
            }
            else if((12 < yas && yas < 24) && (yolculuk_tipi == 2)){
                System.out.println("Normal tutar : " + normal_tutar);
                yas_indirimi = normal_tutar * 0.10;
                System.out.println("Yaş indirimi : " + yas_indirimi);
                indirimli_tutar = normal_tutar - yas_indirimi;
                System.out.println("İndirimli tutar : " + indirimli_tutar);
                gd_bilet_indirimi = indirimli_tutar * 0.20;
                System.out.println("Gidiş Dönüş Bilet İndirimi : " + gd_bilet_indirimi);
                double toplam_tutar = (indirimli_tutar - gd_bilet_indirimi) * 2;
                System.out.println("Toplam tutar : " + toplam_tutar);
            }
            else if((12 < yas && yas > 24) && (yolculuk_tipi == 1)) {
                System.out.println("Normal tutar : " + normal_tutar);
                yas_indirimi = normal_tutar * 0.10;
                System.out.println("Yaş indirimi : " + yas_indirimi);
                indirimli_tutar = normal_tutar - yas_indirimi;
                System.out.println("İndirimli tutar : " + indirimli_tutar);
                System.out.println("Toplam tutar : " + indirimli_tutar);
            }
            else if((65 < yas) && (yolculuk_tipi == 2)){
                System.out.println("Normal tutar : " + normal_tutar);
                yas_indirimi = normal_tutar * 0.30;
                System.out.println("Yaş indirimi : " + yas_indirimi);
                indirimli_tutar = normal_tutar - yas_indirimi;
                System.out.println("İndirimli tutar : " + indirimli_tutar);
                gd_bilet_indirimi = indirimli_tutar * 0.20;
                System.out.println("Gidiş Dönüş Bilet İndirimi : " + gd_bilet_indirimi);
                double toplam_tutar = (indirimli_tutar - gd_bilet_indirimi) * 2;
                System.out.println("Toplam tutar : " + toplam_tutar);
            }
            else{
                System.out.println("Geçersiz değer giridiniz!");
            }
        }
    }
}
