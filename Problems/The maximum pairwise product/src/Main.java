import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; ++i) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int maxId = -1;

        for (int i = 0; i < length; ++i) {
            int v = array[i];
            if (v > max) {
                max = v;
                maxId = i;
            }
        }

        int max2 = 0;

        for (int i = 0; i < length; ++i) {
            if (i == maxId) {
                continue;
            }
            int v = array[i];
            if (v > max2) {
                max2 = v;
            }
        }

        System.out.println(max * max2);
    }
}