import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int i, sayi, toplam=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        sayi = sc.nextInt();

        for(i = 1; i < sayi ; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }

        if(toplam == sayi){
            System.out.println(sayi + " bir mükemmel sayıdır.");
        }
        else{
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
