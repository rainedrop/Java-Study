import java.util.Scanner;

public class factorial {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int userValue = sc.nextInt();
        long result = 1;
        
        if (userValue == 0) {
            result = 1;
        } else {
           for(int i = 1; i <= userValue; i++) {
           result *= i;
                }
        }
        
        System.out.println(result);
        
    }
}