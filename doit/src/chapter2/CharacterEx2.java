package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {

		char ch1 = '한';
		char ch2 = '\uD55C'; // '한' 이라는 글자의 유니코드값 (16진수, 16진수 숫자 하나 당 4비트 사용)
		                     // 4비트 4개, 즉 2바이트 사용 
		
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
