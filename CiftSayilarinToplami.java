import java.util.Scanner;

public class CiftSayilarinToplami {
    public static void main(String[] args) {

        int number, total = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Sayı : ");
            number = sc.nextInt();
            if(number % 2 == 0 && number % 4 == 0){
                total += number;
            }
        }while(number % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
