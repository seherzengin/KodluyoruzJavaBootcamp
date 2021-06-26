import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int sicaklik;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz : ");
        sicaklik = sc.nextInt();
        System.out.println("Sıcaklık : " + sicaklik);

        if(sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(5 <= sicaklik && sicaklik <= 10){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(10 <= sicaklik && sicaklik <= 15){
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        }
        else if(15 <= sicaklik && sicaklik <= 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
