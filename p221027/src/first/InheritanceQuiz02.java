package first;

import java.io.PrintStream;

class Animal {
	int leg;
	String name;
	
	public Animal() {
		
	}
	public Animal(int leg, String name) {
		this.leg = leg;
		this.name = name;
	}
}

class Cat extends Animal {
	// 생성자
	public Cat(int i, String string) {
		super.leg = i;
		super.name = string;
	}
	
	
	// toString() 오버라이딩
	public String toString(){
		return name + "는 고양이입니다.";
	}
		
}

class Dog extends Animal {
	// 생성자
	public Dog(int i, String string) {
		super.leg = i;
		super.name = string;
	}
	public String toString(){
		return name + "는 강아지입니다.";
	}
	
	
}

public class InheritanceQuiz02 {

	public static void main(String[] args) {
		
		Cat mimi = new Cat(5, "미미");
		Dog hoya = new Dog(3, "호야");
		
		System.out.println(mimi.toString());
		System.out.println(hoya.toString());
			
	}

}
