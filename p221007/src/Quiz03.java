class ArrayStack {
	// 멤버 변수 : 객체 변수 (인스턴스 변수)
	int[] arr;	
	int top = -1;
	
	// 멤버 메서드
	int peek() {
		return arr[top];
	}
	
	void setArr(int num) {
		arr = new int[num];
	}
//	
//	void push (int num) {
//		if (top > 3) {
//			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
//			return;
//		}
//		arr[++top] = num;
//		System.out.println("Inserted Item : " + num);
//	}
	
	void push (int element) {
		final int SIZE = arr.length-1;
	
		if(top < SIZE) {
			arr[++top] = element;
			System.out.println("Inserted Item : " +  element);
		} else
			System.out.println("스택이 꽉 찼습니다! 용량 초과");
		
	}
	
//	int pop() {
//		if(top < 0) {
//			System.out.println("스택이 비었습니다.");
//			return top;
//		}
//		
//		top -= 1;
//		return arr[top + 1];
//	}
	
	String pop() {
		if (top > 0)
			return Integer.toString(arr[top--]) + "";
		else if (top == 0)
			return Integer.toString(arr[top--]) + "\n스택이 비었습니다.";
		return Integer.toString(top);
		
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		
		stack.setArr(5);
		
		stack.push(20);
		stack.push(15); 
		stack.push(10); 
		stack.push(55); 
		stack.push(8); 
		stack.push(5); 
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());
		
		System.out.println("pop 실행 : " +stack.pop()); // LIFO식이라 인수가 필요없음
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		
	}

}