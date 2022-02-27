package homework;
//24th
/*
 * 1. Override the taste method from the Candy class in the Chocolate class to return “tastes chocolately”. It should print “tastes sweet!” and then “tastes chocolately”.
*/
  public class candy
 
{
    public String taste()
    {
        return "tastes sweet!";
    }
 
    public static void main(String[] args)
    { 
    	candy c1 = new candy();
        System.out.println(c1.taste());
        candy c2 = new Chocolate();
        System.out.println(c2.taste());
        
    }
}
 
class Chocolate extends candy
{
    // ADD CODE HERE
	 public String taste()
	    { 
	        return "tastes chocolately";
	    }
	 
}
 
/*
 * package homework;
 
2nd */
/*Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
    	super.getName();
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
    	super.getNumberOfTeamMembers();
        System.out.println( "Each team has 11 players in " + getName() );
    }

public static void main(String[] args) {
	Soccer s=new Soccer();
	s.getName();
	s.getNumberOfTeamMembers();
}
}
*/
//3rd problem
/*
 * public class MyClass {
 //Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.

    public static void talk()
    {
          System.out.print("hello ");
    }

    public static void talk(String name){
        System.out.println(name);
    } 

    public static void main(String[] args)
    {  MyClass a=new MyClass();
          a.talk();
          a.talk("mathew");
    }
}
 */

