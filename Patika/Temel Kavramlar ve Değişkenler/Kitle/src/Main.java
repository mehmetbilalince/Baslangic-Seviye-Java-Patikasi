import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo=input.nextInt();

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        boy=input.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: "+indeks);
    }
}
