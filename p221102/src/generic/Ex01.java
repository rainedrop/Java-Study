package generic;

class Apple {
	@Override
	public String toString() {
		return "사과는 맛있다.";
	}
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다.";
	}
}

class InstanceType {
	int count;
	
	
	/*
	 * [제너릭] 제너릭 generic
	 * - data type은 일반화
	 * - 컴파일할 때, type 결정됨
	 * 
	 */
	
	public <T> void showInstanceType(T type) {		// <자료형>
		System.out.println("type >> " + type);
		count++;
	}
	
	public void showCount() {
		System.out.println("count >> " + this.count);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
		in.showInstanceType(apple);
		in.showCount();
		
		in.showInstanceType(banana);
		in.showCount();
		
	}

}
