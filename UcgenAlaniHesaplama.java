import java.util.Scanner;

public class UcgenAlaniHesaplama {
    public static void main(String[] args) {

        int kenar1, kenar2, kenar3, u;
        double alan;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kenar 1 : ");
        kenar1 = sc.nextInt();
        System.out.println("Kenar 2 : ");
        kenar2 = sc.nextInt();
        System.out.println("Kenar 3 : ");
        kenar3 = sc.nextInt();

        u = (kenar1+kenar2+kenar3)/2;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Alan : " + alan);

    }
}
