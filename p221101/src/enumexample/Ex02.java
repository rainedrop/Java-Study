package enumexample;

enum SeasonTwo {
	// [field] 멤버 변수
	// : static final  - > 상수화
	// : 따라서 외부에서 값 변경이 불가능 -> 타입 변경에 안전함.
	// : enum 멤버 변수는 switch문에서 사용 가능
	SPRING, SUMMER, FALL, WINTER;		// 클래스 안에 static final 객체 생성
										// 출력시 문자열이 나오지만 같은 참조변수
	// private SeasonTwo() {}
}


public class Ex02 {
	public static void main(String[] args) {
		// 1. enum의 생성자의 접근 권한은 자동으로 private으로 설정되어 객체 생성이 불가능
//		SeasonTwo St = new SeasonTwo();		
		
		// 2. 출력
		System.out.println(SeasonTwo.SPRING);
		System.out.println(SeasonTwo.SUMMER);
		System.out.println(SeasonTwo.FALL);
		System.out.println(SeasonTwo.WINTER);
		
		// 3. 
		SeasonTwo spring = SeasonTwo.SPRING;
		System.out.println("spring >> " + spring);
		
		SeasonTwo spring2 = SeasonTwo.SPRING;
		
		if (spring == spring2) 		// 생성한 객체는 1개이고 주소만 여러 개 나오는 것이라 값은 같다.
			System.out.println("true");
		else 
			System.out.println("false");
		
		// 4. 열거형의 클래스명
		System.out.println(SeasonTwo.SPRING.getDeclaringClass());
		
		// 5. 열거형의 상수명 확인
		System.out.println(SeasonTwo.SPRING.name());
		
		// 6. 열거형 상수를 배열 형태로 리턴
		System.out.println(SeasonTwo.values());
		
		for(SeasonTwo St: SeasonTwo.values()) {	//enum은 배열 형태로 관리됨
			System.out.println(St);
		}
		
		// 7. 
		for(SeasonTwo St: SeasonTwo.values()) {
			System.out.print(St.ordinal() + 1 + " : " );	// 인덱스 번호
			System.out.println(St);
		}
		
		// 8. switch문
		SeasonTwo currentSeason = SeasonTwo.FALL;
		
		switch(currentSeason) {
			case SPRING : 
					System.out.println("봄에는 취업을 하지요");
					break;
			case SUMMER : 
					System.out.println("여름에는 휴가를 가지요");
					break;
			case FALL : 
					System.out.println("가을에는 공부합니다");
					break;
			case WINTER : 
					System.out.println("겨울에는 연봉 협상합니다.");
					break;
		}
	}

}
