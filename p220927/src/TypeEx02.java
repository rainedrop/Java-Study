
public class TypeEx02 {
	public static void main(String[] args) {
		
		// 논리 자료형
		boolean bool = true;
		System.out.println("bool >> " + bool);
		
		int n1 = 10;
		int n2 = 3;
		double n3 = 3.0;
		
		/*
		 * 자동형변환 (묵시적 형변환) : 작은 크기에서 큰 크기로 바뀔 때 작은 게 큰 것으로
		 * 					            정수와 실수를 같이 계산할 때 정수형이 실수형으로
		 */
		
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1 / (double)n2);
		System.out.println("n1 / n3 = " + n1 / n3);
		
		
	}
}
