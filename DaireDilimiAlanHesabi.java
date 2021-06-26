import java.util.Scanner;

public class DaireDilimiAlanHesabi {
    public static void main(String[] args) {

        int yaricap;
        double pi=3.14, aci;

        Scanner sc = new Scanner(System.in);
        System.out.println("Yarıçapını giriniz : ");
        yaricap = sc.nextInt();

        System.out.println("Merkez açı ölçüsünü giriniz : ");
        aci = sc.nextDouble();

        double alan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Daire diliminin alanı : " + alan);

    }
}
