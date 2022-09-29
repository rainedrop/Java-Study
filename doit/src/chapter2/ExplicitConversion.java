package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 더 정밀 - > 덜 정밀이므로 명시적 형 변환
		int iNum4 = (int)(dNum1 + fNum2); // 두 실수가 먼저 계산 된 후 명시적 형 변환 (덜 정밀한 float형이 더 정밀한 double형으로 형 변환)
		System.out.println(iNum3);                                        
		System.out.println(iNum4);
	}

}
