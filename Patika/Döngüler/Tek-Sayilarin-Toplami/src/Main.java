import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir Sayı Giriniz: ");
            sayi = input.nextInt();


            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
