package book;

public class AnimalInfo {

	private String name = "";
	private int age = 0;
	
	public void showAnimalInfo() {
		System.out.println("name >> " + name);
		System.out.println("age >> " + age);
	}
	
	public AnimalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
}
