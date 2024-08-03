import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz;
        double ort;
        int toplam = 0;
        int gecerliNotSayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            gecerliNotSayisi++;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();
        if (fiz >= 0 && fiz <= 100) {
            toplam += fiz;
            gecerliNotSayisi++;
        }

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turk = input.nextInt();
        if (turk >= 0 && turk <= 100) {
            toplam += turk;
            gecerliNotSayisi++;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = input.nextInt();
        if (kim >= 0 && kim <= 100) {
            toplam += kim;
            gecerliNotSayisi++;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();
        if (muz >= 0 && muz <= 100) {
            toplam += muz;
            gecerliNotSayisi++;
        }

        if (gecerliNotSayisi > 0) {
            ort = (double) toplam / gecerliNotSayisi;
            System.out.println("Geçerli notların ortalaması: " + ort);

            if (ort >= 55) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Maalesef, kaldınız.");
            }
        } else {
            System.out.println("Geçerli not bulunamadı.");
        }
    }
}
