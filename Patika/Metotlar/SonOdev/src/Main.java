import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = input.nextInt();

        recursivePattern(n, n, true);
    }

    static void recursivePattern(int current, int original, boolean isDecreasing) {
        System.out.print(current + " ");

        if (isDecreasing) {
            if (current > 0) {
                recursivePattern(current - 5, original, true);
            } else {
                recursivePattern(current + 5, original, false);
            }
        } else {
            if (current < original) {
                recursivePattern(current + 5, original, false);
            }
        }
    }
}
