import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,total,baslangic=10;
        Scanner input=new Scanner(System.in);

        System.out.println("Mesafeyi KM cinsinden Giriniz: ");
        km=input.nextInt();

        total=(km*perKm);
        total+=baslangic;

        total=(total<20)?20:total;
        System.out.println("Toplam Tutar: "+total);
    }
}