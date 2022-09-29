package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {

		int num = 0B00000101;
		System.out.println(num << 2); // 비트연산자 2칸씩 0B00010100 (20)
		System.out.println(num >> 2); // 비트연산자 2칸씩 0B00000001 (1)
		System.out.println(num >>> 2); // 비트연산자 2칸씩 부호는 무조건 0 0B00000001 (1)
		
		System.out.println(num); // num에 대입한 것은 아니므로 그대로 5 출력
		
		num = num << 2; // num에 비트연산자 2칸씩 이동 대입
		System.out.println(num); // 0B00010100; (20)
	}

}
