class Car {
	// 멤버 변수 : instance(객체) 변수(field), static (class) 변수
	// instance 변수
	int door;
	String color;
	
	// 생성자
	 Car() {
		 this.door = 4;
		 this.color = "black";
	 }
	// 멤버 메서드 : instance(객체) 메서드, static(class) 메서드
	// instance(객체) 메서드

	 Car(int door) {
		this(door, "black");
	}
	Car(String color) {
		this(4, color);
	}
	Car(int door, String color) {
		this.door = door;
		this.color = color;
	}
	// 멤버 메서드
	void carInfo() {
		System.out.println("문 개수 : " + door);
		System.out.println("색 : " + color + "\n");
	}
}

public class ConstructorQuiz {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.carInfo();
		
		Car c2 = new Car(2);
		c2.carInfo();
		
		Car c3 = new Car("White");
		c3.carInfo();
		
		Car c4 = new Car(6, "grey");
		c4.carInfo();
	}

}
