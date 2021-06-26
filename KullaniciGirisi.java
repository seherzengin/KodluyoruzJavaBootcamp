import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username, password, yenisifre;
        int secim;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        username = sc.nextLine();

        System.out.print("Şifreniz : ");
        password = sc.nextLine();



        if(username.equals("patika")){
            System.out.println("Kullanici adi dogru");
        }else{
            System.out.print("Şifrenizi sıfırlamak ister misiniz?(Evet ise 1'e, Hayır ise 2'ye basın) : ");
            secim = sc.nextInt();
                if(secim==1){
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Yeni sifreniz : ");
                    yenisifre = sc1.nextLine();
                    boolean esit = password.equals(yenisifre);
                    String str = esit ? "Yeni sifre oluşturulamadı!" : "Şifre oluşturuldu!";
                    System.out.println(str);
                }else if(secim==2){
                    System.out.println("Şifre sıfırlanamadı!");
                }else{
                    System.out.println("Geçersiz işlem!");
                }
        }
    }
}
