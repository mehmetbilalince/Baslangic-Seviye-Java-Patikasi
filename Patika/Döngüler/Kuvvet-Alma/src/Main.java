import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri:");
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println(j);
        }
    }
}
