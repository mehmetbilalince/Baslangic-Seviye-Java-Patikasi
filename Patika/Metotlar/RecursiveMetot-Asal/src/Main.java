import java.util.Scanner;

public class Main {

    static boolean AsalKontrol(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return AsalKontrol(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı giriniz: ");
        int sayi = input.nextInt();

        boolean result = AsalKontrol(sayi, sayi / 2);

        if (result) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
}
