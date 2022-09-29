
public class Person2 {
	String name;
	float height;
	float weight;
	
	// public Person2() {} 라고 하는 디폴트 생성자를 컴파일러가 자동으로 생성해줌
	// 클래스 내에 아무런 생성자가 없기 때문에
	
	public Person2() {}
	
	public Person2(String pname) { // 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
		name = pname;			   // 이렇게 직접 생성자를 만들 수 있으며 이럴 경우에 디폴트 생성자는 생성되지 않는다.
		
	
	}
}
