package Chapter7;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		int size = 0;
	
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 0.0;
		
		for(int i = 0;i < size; i++) {
				System.out.println(num[i]);
				total *= num[i];
				
				System.out.println("total = " +  total);
		}
		
		}
}
