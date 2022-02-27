/*
1. Modify the class to add a isTails method that returns true when the value is not heads.
*/
package homework;

public class coin
{

   // constant to represent heads
   private static int TAILS = 1;

   // current value of the coin
   private int value = 0;

   // method to randomly set the value of the coin to heads or tails
   public void flip()
   {
      if (Math.random() < 0.5)
      {
          value = 0;
      }
      else
      {
         value = 1;
      }
   }

   // return true if the value is heads or false otherwise
   public boolean isTail()
   {
      return value == TAILS;
   }

   // convert the value to a string
   public String toString()
   {
      if (value == TAILS) return "TAILS";
      else return "HEADS";
   }

   // test the class
   public static void main(String[] args)
   {

      coin myCoin = new coin();
      for (int i = 0; i < 10; i++)
      {
         myCoin.flip();
         System.out.println(myCoin);
         System.out.println(myCoin.isTail());
      }
   }
}
/*
2. Modify the code below to add more constructors. Also modify the main method to test the new constructors.
*/
/*
package homework;

public class Person
{
   // fields
   private String name;
   private String email;
   private String phoneNumber;

   // constructor
   public Person(String theName)
   {
      this.name = theName;
   }
   public Person(String theName,String  theEmail,String thePhonenumber)
   {
      this.name = theName;
      this.email=theEmail;
      this.phoneNumber=thePhonenumber;
   }

   // methods - getters
   public String getName() { return this.name;}
   public String getEmail() { return this.email;}
   public String getPhoneNumber() { return this.phoneNumber;}

   // methods - setters
   public void setName(String theName) { this.name = theName;}
   public void setEmail(String theEmail) {this.email = theEmail;}
   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
   public String toString()
   {
      return this.name + " " + this.email + " " + this.phoneNumber;
   }

   // main method for testing
   public static void main(String[] args)
   {
      Person p1 = new Person("Sana");
      System.out.println(p1);
      Person p2 = new Person("Jean");
      p2.setEmail("jean@gmail.com");
      p2.setPhoneNumber("404 899-9955");
      System.out.println(p2);
      Person p3=new Person("sid","sid199@gmail.com","9876543213");
      System.out.println(p3);
   }
}
*/

/*3rd problem finding compile time error
 * 
 * package pack2;
 import java.lang.reflect.*;
class A
{
    public A()
    {
        //public constructor
    }

 public static void main(String[] args)
{
    A a = new A();   
}
}
 */






