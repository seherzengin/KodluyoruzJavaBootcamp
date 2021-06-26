import java.util.Scanner;

public class KombinasyonHesabi {
    public static void main(String[] args) {

        int i, j, k, number1, number2, combination;
        int total1 = 1, total2 = 1, total3 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kombinasyon => C(n,r)");
        System.out.println("n degerini giriniz : ");
        number1 = sc.nextInt();

        System.out.println("r degerini giriniz : ");
        number2 = sc.nextInt();

        for(i = 1; i <= number1 ; i++){
            total1 *= i;
            //System.out.println(total);
        }

        for(j = 1; j <= number2 ; j++){
            total2 *= j;
        }

        for(k = 1; k <= (number1-number2) ; k++){
            total3 *= k;
        }

        combination = total1 / (total2*total3);
        System.out.println("Kombinasyon : " + combination);

    }
}
