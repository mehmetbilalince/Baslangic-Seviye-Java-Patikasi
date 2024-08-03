import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day;
        System.out.print("1 ile 7 arasında bir değer giriniz: ");
        Scanner input=new Scanner(System.in);
        day= input.nextInt();

        switch (day){
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumaertesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız.");
        }
    }
}