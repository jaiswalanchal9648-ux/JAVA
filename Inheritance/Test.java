
   // Single inheritance 
   class BaseA{
       BaseA(){
        System.out.println("I'm in base class ");
       }

       void show(){
        System.out.println("I'm in base class, show");
       }
    
   }

   class DerivedB extends BaseA{
      DerivedB(){
        System.out.println("I'm in derived class");
      }

      void display(){
        System.out.println("I'm in derived class, display");
      }
   }

public class Test {

  public static void main(String[] args){
    DerivedB d= new DerivedB();
    d.show();
    d.display();
  }
  
}
