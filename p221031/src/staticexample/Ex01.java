package staticexample;

class Thing {
	// 멤버 변수(field) : instance filed, static field 
	private int one;		// instance field
	static int two; // static field
	
	// 멤버 메서드(method) : instance method, static(class) method
	public void printOne() {	// instance method
		System.out.println(this.one);
	}
	
	public static void printTwo() {	// static method
	 // System.out.println(this.one);	// Error! instance field라 static과는 생성 시기가 달라서 불가능
		System.out.println(Thing.two);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// static field
		
		System.out.println("static field >> " + Thing.two);
		
		// static method
		Thing.printTwo();
		
		// object 
		Thing thing = new Thing();
	}

}
