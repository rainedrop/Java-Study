
public class MethodEx05 {

	/*
	 *  [메서드 정의]
	 *  기능 : 정수 2개를 받은 후, 덧셈한 결과를 출력
	 */
	
	/*
	 *  [메서드 오버로딩] Method OverLoading
	 *  같은 이름의 메서드를 여러 개의 정의
	 *  단, 매개변수의 정보가 달라야 함
	 *    (자료형, 계수)
	 *  리턴형과는 관련 없음
	 */
	
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}
	
//	public static int sum (int n1, int n2) {
//		return n1 + n2;
//	}
	
	public static void sum(int n1) {}
	public static void sum(double n1, int n2) {}
	
	public static void main(String[] args) {
		sum(3, 5);
		sum(2.1, 4.5);
		System.out.println(5);
		System.out.println(5.1);
		System.out.println('c');
		System.out.println("안녕~");
	}

}
