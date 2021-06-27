import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        int i, j, k,  basDegeri;
        Scanner sc = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz : ");
        basDegeri = sc.nextInt();

        for(i = basDegeri; 0 <= i  ; i--){
            for(j = (basDegeri - i) ; 0 <= j ; j--){
                System.out.print(" ");
            }
            for(k = (2 * i + 1) ; 1 <= k; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
