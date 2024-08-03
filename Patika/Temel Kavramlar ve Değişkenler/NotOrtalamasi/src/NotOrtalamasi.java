import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenler
        int mat, fizik, kimya, turkce, tarih;

        //Scanner
        Scanner input=new Scanner(System.in);

        //Kullanıcıdan değer al
        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=input.nextInt();

        //Ortalama
        int toplam=(mat+fizik+kimya+tarih+turkce);
        double ortalama=toplam / 5.0;

        System.out.println("Genel Ortalamanız: " + ortalama);
        String durum=(ortalama>=60.0)?"Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);
    }
}
