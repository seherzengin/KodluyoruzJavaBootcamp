import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {

        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı : ");
        sayi = sc.nextInt();

        for(int i = 0 ; i < sayi ; i++){
            if(((i % 3) == 0) && ((i % 4) == 0)){
                System.out.println(i);
            }
        }
    }
}
