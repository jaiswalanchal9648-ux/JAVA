import java.util.Scanner;

public class Operators {
  public static void main(String [] args){
      Scanner sc= new Scanner(System.in);

      System.out.print("Enter first integer: ");
      int a=sc.nextInt();

      System.out.print("Enter second integer: ");
      int b=sc.nextInt();


      System.out.println("\nArithmetic operations");
      System.out.println("Addition       : "+ (a+b));
      System.out.println("Subtraction    : " + (a - b));
      System.out.println("Multiplication : " + (a * b));
      System.out.println("Modulus        : " + (a % b));


      if(b==0){
        System.out.println("Enter valid number: ");
      }else{
        System.out.println("Division       : " + (a / b));
      }

      
        System.out.println("\n--- Relational Operations ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));


        System.out.println("\n--- Logical Operations ---");
        System.out.println("(a > 0) && (b > 0) : " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b > 0) : " + ((a > 0) || (b > 0)));
        System.out.println("!(a > 0)           : " + !(a > 0));


        System.out.println("\n--- Bitwise Operations ---");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a << b: " + (a << b));
        System.out.println("a >> b: " + (a >> b));
      sc.close();
      
  }
}
