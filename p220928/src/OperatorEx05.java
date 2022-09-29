
public class OperatorEx05 {

	public static void main(String[] args) {

		// [삼항 연산자] 조건 연산자
		int num = 5;
		
		// [형태 1]
		String result  = (num > 4) ? "크다" : "작거나 같다"; // 삼항 연산자의 조건 부분을 가독성을 위해 괄호로 묶어준다.
		System.out.println("result >> " + result);
		
		// [형태 2] Error! 삼항 연산자는 혼자서 쓰도록 지원이 되지 않고 대입할 변수와 함께 써야한다.
		// (num > 4) ? System.out.println("크다"); : System.out.println("작거나 같다");
	}

}
