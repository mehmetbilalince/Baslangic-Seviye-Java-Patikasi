public class Main {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean asal = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(num + " ");
            }
        }
    }
}