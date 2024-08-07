import java.util.Scanner;

public class Main {
    // Recursive yöntemle üslü sayı hesaplama metodu
    static int usluSayi(int taban, int us) {
        // Üs değeri 0 ise, sonuç 1'dir
        if (us == 0) {
            return 1;
        }
        // Üs değeri 1 ise, sonuç taban değeri ile aynıdır
        else if (us == 1) {
            return taban;
        }
        // Üs değeri pozitifse, recursive çağrı yap
        else {
            return taban * usluSayi(taban, us - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini al
        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int us = input.nextInt();

        // Recursive yöntemle üslü sayıyı hesapla
        int result = usluSayi(taban, us);

        // Sonucu ekrana yazdır
        System.out.println("Sonuç: " + result);
    }
}
