import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int kombinasyon = kombinasyonHesapla(n, r);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }


    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static int kombinasyonHesapla(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }
}
