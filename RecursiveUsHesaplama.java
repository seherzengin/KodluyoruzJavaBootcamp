import java.util.Scanner;

public class RecursiveUsHesaplama {

    static int power(int taban, int us) {
        if (us==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*power(taban,us-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = sc.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = sc.nextInt();
        System.out.println("sonuc: " + power(taban, us));
    }
}
