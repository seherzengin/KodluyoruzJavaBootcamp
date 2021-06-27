import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {

        int number1, number2, ebob=1, ekok, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı 1 : ");
        number1 = sc.nextInt();

        System.out.print("Sayı 2 : ");
        number2 = sc.nextInt();

        while(number1 != number2)
        {
            if(number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }

        System.out.println("EBOB = " + number1);
        System.out.println("================");
        
        i = 1;
        while(i <= number1*number2)
        {
            if(i % number1 == 0 && i % number2 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
