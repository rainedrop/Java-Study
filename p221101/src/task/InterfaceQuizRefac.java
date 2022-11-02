package task;

interface Vehicle {
	public abstract void printNumber();		// 인터페이스의 메소드는 기본적으로 public abstract void가 들어간다
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
	public void printNumber() {				// 오버라이딩된 메소드의 범위는 부모보다 최소 같거나 넓어야 한다 (이 경우 public)
		System.out.println("* 자동차 등록번호 : " + this.carNumber);
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
	}

}

public class InterfaceQuizRefac {
	public static void main(String[] args) {

		 Vehicle[] myVehicle = new Vehicle[2];
		 
		 myVehicle[0] = new Car(8586);
		 myVehicle[1] = new Yacht(679111);
//
//		 myVehicle[0].printNumber();
//		 ((Car)myVehicle[0]).drive();
//		 
//		 myVehicle[1].printNumber();
//		 ((Yacht)myVehicle[1]).sail();
		 
		 // 1. 일반 for문
//		 for(int i = 0; i < myVehicle.length; i++) {
//			 myVehicle[i].printNumber();
//			 if (myVehicle[i] instanceof Car)
//				 ((Car)myVehicle[i]).drive();
//			 else if (myVehicle[i] instanceof Yacht)
//				 ((Yacht)myVehicle[i]).sail();
//		 }
		 
		 // 2. 향상된 for문 
		 for (Vehicle v:myVehicle) {
			 v.printNumber();
			 if(v instanceof Car) 
				 ((Car)v).drive();
			 else if(s instanceof Yacht)
				 ((Yacht)v).sail();
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