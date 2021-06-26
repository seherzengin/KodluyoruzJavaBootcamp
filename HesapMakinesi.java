import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2, secim;
        int toplama, cikarma, carpma, bolme;
        Scanner sc = new Scanner(System.in);

        System.out.println("Toplama işlemi için 1'i");
        System.out.println("Çıkarma işlemi için 2'yi");
        System.out.println("Çarpma işlemi için 3'ü");
        System.out.println("Bölme işlemi için 4'ü tuşlayın.");
        System.out.println("Seçim : ");
        secim = sc.nextInt();

        System.out.println("İlk sayı : ");
        sayi1 = sc.nextInt();

        System.out.println("İkinci sayı : ");
        sayi2 = sc.nextInt();

        toplama = sayi1 + sayi2;
        cikarma = sayi1 - sayi2;
        carpma = sayi1 * sayi2;

        switch (secim){
            case 1 :
                System.out.println(toplama) ; break;
            case 2 :
                System.out.println(cikarma) ; break;
            case 3 :
                System.out.println(carpma) ; break;
            case 4 :
                if(sayi2 != 0){
                    bolme = sayi1 / sayi2;
                    System.out.println(bolme);
                }else{
                    System.out.println("Bölen sayı 0 olamaz!");
                } ; break;
        }
    }
}
