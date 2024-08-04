import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int i=1;
//        int k;
//        System.out.println("Program Başladı");
//        while (i<=5){
//            System.out.println(i);
//            k=1;
//            while (k<=10){
//                System.out.print(k+ ",");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
//        System.out.println("Program Bitti");


        int sifre;
        boolean sifreKontrol=false;

        Scanner input=new Scanner(System.in);

        while (!sifreKontrol){
            System.out.print("Şifre Giriniz : ");
            sifre=input.nextInt();
            if (sifre==123){
                System.out.println("Şifreniz Doğru");
                sifreKontrol=true;
            }
            else{
                System.out.println("Şifreniz Yanlış. Tekrar Deneyiniz.");
            }
        }
    }
}