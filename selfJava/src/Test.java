import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
System.out.println("N개의 정수 를 입력시 최대값 최소값 찾아줌.");
Scanner input = new Scanner(System.in);
System.out.println("입력할 정수의 갯수를 입력하시오.");

int n = input.nextInt();
Integer[] arr = new Integer[n];
System.out.println(n+"개의 숫자를 입력하시오.");
for(int i = 0; i < arr.length; i++){
	arr[i] = Integer.parseInt(input.next());
}

int min = arr[0];	// 최소값
int max = arr[0];	// 최대값

for(int i = 1; i < arr.length; i++){
    if(min > arr[i]) {
        min = arr[i];
    }
    if(max < arr[i]) {
        max = arr[i];
    }
}

System.out.print("최소값 : " + min + " 최대값 : " + max);
input.close();

}
}
