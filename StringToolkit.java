import java.util.Scanner;

public class StringToolkit {

    // String operations
    static void stringOperations(String str) {

        System.out.println("\n--- String Operations ---");

        // Length
        System.out.println("Length: " + str.length());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Reverse using String
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse: " + reverse);

        // Substring
        if (str.length() >= 3)
            System.out.println("Substring: " + str.substring(0, 3));

    }

    // StringBuffer operations
    static void stringBufferOperations(String str) {

        System.out.println("\n--- StringBuffer Operations ---");

        StringBuffer sb = new StringBuffer(str);

        // Append
        sb.append(" Welcome");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(0, "Hello ");
        System.out.println("After insert: " + sb);

        // Delete
        if (sb.length() >= 6)
            sb.delete(0, 6);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        stringOperations(str);
        stringBufferOperations(str);

        sc.close();
    }
}

