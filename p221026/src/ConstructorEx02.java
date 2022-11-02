class Student {
	// 멤버 변수 : 인스턴스(객체) 변수
	int age;
	String name;
	
	// 생성자
	public Student() {
		this(20, "미입력");		// 반드시 첫 번째 라인에 위치해야 한다. 메모리 할당 이후에 생성자가 실행되는 게 순서이기 때문에
		System.out.println(">> 매개변수가 없는 생성자 실행");
//		this.age = 20;
//		this.name = "미입력";
//		this.showInfo();
		System.out.println(">> 매개변수가 없는 생성자 끝");
	}
	Student(String name) {
//		this.age = 20;
//		this.name = name;
//		this.showInfo();
		this(20, name);
	}
	Student(int age, String name) {
		this.age = age;
		this.name = name;
		this.showInfo();
	}
	
	// 멤버 메서드
	public void showInfo() {
		System.out.println("이름은 " + this.name + "이고, 나이는 " + this.age + "입니다.");
	}
}


public class ConstructorEx02 {
	public static void main(String[] args) {
		
		Student noName = new Student();
//		noName.showInfo();		// 출력 - > 이름은 미입력이고, 나이는 0입니다.
		
		Student hong = new Student(29, "홍길동");
//		hong.showInfo(); 		// 출력 - > 이름은 홍길동이고, 나이는 29입니다.
		
		Student park = new Student("박보검");
//		park.showInfo(); 		// 출력 - > 이름은 박보검이고, 나이는 0입니다.
	}

}
