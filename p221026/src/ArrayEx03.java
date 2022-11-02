class Person {
	// 멤버 변수 : 인스턴스 변수(객체 변수)
	int age;
	String name;
	
	// 생성자
public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	// 멤버 메서드 : 인스턴스 메서드(객체 메서드)
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name + "\n");
	}
}

public class ArrayEx03 {
	public static void main(String[] args) {
		
		Person[] smart = new Person[3];
		smart[0] = new Person(20, "홍길동");
		smart[1] = new Person(29, "박보검");
		smart[2] = new Person(35, "이미자");
		
//		smart[0].showInfo();
//		smart[1].showInfo();
//		smart[2].showInfo();
//		
		//  일반 for문
		System.out.println("<< 홍길동 나이 변경 전 >>");
		for( int i = 0; i<smart.length; i++) 
			smart[i].showInfo();
		
		// 홍길동의 나이를 변경 : 20 -> 30
		// 모든 사람의 정보 출력 : 향상된 for문 사용
		smart[0].setAge(30);
		
		System.out.println("<< 홍길동 나이 변경 후 >>");
		for (Person p : smart) 
			p.showInfo();
	}
}
