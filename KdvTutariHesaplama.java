import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

        double fiyat, kdvli_fiyat, kdvli_tutar, kdv_tutari;

        Scanner scanner = new Scanner(System.in);
        System.out.print("KDV'li fiyatını hesaplamak istediğiniz para değerini giriniz : ");
        fiyat = scanner.nextInt();
        System.out.println(fiyat);

        if((0<=fiyat)&&(fiyat<=1000)){
            double tutar = 0.18;
            kdv_tutari = tutar * fiyat;
            kdvli_fiyat = fiyat + kdv_tutari;
            System.out.println("KDV'siz fiyat : " + fiyat);
            System.out.println("KDV' li fiyat : " + kdvli_fiyat);
            System.out.println("KDV tutarı : " + kdv_tutari);
        }
        else if(fiyat>=1000){
            double tutar1 = 0.08;
            kdv_tutari = tutar1 * fiyat;
            kdvli_fiyat = fiyat + kdv_tutari;
            System.out.println("KDV'siz fiyat : " + fiyat);
            System.out.println("KDV' li fiyat : " + kdvli_fiyat);
            System.out.println("KDV tutarı : " + kdv_tutari);
        }
        else{
            System.out.println("Geçersiz değer girdiniz!!!");
        }

    }
}
