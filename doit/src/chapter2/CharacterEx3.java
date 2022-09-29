package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {

		int a = 65;
		int b = -66;
		
		char a2 = 65;
		  // char b2 = -66
		 // 문자형 변수에 음수를 넣으면 오류가 발생
		 // type mismatch: cannot convert from int to char
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}

}



//자바는 UTF-16 인코딩을 사용한다 (모든 문자를 2바이트로 표현)
//2바이트보다 더 작은 1바이트를 따로 표현할 수 있는 UTF-8이 좀 더 효율적이기 때문에 인터넷에서는 
//주로 UTF-8을 사용