import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        sayi = input.nextInt();

        System.out.print("1. Sayıyı Giriniz: ");
        int number = input.nextInt();

        int max = number;
        int min = number;

        for (int i = 2; i <= sayi; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
