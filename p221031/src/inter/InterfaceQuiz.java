package inter;

interface Vehicle {
	abstract void printNumber();
}

class Car implements Vehicle {
	int carNumber;

	public Car(int carNumber) {
		this.carNumber = carNumber;
	}

	public static void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}

	@Override
	public void printNumber() {
		System.out.println("* 자동차 등록번호 : " + this.carNumber);
		Car.drive();
	}

}

class Yacht implements Vehicle {
	int yachtNumber;

	public Yacht(int yachtNumber) {
		this.yachtNumber = yachtNumber;
	}

	public static void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}

	@Override
	public void printNumber() {
		System.out.println("* 요트 등록 번호 : " + this.yachtNumber);
		Yacht.sail();
	}

}

public class InterfaceQuiz {
	public static void main(String[] args) {

		 Vehicle[] myVehicle = new Vehicle[2];
		 
		 myVehicle[0] = new Car(8586);
		 myVehicle[1] = new Yacht(679111);

		 for(int i = 0; i < myVehicle.length; i++) {
			 myVehicle[i].printNumber();
		 }
		 // 반복문으로 메서드 drive , sail 출력 
		 // : method drive와 sail 호출
		 // : [실행 결과]
		 // * 자동차 등록번호 : 8586
		 // 자동차가 고속도로를 달립니다.
		 
		 // * 요트 등록번호 : 679111
		 // 요트를 한강 위를 떠다닙니다.
		 
		 // * 번호 출력을 추상 메서드로 구현, 메서드 이름 printNumber
	}
	
}