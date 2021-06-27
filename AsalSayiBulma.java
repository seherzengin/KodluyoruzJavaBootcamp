import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {

        int i, j, sayac = 0;
        boolean kontrol = true;
        Scanner sc = new Scanner(System.in);

        for(i = 2; i < 100 ; i++){
            for(j = 2; j <= i; j++){
                if(i % j != 0){
                    sayac++;
                    if(sayac == i - 2){
                        System.out.println(i +" bir asal sayıdır.");
                        sayac = 0;
                    }
                }
                else{
                    System.out.println(i +" bir asal sayı değildir.");
                    sayac = 0;
                    break;
                }
            }
        }

    }
}
