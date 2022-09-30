
public class ForEx02 {

	public static void main(String[] args) {
		int result = 0;
											 //  for문에서 선언된 변수는 for문 안에서만 쓰이는
		for (int idx = 1; idx < 10; idx++) { //  지역 변수이다.
			result = 2 * idx;
			System.out.println("2 * " + idx + " = " + result);
		}
		
		
	}
}

