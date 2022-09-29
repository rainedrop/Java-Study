package chapter5;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2); 
		System.out.println(sum);
		
		int Minus = minusNum(num1, num2);
		System.out.println(Minus);
		
		int Multiple = multipleNum(num1, num2);
		System.out.println(Multiple);
		
		int Devide = devideNum(num1, num2);
		System.out.println(Devide);
	}
	
	public static int addNum(int n1, int n2) { 
		int result = n1 + n2;				   
		return result;						  
	}
	
	public static int minusNum(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int multipleNum(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int devideNum(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
