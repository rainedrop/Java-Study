class Cat extends Object {
	
	@Override
	public String toString() {
		return "Cat class입니다";
	}
}


public class InheritanceEx05 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		System.out.println(3);
		System.out.println(5.5);
		System.out.println(cat);
		System.out.println(cat.toString());
		System.out.println(cat.getClass().getName());
	}

}
