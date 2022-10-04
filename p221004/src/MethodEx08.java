
public class MethodEx08 {

	public static void main(String[] args) {

		System.out.println("리팩토링 연습");
		
		extracted();
	}

	public static void extracted() {
		int value = 10;
		value++;
		System.out.println(value);
	}

}
