package homework;
//3rd question
/*
 *- create class Animal with various variables and methods in it to demonstrate 
- create multiples objects like dog, cat, cow, elephant etc and demomnstrate various approches to assign values to variables
- auto generate getters and setters
- demonstrate constructor chanining and create objects by passing no values, lesser value and more values
-create static variable age and create a static method inside class named incrementAge() and inside increment the age whenever 
this method called (please keep break pointer and check what happens and value inside this method 
when you call from different objects
 "
 */
public class Animal {
	String food;
	int size;
	String color;
	int age;
	public Animal(int age) {
		this.age=age;
	}
	public Animal(String food,int size,String color,int age) {
		this.food=food;
		this.size=size;
		this.color=color;
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age+1;
	}
	/*class dog extends Animal{

		public dog(String food, int size, String color, int age) {
			super(food, size, color, age);
			System.out.println("inside dog");
		}
		
	}
	class cat extends dog{

		public cat(String food, int size, String color, int age) {
			super(food, size, color, age);
			// TODO Auto-generated constructor stub
			System.out.println("inside cat");
		}
		
	}*/
 public static void main(String []args) {
	 Animal a1=new Animal("veg",20,"black",25);
	 Animal a2=new Animal(60);
	 
	 System.out.println(++a1.age);
	 System.out.println(a1.age+1);
 }
}
