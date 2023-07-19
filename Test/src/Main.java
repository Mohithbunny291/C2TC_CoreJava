import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        int[] output = new int[8];
        for (int i = 0; i < 8; i += 2) {
            output[i] = calculateMinDistance(arr[i], arr[i + 1]);
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(output[i] + " ");
        }

        sc.close();
    }

    private static int calculateMinDistance(int x, int y) {
        int left = Math.abs(x - 1);
        int right = Math.abs(7 - x);
        int up = Math.abs(y - 1);
        int down = Math.abs(7 - y);

        return Math.min(Math.min(left, right), Math.min(up, down));
    }
}
