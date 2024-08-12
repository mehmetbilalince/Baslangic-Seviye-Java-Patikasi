import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.print("Sıralama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
