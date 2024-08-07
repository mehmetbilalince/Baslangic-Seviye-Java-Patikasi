import java.util.Scanner;

public class Main {
    static int toplama(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int bolme(int a, int b) {
        if (b == 0) {
            System.out.println("Bölme hatası: bir sayı sıfıra bölünemez.");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }

    static int usluSayi(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println("Üslü Sayı : " + result);
        return result;
    }

    static int modAlma(int a, int b) {
        int result = a % b;
        System.out.println("Mod : " + result);
        return result;
    }

    static void dikdortgenAlanCevre(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Dikdörtgen Alanı : " + alan);
        System.out.println("Dikdörtgen Çevresi : " + cevre);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Mod Alma\n" +
                "7-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk Sayıyı Giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    toplama(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bolme(a, b);
                    break;
                case 5:
                    usluSayi(a, b);
                    break;
                case 6:
                    modAlma(a, b);
                    break;
                case 7:
                    dikdortgenAlanCevre(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
