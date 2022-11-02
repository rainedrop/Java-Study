package abstractexample;

abstract class Animal {
	String name;

	public Animal() {
		this("미입력");
	}

	public Animal(String name) {
		this.name = name;
	}

	// 추상 메서드 - 선언부만 존재하고 바디가 없음
	public abstract void play();

}

class Cat extends Animal {

	public Cat(String name) {
		super(name);		// 부모의 생성자 호출
	}

	@Override
	public void play() {
		System.out.println(super.name + "는 낚싯대 놀이 중입니다.");
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(super.name + "는 터그 놀이 중입니다.");
	}

}

public class AbstractQuiz {
	public static void main(String[] args) {

		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");
		
		animalPlay(roy); // 로이는 터그 놀이 중입니다.
		animalPlay(bear); // 베어는 낚싯대 놀이 중입니다.
	}

	public static void animalPlay(Animal name) {
		name.play();
	}

}
