import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            normalTutar = km * 0.10;

            // Yaş indirimi
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30;
            } else {
                yasIndirimi = 0;
            }


            indirimliTutar = normalTutar - yasIndirimi;

            // Gidiş-dönüş indirimi
            if (yolculukTipi == 2) {
                indirimliTutar *= 0.80;
                toplamTutar = indirimliTutar * 2;
            } else {
                toplamTutar = indirimliTutar;
            }


            System.out.println("Toplam bilet fiyatı: " + toplamTutar + " TL");
        } else {

            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
