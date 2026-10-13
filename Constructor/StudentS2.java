package Constructor;

public class StudentS2 {
    String name;
     int age;

     // create constructor
     StudentS2(String name, int age){
      this.name=name;
      this.age=age;
     }

     // copy constructor
     StudentS2(StudentS2 s1){
      this.name=s1.name;
      this.age=s1.age;
     }
   public static void main(String args[]){
        StudentS2 s1 = new StudentS2("Anchal",23); 
        StudentS2 s2= new StudentS2(s1);

        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);

        System.out.println("Name: "+s2.name);
        System.out.println("Age: "+s2.age);
       }
}
