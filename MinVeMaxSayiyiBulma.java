import java.util.Scanner;

public class MinVeMaxSayiyiBulma {
    public static void main(String[] args) {

        int i, n, sayi, buyuk=0, kucuk=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç sayi gireceksiniz : ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            System.out.println(i + ". Sayı :");
            sayi = sc.nextInt();

            if(i == 1){
                buyuk = sayi;
                kucuk = sayi;
            }
            else{
                if(buyuk < sayi){
                    buyuk = sayi;
                }
                else if(kucuk > sayi){
                    kucuk = sayi;
                }
            }
        }

        System.out.println("Min. sayı : " + kucuk);
        System.out.print("Max. sayı : " + buyuk);
    }
}
