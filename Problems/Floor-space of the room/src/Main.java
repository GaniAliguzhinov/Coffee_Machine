import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Main {
    public static void main(String[] args) {
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        switch (str) {
            case "triangle": {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double area = sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            }
            case "rectangle": {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            }
            case "circle": {
                double r = scanner.nextDouble();
                System.out.println(pow(r, 2) * pi);
                break;
            }
            default:
                System.out.println("Don't know such a shape");
                break;
        }
    }
}