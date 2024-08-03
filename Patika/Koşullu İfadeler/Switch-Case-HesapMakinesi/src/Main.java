import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2= input.nextInt();

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem NO: ");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplama İşleminin Sonucu: ");
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.print("Çıkarma İşleminin Sonucu: ");
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.print("Çarpma İşleminin Sonucu: ");
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.print("Bölme İşleminin Sonucu: ");
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.");
        }
    }
}