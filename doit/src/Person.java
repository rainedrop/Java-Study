
public class Person {
	
	int age;
	String name;
	Boolean married;
	int countChildren;
	
	 public static void main(String[] args) {
		 Person PersonJames = new Person();
		 PersonJames.age = 40;
		 PersonJames.name = "James";
		 PersonJames.married = true;
		 PersonJames.countChildren = 3;
	 
		 System.out.println(PersonJames.age);
		 System.out.println(PersonJames.name);
		 System.out.println(PersonJames.married);
		 System.out.println(PersonJames.countChildren);
	 }
	 
}
