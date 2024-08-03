import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç kenar uzunluğunu al
        System.out.print("Birinci kenarın uzunluğunu giriniz: ");
        double a = input.nextDouble();

        System.out.print("İkinci kenarın uzunluğunu giriniz: ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenarın uzunluğunu giriniz: ");
        double c = input.nextDouble();

        // Üçgenin çevresinin yarısını (s) hesapla
        double s = (a + b + c) / 2;

        // Heron formülünü kullanarak üçgenin alanını hesapla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Alanı ekrana yazdır
        System.out.println("Üçgenin alanı: " + alan);
    }
}