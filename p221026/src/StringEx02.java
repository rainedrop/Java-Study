
public class StringEx02 {

	public static void main(String[] args) {
		// [자료형]
		// 기본 자료형 : primitive type
		// 참조 자료형 : reference type
		// 참조형 - > 기본형 : unboxing
		int[] arr = new int[] {2,4}; // int는 기본 자료형이므로 Integer로 자동 형변환 된다.
		
		int one = 10;
		int two = new Integer(10);				// auto unboxing
		int three = (int)new Integer(10);		// unboxing
		
		Integer four = new Integer(10);
		Integer five = 10;						// auto boxing // int가 Integer로 변환되어 저장
		Integer six = (Integer)10;				// boxing
		
		if(five == four)
			System.out.println("같다");
		else 
			System.out.println("다르다");
	}

}
