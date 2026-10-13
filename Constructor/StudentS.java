package Constructor;

public class StudentS {
     String name;
     int age;

     StudentS(String n, int a){
      name=n;
      age=a;
     }

     void display(){
      System.out.println(name);
      System.out.println(age);
     }
       public static void main(String args[]){
        StudentS s = new StudentS("Anchal",23);
        StudentS s1 = new StudentS(null, 0);
          s1.name="Chiku";
          s1.age=20;

        s1.display();

        s.display();
       }
}
