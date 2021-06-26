import java.util.Scanner;

public class HarmonikSeriToplamiBulma {
    public static void main(String[] args) {

        int sinir;
        double sonuc=0.0, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Harmonik seri toplamını bulmak için sınır değerini giriniz : ");
        sinir = sc.nextInt();

        for(i = 1; i <= sinir ; i++){
            sonuc += (1 / i);
        }

        System.out.print("Sonuç : " + sonuc);
    }
}
