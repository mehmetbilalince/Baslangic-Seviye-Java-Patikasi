import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak;

        System.out.print("Basamak Sayısı: ");
        basamak = input.nextInt();


        for (int i = basamak; i > 0; i--) {

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
