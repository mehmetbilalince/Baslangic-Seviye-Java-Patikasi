import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14, alan, cevre, a, dilimAlan;
        int r;
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin Çapını Giriniz: ");
        r=input.nextInt();

        System.out.print("Merkez Açıyı Giriniz: ");
        a=input.nextDouble();

        alan=(pi*r*r);
        cevre=(2*pi*r);
        dilimAlan=(pi * (r*r) * a) / 360;

        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
        System.out.println("Daire Diliminin Alanı: "+dilimAlan);
    }
}