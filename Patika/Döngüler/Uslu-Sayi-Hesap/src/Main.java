import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, us;

        System.out.print("Üssü Alınacak Sayı: ");
        sayi = input.nextInt();

        System.out.print("Sayının Üssü: ");
        us = input.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= sayi;
        }

        System.out.println(sayi + " üzeri " + us + " = " + sonuc);
    }
}
