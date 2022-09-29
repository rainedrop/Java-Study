// Num.10817

import java.util.Scanner;

public class ThreeNumCompare {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        int A = sc.nextInt();
		        int B = sc.nextInt();
		        int C = sc.nextInt();
		        
		        int result = 0;
		        
		       if (A >= B) {			// A가 B보다 크거나 같고
		    	   if (B >= C) {		// B가 C보다 크거나 같으면
		    		   result = B;	
		    	   } if (C >= B) {
		    		   result = C;
		    	   } else {
		    		   result = A;
		    	   }
		       }
		       if ()
		        
		        System.out.println(result);
		    }
	
	}


