import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Compare Two Strings");
            System.out.println("5. Reverse using StringBuffer");
            System.out.println("6. Replace a Word/Substring");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    System.out.print("Enter another string: ");
                    String str2 = sc.nextLine();

                    if (str.equals(str2))
                        System.out.println("Both strings are equal.");
                    else
                        System.out.println("Strings are not equal.");
                    break;

                case 5:
                    StringBuffer sb = new StringBuffer(str);
                    System.out.println("Reversed String = " + sb.reverse());
                    break;

                case 6:
                    System.out.print("Enter word/substring to replace: ");
                    String oldWord = sc.nextLine();

                    System.out.print("Enter new word/substring: ");
                    String newWord = sc.nextLine();

                    System.out.println("After replacement = "
                            + str.replace(oldWord, newWord));
                    break;

                case 7:
                    StringBuffer reverse = new StringBuffer(str);
                    reverse.reverse();

                    if (str.equalsIgnoreCase(reverse.toString()))
                        System.out.println("The string is a palindrome.");
                    else
                        System.out.println("The string is not a palindrome.");
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}

