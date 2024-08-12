import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrisin boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısı: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısı: ");
        int sutun = scanner.nextInt();

        // Matrisi oluştur
        int[][] matris = new int[satir][sutun];

        // Matrisin elemanlarını kullanıcıdan al
        System.out.println("Matrisin elemanlarını giriniz: ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpoz = new int[sutun][satir];

        // Transpoz matrisini hesapla
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisini ekrana yazdır
        System.out.println("Transpoz: ");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
