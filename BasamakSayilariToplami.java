import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {

        int sayi, basDegeri, tmp, basSayisi=0, sonuc = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Basamak sayılarını toplamak istediğiniz sayıyı giriniz : ");
        sayi = sc.nextInt();

        tmp = sayi;
        while (tmp != 0){
            tmp /= 10;
            basSayisi++;
        }

        tmp = sayi;
        while (tmp != 0){
            basDegeri = tmp % 10;
            sonuc += basDegeri;
            tmp /= 10;
        }

        System.out.println(sonuc);

    }
}
