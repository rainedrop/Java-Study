
public class InstanceEx04 {

	// 메서드 정의
	
	public static void newYear(Student student) {
		System.out.println("이름 >> " + student.name);
		System.out.println("나이 >> " + student.age++ + "\n");
	}
	
	public static void main(String[] args) {
		System.out.println("main method 실행 시작 >>> ");
		
		Student hong = new Student();
		hong.age = 25;
		hong.name = "홍길동";
		
		newYear(new Student());
		
		Student park = new Student();
		park.age = 30;
		park.name = "박보검";
		
		newYear(hong);
		System.out.println("홍길동의 나이 >> " + hong.age + "\n");
		
		newYear(park);
		System.out.println("박보검의 나이 >> " + park.age);
	}

}
