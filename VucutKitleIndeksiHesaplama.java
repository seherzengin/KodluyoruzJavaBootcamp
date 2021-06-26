import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz : ");
        boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = sc.nextDouble();

        double vk_indeks = (kilo)/(boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vk_indeks);
    }
}
