import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik, notlar=0, sayac=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = sc.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = sc.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = sc.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = sc.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = sc.nextInt();

        if(matematik >= 0 && matematik <= 100){
            notlar += matematik;
            sayac++;
        }
        if(fizik >= 0 && fizik <= 100){
            notlar += fizik;
            sayac++;
        }
        if(turkce >= 0 && turkce <= 100){
            notlar += turkce;
            sayac++;
        }
        if(kimya >= 0 && kimya <= 100){
            notlar += kimya;
            sayac++;
        }
        if(muzik >= 0 && muzik <= 100){
            notlar += muzik;
            sayac++;
        }

        int ortalama = (notlar/sayac);
        System.out.println("Ortalamaniz : " + ortalama);
        System.out.println((ortalama)>=55 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
    }
}
