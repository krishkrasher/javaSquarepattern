import java.util.*;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR SQUARE PATTERN");
        int a = sc.nextInt();

        for (int i = 1; i < a * 2; i++) {
            for (int j = 1; j < a * 2; j++) {

                if (i == 1 || j == 1 || i == a * 2 - 1 || j == a * 2 - 1) {
                    System.out.printf("%d ", a);
                } else if (i == 2 || j == 2 || i == a * 2 - 2 || j == a * 2 - 2) {
                    System.out.printf("%d ", a - 1);
                } else if (i == 3 || j == 3 || i == a * 2 - 3 || j == a * 2 - 3) {
                    System.out.printf("%d ", a - 2);
                } else if (i == 4 || j == 4 || i == a * 2 - 4 || j == a * 2 - 4) {
                    System.out.printf("%d ", a - 3);
                } else if (i == 5 || j == 5 || i == a * 2 - 5 || j == a * 2 - 5) {
                    System.out.printf("%d ", a - 4);
                } else if (i == 6 || j == 6 || i == a * 2 - 6 || j == a * 2 - 6) {
                    System.out.printf("%d ", a - 5);
                } else if (i == 7 || j == 7 || i == a * 2 - 7 || j == a * 2 - 7) {
                    System.out.printf("%d ", a - 6);
                } else if (i == 8 || j == 8 || i == a * 2 - 8 || j == a * 2 - 8) {
                    System.out.printf("%d ", a - 7);
                } else if (i == 9 || j == 9 || i == a * 2 - 9 || j == a * 2 - 9) {
                    System.out.printf("%d ", a - 8);
                }
            }
            System.out.println();
        }
    }
}