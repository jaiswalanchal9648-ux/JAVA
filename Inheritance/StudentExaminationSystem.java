class Student {
    protected int rollNo;
    protected String name;

    void setStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}


// Intermediate class
class Examination extends Student {
    protected int marks1;
    protected int marks2;
    protected int marks3;

    void setMarks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void displayMarks() {
        System.out.println("ADA marks: " + marks1);
        System.out.println("DBMS marks: " + marks2);
        System.out.println("JAVA marks: " + marks3);
    }
}


// Derived class
class Result extends Examination {

    void calculateResult() {
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}


public class StudentExaminationSystem {
    public static void main(String[] args) {

        Result s = new Result();

        s.setStudent(101, "Anchal");
        s.setMarks(80, 75, 90);

        s.displayStudent();
        s.displayMarks();
        s.calculateResult();
    }
}