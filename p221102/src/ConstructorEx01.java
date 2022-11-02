
class Parent {
	public Parent() {
		System.out.println("Parent() 생성자 실행됨...");
	}
}

class Child extends Parent {
	
	String name;
	
	public Child() {
		super();			// super나 this 모두 첫째 줄에 위치해야 하므로 같이 쓸 수 없다.
//		this("무명");
	}
		
	public Child(String name) {
		this.name = name;
	}
	
}

public class ConstructorEx01 {
	public static void main(String[] args) {

		
		
	}

}
