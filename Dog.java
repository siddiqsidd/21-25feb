//22nd feb
package homework;
/*
 * 1. Edit this code so the class Beagle is a subclass of the Dog class. 
 * When you run the code it should print “woof!” and then “arf arf”
 */
class Dog {


    void speak()
    {
        System.out.println("woof!");
    }
}
class Beagle extends Dog {
    void speak()
    {
       super.speak();
        System.out.println("arf arf");
    }



    public static void main(String[] args)
    {
        Beagle b= new Beagle();
        b.speak();
       // Dog b = new Beagle();
        //b.speak();
    }
}
/* 2.
Add an equals method to this class that returns true if the current Dog and passed Dog have the same name. 
The code should print false twice then true twice.

 * public class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        return true;
    }

    public static void main(String[] args)
    {
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}

 */

