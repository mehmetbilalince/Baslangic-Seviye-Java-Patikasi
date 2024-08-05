import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleman;

        System.out.print("Eleman Sayısını Seçiniz: ");
        eleman = input.nextInt();

        // İlk iki Fibonacci sayısını tanımlayın
        int a = 0, b = 1;

        // Kullanıcı 0 veya negatif bir sayı girerse, çıktıyı kontrol edin
        if (eleman <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else if (eleman == 1) {
            System.out.println("Fibonacci Serisi: " + a);
        } else {
            System.out.print("Fibonacci Serisi: " + a + " " + b);
            for (int i = 3; i <= eleman; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }

        input.close();
    }
}
