package MayinTarlasiOyunu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row, column;
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Satır sayısı : ");
        row = sc.nextInt();
        System.out.println("Sütun sayısı : ");
        column = sc.nextInt();*/

        MineSweeper mayin = new MineSweeper(5, 5);
        mayin.run();
    }

}
