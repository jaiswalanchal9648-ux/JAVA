import java.util.Scanner;

 public class conditions {
   public static void main(String [] arg){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your age: ");
      int age=sc.nextInt();
  

      // if-else condition
      if(age>=18){
        System.out.println("Adult");
      }
      else{
        System.out.println("Not adult");
      }

       sc.close();

  }

  
}
