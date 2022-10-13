
public class ArrayEx15 {  // 문자열을 모르스 부호로 변환하는 예제 char배열 대신 String 사용

	public static void main(String[] args) {

		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-.", "-..", "."
						 ,"..-,-", "--.", "....", "..", ".----"
						 , "-.-", ".-..", "--", "-.", "---"
						 , ".--.", "--.-",".-.", "....", "-"
						 , "..-", "...-", ".--", "-..-", "-.--"
						 , "--.." };
		
		String result ="";
		
		for(int i = 0; i <source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		System.out.println("source:"+ source);
		System.out.println("morse:"+result);
	}

}
