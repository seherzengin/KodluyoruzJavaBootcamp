import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int gun, ay;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaçıncı ayda doğduğunuzu giriniz : ");
        ay = sc.nextInt();

        System.out.println("Doğduğunuz günü giriniz : ");
        gun = sc.nextInt();

        if(((ay == 1)&&(22 <= gun)) || ((ay == 2)&&(gun <= 19))){
                System.out.println("Kova burcusunuz.");
        }
        else if(((ay == 2)&&(20 <= gun)) || ((ay == 3)&&(gun <= 20))){
            System.out.println("Balık burcusunuz.");
        }
        else if(((ay == 3)&&(21 <= gun)) || ((ay == 4)&&(gun <= 20))){
            System.out.println("Koç burcusunuz.");
        }
        else if(((ay == 4)&&(21 <= gun)) || ((ay == 5)&&(gun <= 21))){
            System.out.println("Boğa burcusunuz.");
        }
        else if(((ay == 5)&&(22 <= gun)) || ((ay == 6)&&(gun <= 22))){
            System.out.println("İkizler burcusunuz.");
        }
        else if(((ay == 6)&&(23 <= gun)) || ((ay == 7)&&(gun <= 22))){
            System.out.println("Yengeç burcusunuz.");
        }
        else if(((ay == 7)&&(23 <= gun)) || ((ay == 8)&&(gun <= 22))){
            System.out.println("Aslan burcusunuz.");
        }
        else if(((ay == 8)&&(23 <= gun)) || ((ay == 9)&&(gun <= 22))){
            System.out.println("Başak burcusunuz.");
        }
        else if(((ay == 9)&&(23 <= gun)) || ((ay == 10)&&(gun <= 22))){
            System.out.println("Terazi burcusunuz.");
        }
        else if(((ay == 10)&&(23 <= gun)) || ((ay == 11)&&(gun <= 21))){
            System.out.println("Akrep burcusunuz.");
        }
        else if(((ay == 11)&&(22 <= gun)) || ((ay == 12)&&(gun <= 21))){
            System.out.println("Yay burcusunuz.");
        }else{
            System.out.println("Geçersiz değer girdiniz.");
        }
    }
}
