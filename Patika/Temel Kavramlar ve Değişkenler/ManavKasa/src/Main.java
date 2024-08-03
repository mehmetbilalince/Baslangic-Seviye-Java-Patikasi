import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç Kg Armut? ");
        armutKg = input.nextDouble();

        System.out.println("Kaç Kg Elma? ");
        elmaKg = input.nextDouble();

        System.out.println("Kaç Kg Domates? ");
        domatesKg = input.nextDouble();

        System.out.println("Kaç Kg Muz? ");
        muzKg = input.nextDouble();

        System.out.println("Kaç Kg Patlıcan? ");
        patlicanKg = input.nextDouble();

        double toplam = (armutKg * armutFiyat) + (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) + (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
}
