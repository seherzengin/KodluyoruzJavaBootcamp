import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı : ");
        number = sc.nextInt();

        for(int i = 0; i <= number ; i++){
            for(int j = 0 ; j <= (number - i); j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int a = number; 0 <= a  ; a--){
            for(int b = (number - a) ; 0 <= b ; b--){
                System.out.print(" ");
            }
            for(int c = (2 * a + 1) ; 1 <= c; c--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
