import java.util.Scanner;

public class DizidekiMaxVeMinDegeriBulma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] sayilar = {15,12,788,1,-1,-778,2,0};
        int giris;
        int min = sayilar[0];
        int max = sayilar[0];

        System.out.println("Bir tam sayı giriniz : ");
        giris = sc.nextInt();

        for (int i : sayilar) {
            if (i < giris &&  (giris - i < 0 ? (giris - i) * -1 : giris -i ) < (giris - min < 0 ? (giris - min) * -1 : giris -min )) {
                min = i;
            }
            if (i > giris &&  (giris - i < 0 ? (giris - i) * -1 : giris -i ) < (giris - min < 0 ? (giris - min) * -1 : giris -min )) {
                max = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
