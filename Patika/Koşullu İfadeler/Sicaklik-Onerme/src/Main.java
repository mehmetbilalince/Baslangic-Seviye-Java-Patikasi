import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 0) {
            System.out.println("Hatalı Giriş. Sıcaklık negatif olamaz.");
        } else if (sicaklik < 5) {
            System.out.println("Kayak Yapabilirsin");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinemaya Gidebilirsin");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Pikniğe Gidebilirsin");
        } else if (sicaklik >= 25) {
            System.out.println("Yüzmeye Gidebilirsin");
        } else {
            System.out.println("Hatalı Giriş");
        }
    }
}
