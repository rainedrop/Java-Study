package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {

		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal); // 자료형이 다르지만 계산 할 때 모두 4바이트 int형으로  
        								 // 변환되기 때문에 값이 제대로 출력
		
	}

}

//1바이트 단위로 데이터를 조작하는 경우도 있으며, C언어나 C++와 호환이 가능하도록 
//short형을 사용하는 경우도 존재