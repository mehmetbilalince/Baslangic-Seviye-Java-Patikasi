import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, Sifre, yeniSifre;
        int select1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        Sifre = input.nextLine();

        if (kullaniciAdi.equals("bilal") && Sifre.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Şifrenizi Sıfırlamak İster misiniz?\n1-Sıfırlansın\n2-Sıfırlanmasın");
            select1 = input.nextInt();
            input.nextLine();

            switch (select1) {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yeniSifre = input.nextLine();

                    if (yeniSifre.equals(Sifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre Oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama işlemi yapılmadı.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }
        }
    }
}
