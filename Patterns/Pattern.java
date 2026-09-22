import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // 1. Pyramid Pattern
        System.out.println("\n1. Pyramid Pattern");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        // 2. Floyd's Triangle
        System.out.println("\n2. Floyd's Triangle");

        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }


        // 3. Pascal Triangle
        System.out.println("\n3. Pascal Triangle");

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            } 

            int value = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }


        // 4. Diamond Pattern
        System.out.println("\n4. Diamond Pattern");

        int nsp = n / 2;
        int nst = 1;
        int ml = n / 2 + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= nsp; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= nst; j++){
                System.out.print("*");
            }

            if (i < ml) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }

            System.out.println();
        }


        // 5. Hollow Rectangle
        System.out.println("\n5. Hollow Rectangle");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }


        // 6. Number Pyramid
        System.out.println("\n6. Number Pyramid");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }

        sc.close();
    }
}