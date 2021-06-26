import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {

        int taban, us, i, total=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı : ");
        taban = sc.nextInt();

        System.out.println("Üs olacak sayı : ");
        us = sc.nextInt();

        for(i = 1; i <= us; i++){
            total *= taban;
        }

        System.out.print("Sonuc : " + total);
    }
}
