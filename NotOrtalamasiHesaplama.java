import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik notunuz : ");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunuz : ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik = scanner.nextInt();

        double toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;
        System.out.println("Ortalama : " + ortalama);

        boolean sonuc = ortalama > 60 ;

        String str = sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";//Sonuc doğruysa "Sınıfı geçti", yanlışsa "Sınıfta kaldı" yazdırır.
        System.out.println(str);
    }
}
