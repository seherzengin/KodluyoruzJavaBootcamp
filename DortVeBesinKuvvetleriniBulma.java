import java.util.Scanner;

public class DortVeBesinKuvvetleriniBulma {
    public static void main(String[] args) {

        int i, j, number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı : ");
        number = sc.nextInt();

        System.out.println("--------4'ün Kuvvetleri---------");
        for(i = 1; i <= number; i *= 4){
            System.out.println(i);
        }

        System.out.println("--------5'in Kuvvetleri---------");
        for(j = 1; j <= number; j *= 5){
            System.out.println(j);
        }
    }
}
