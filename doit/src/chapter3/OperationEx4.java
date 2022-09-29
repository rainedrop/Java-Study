package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F'; // ()안이 참이면 앞의 'T'가 출력 아니면 뒤의 'F'가 출력
		
		System.out.println(ch);
	}

}
