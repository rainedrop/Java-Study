class Baseball {
	// 멤버 변수 : 인스턴스 (객체) 변수
	// int count = 10;
	
	// 멤버 변수 : static(클래스) 변수
	static int count;
	
	// 멤버 메서드 : 인스턴스(객체) 메서드
	void increment() {
		this.count++;
	}
	void decremnet() {
		this.count--;
	}
	void baseballInfo() {
		System.out.println("현재 개수 : " + count );
	}
}

public class VariableStaticEx01 {

	public static void main(String[] args) {
		
		System.out.println("static 멤버 변수 >> " + Baseball.count);
//		System.out.println(Baseball.name);
		
		Baseball b1 = new Baseball();
		b1.increment();
		b1.baseballInfo();
		
		Baseball b2 = new Baseball();
		b2.increment();
		b2.baseballInfo();
		
		System.out.println("static 멤버 변수 >> " + Baseball.count);
		System.out.println("static 멤버 변수 >> " + b1.count); // 이렇게 접근하면 비효율적이므로 클래스를 통한 접근을 하는 것이 좋다
		
	}

}
