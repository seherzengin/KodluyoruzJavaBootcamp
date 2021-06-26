import java.util.Scanner;

public class KucuktenBuyugeSayiSiralama {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sayı : ");
        sayi1 = sc.nextInt();

        System.out.println("2. Sayı : ");
        sayi2 = sc.nextInt();

        System.out.println("3. Sayı : ");
        sayi3 = sc.nextInt();

        if((sayi1 > sayi2) && (sayi1 > sayi3)){
            if(sayi2 > sayi3){
                System.out.println("sayi1 > sayi2 > sayi3");
            }else{
                System.out.println("sayi1 > sayi3 > sayi2");
            }
        }else if((sayi2 > sayi1) && (sayi2 > sayi3)){
            if(sayi1 > sayi3){
                System.out.println("sayi2 > sayi1 > sayi3");
            }else{
                System.out.println("sayi2 > sayi3 > sayi1");
            }
        }else{
            if(sayi1 > sayi2){
                System.out.println("sayi3 > sayi1 > sayi2");
            }else{
                System.out.println("sayi3 > sayi2 > sayi1");
            }
        }
    }
}
