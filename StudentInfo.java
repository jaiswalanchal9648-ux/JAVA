
import java.util.Scanner;

// create an class named StudentInfo
public class StudentInfo {
     int rollno;
     String name;
     float math_marks;
     float ada_marks;
     float dbms_marks;
     

    // Constructor
    StudentInfo(int rollno, String name, float math_marks, float ada_marks, float dbms_marks) {
        this.rollno = rollno;
        this.name = name;
        this.math_marks = math_marks;
        this.ada_marks = ada_marks;
        this.dbms_marks = dbms_marks;
    }


    // method to calculate total_marks
    float total_marks(){
        return math_marks+ada_marks+dbms_marks;
    }

    // method to calculate percentage
    float percentage(){
        return total_marks()/3;
    }

    // method to calculate grade
    String grade() {
        float per = percentage();

        if (per >= 90 && per <= 100)
            return "A+";
        else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "F";
    }

     // method to display result
    void display() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Roll No     : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Math Marks  : " + math_marks);
        System.out.println("ADA Marks   : " + ada_marks);
        System.out.println("DBMS Marks  : " + dbms_marks);
        System.out.println("Total Marks : " + total_marks());
        System.out.println("Percentage  : " + percentage());
        System.out.println("Grade       : " + grade());
    }


    // main method

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Math Marks: ");
        float math = sc.nextFloat();

        System.out.print("Enter ADA Marks: ");
        float ada = sc.nextFloat();

        System.out.print("Enter DBMS Marks: ");
        float dbms = sc.nextFloat();

        // create object
        StudentInfo s1=new StudentInfo(roll, name, math, ada, dbms);

        // display result
        s1.display();

        sc.close();
    }

    
}




