import java.util.Scanner;

public class RecursiveDesen {

    public static void desenOlusturma(int sayi, int tmp, boolean durum) {

        if (sayi == 0 || sayi < 0) {
            if (sayi <= tmp) {
                System.out.println(sayi);
                if (sayi > 0 && !durum) {
                    desenOlusturma(sayi - 5, tmp, false);
                } else {
                    desenOlusturma(sayi + 5, tmp, true);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = sc.nextInt();
        int tmp = sayi;
        desenOlusturma(sayi,tmp,false);
    }




}
