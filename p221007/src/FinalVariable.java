
public class FinalVariable {

	public static void main(String[] args) {

		int num = 5;
		num++;
		System.out.println("num >> " + num);
		
		// -----------------------------------------
		// 변수 : 값 변경 금지, 변수 상수화
		// final 변수
		// : 초기화한 값으로 고정
		// : 변수의 값 변경이 금지
		// : final ,변수는 이름이 모두 대문자
		// -----------------------------------------
		
		final int COUNT = 20;
//		COUNT--;
		System.out.println("우리 인원수 >> " + COUNT);
		
//		COUNT = 100;
	}

}
