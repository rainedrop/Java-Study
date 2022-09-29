package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {

		int gameScore = 150; // 점수는 150
		
		int lastScore1 = ++gameScore; // gameScore에 1을 더한 값을 lastScore1에 대입
		System.out.println(lastScore1); // lastScore1 출력
		
		int lastScore2 = --gameScore; // gameScore(위의 수식 때문에 현재 151)에 1을 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2); // lastScore2를 출력
	}

}
