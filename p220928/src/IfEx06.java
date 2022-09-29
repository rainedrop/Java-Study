
public class IfEx06 {

	public static void main(String[] args) {

		int score = 95;
		
		if (score >= 90) {
			System.out.println("점수가 100~90점 입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 89~80점 입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 79~70점 입니다.");
			System.out.println("등급은 C입니다.");
		} else if (score >= 60) {
			System.out.println("점수가 70점 미만 입니다.");
			System.out.println("등급은 D입니다.");			
		}
	}

}
