
public class WhileQuiz01 {
	public static void main(String[] args) {

		// WhileEx04.java 파일의 코드를 변경하시오.
		// - continue를 사용하지 않고, 같은 결과가 출력되도록 하시오.
		
		int idx = 0;
		
		while (idx < 10) {
			idx++;
			
		if (idx % 2 == 0) {
			System.out.println("idx >> " + idx);
		}
	}
		
}

}
