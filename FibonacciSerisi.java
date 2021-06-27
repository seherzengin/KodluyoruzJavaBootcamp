public class FibonacciSerisi {
    public static void main(String[] args) {

        int i, number0=0, number1=1, sayi=10, sonuc;

        System.out.print(number0 + " " + number1);
        for(i = 2; i < sayi; i++){
            sonuc = number0 + number1;
            System.out.print(" " + sonuc);
            number0 = number1;
            number1 = sonuc;
        }

        System.out.println();

    }
}
