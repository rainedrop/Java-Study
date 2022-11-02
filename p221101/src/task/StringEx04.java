package task;

public class StringEx04 {
	public static void main(String[] args) {

		String one = "";		// 빈 문자열	 -> 길이가 0인 문자열
		String two = null;		// 문자열 없음	 
		
		System.out.println("one >> " + one);
		System.out.println("two >> " + two);
		
		// [빈 문자열 확인 1] length() method : 문자열의 길이 0 -------------------
		
		System.out.println("one : 빈 문자열의 길이 >> " + one.length());
		System.out.println("cf) hello 문자열의 길이 >> " + "hello".length()); // "Hello"식으로 쓸 수 있는 건 컴파일러가 자동으로 String으로 변환해서 인식하기 때문
		
		// Error! NullPointerException
//		System.out.println("two : 빈 문자열의 길이 >> " + two.length());
		
		// [빈 문자열 확인 2] isEmprt() method ------------------------------------
		// : JAVA 6 이후 추가 - 문자열의 길이가 0인 경우 true 리턴
		System.out.println("one.isEmpty() >> " + one.isEmpty());
		System.out.println("hello.isEmpty() >> " + "hello".isEmpty());
		System.out.println("공백.isEmpty() >> " + " ".isEmpty());
		// : [cf] isBlank()
		// : JAVA 11 이후 추가 - 빈 문자열이나 공백만으로 이뤄진 경우 true를 리턴
		// : white space를 어떻게 처리할까 ?
		System.out.println("one.isBlank() >> " + one.isBlank());
		System.out.println("공백.isBlank() >> " + "" + "    ".isBlank());
		
		// Error! NullPointerException
//		System.out.println("two.isEmpty() >> " + two.isEmpty());
		
		// [빈 문자열 확인 3] equals() method -------------------------------------
		System.out.println("one.equals() >> : " + one.equals("")); 	// println에 +로 이어주는 이유는 매개변수가 1개이기 때문
		
		// Error! NullPointerException
//		System.out.println("one.equals() >> : " + two.equals("")); 	// 
		
	}

}
