package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // num1 부분이 false이기 때문에 뒤의 i 부분이 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // num1 부분이 true이기 때문에 결과가 true로 뒤의 i 부분이 실행되지 않음
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
