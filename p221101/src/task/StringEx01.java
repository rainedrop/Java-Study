package task;

public class StringEx01 {
	public static void main(String[] args) {

		String[] str = {"one", "two", "three", "four"};
		String concat = "";		// 빈 문자열
		
		// 일반 for문
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i] + ", ");
//			concat += str[i] + ", ";
//		}
		
		// 향상된 for문
		for (String s : str)
			concat += s + ", ";
		
		
		System.out.println("concat >> " + concat);
	}

}
