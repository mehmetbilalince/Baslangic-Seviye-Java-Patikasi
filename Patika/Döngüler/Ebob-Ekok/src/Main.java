import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;

        int k = n1;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
            k--;
        }

        int i = 1;
        int ekok = 0;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
