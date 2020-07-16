import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringTokens = input.split(" ");
        int[] array = Stream.of(stringTokens).mapToInt(strToken -> Integer.parseInt(strToken)).toArray();

        int rotationAmount = scanner.nextInt();
        rotationAmount = rotationAmount % array.length;

        int[] rotatedArray = new int[array.length];

        for (int j = 0; j < rotatedArray.length; ++j) {
            int i = (j + array.length - rotationAmount) % array.length;
            rotatedArray[j] = array[i];
        }

        for (int v : rotatedArray) {
            System.out.print(v + " ");
        }
    }
}