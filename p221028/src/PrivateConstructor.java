// 상속 금지 : final class, private constructor(반드시 부모 생성자를 호출해야 하는데 불가능하기 때문)
class Fruit {
	
	private Fruit() {}; 
	// 기본 생성자
		// private constructor : 상속 불가능, 객체 생성 불가능
}

//class Banana extends Fruit {
//	
//	public Banana() {
//		super();
//	}
//}

public class PrivateConstructor {
	public static void main(String[] args) {
		
//		Fruit fruit = new Fruit();
		
	}

}
