import java.util.*;

class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}