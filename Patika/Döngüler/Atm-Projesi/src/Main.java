import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int girisHakki = 3;
        int cuzdan = 1500;
        int select;

        while (girisHakki > 0) {
            System.out.print("Kullanıcı Adınız : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifreniz : ");
            sifre = input.nextLine();

            switch (kullaniciAdi) {
                case "Patika":
                    if (sifre.equals("1234")) {
                        System.out.println("Giriş başarılı, hoş geldiniz!");
                        do {
                            System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
                            System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                            select = input.nextInt();

                            switch (select) {
                                case 1:
                                    System.out.print("Para Miktarı : ");
                                    int paraYatir = input.nextInt();
                                    cuzdan += paraYatir;
                                    System.out.println("Yeni Bakiyeniz : " + cuzdan);
                                    break;
                                case 2:
                                    System.out.print("Para Miktarı : ");
                                    int paraCek = input.nextInt();
                                    if (paraCek > cuzdan) {
                                        System.out.println("Bakiye Yetersiz");
                                    } else {
                                        cuzdan -= paraCek;
                                        System.out.println("Yeni Bakiyeniz : " + cuzdan);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Bakiyeniz : " + cuzdan);
                                    break;
                                case 4:
                                    System.out.println("Çıkış Yapılıyor...");
                                    break;
                                default:
                                    System.out.println("Geçersiz işlem. Lütfen tekrar deneyin.");
                                    break;
                            }
                        } while (select != 4);
                        System.out.println("Tekrar Görüşmek Üzere");
                        return;
                    } else {
                        girisHakki--;
                        System.out.println("Hatalı şifre. Kalan giriş hakkı: " + girisHakki);
                        if (girisHakki == 0) {
                            System.out.println("Giriş hakkınız kalmadı. Hesabınız kilitlendi.");
                        }
                    }
                    break;
                    default:
                    girisHakki--;
                    System.out.println("Hatalı kullanıcı adı. Kalan giriş hakkı: " + girisHakki);
                    if (girisHakki == 0) {
                        System.out.println("Giriş hakkınız kalmadı. Hesabınız kilitlendi.");
                    }
                    break;
            }
        }
        input.close();
    }
}
