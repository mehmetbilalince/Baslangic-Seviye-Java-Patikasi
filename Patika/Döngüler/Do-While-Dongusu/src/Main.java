import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sifre;
        boolean sifreKontrol=true;

        do {
            System.out.print("Şifre Giriniz : ");
            sifre=input.nextInt();
            if(sifre==123){
                System.out.println("Şifreniz Doğru");
                sifreKontrol=false;
            }
            else{
                System.out.println("Şiferniz Yanlış. Tekrar Deneyiniz.");
            }
        } while (sifreKontrol);
    }
}