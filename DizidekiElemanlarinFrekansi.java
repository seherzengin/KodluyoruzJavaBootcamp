import java.util.Scanner;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int sayi, sayac = 0;

        System.out.println("Aramak istediğiniz sayıyı giriniz : ");
        sayi = sc.nextInt();

        for (int i = 0; i < list.length; i++) {
            if (sayi == list[i]) {
                sayac += 1;
            }
        }

        System.out.println("Dizide aradığınız sayı    : "   + sayi);
        System.out.println("Dizide tekrar edilme sayisi : " + sayac);
    }
}
