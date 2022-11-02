package polymorphism;

public class Ex02 {
	public static void main(String[] args) {

		Parent p  = new Parent();
		Son s = new Son();
		Daughter d = new Daughter();
		
		// 다형성
		Parent p2 = new Son();
		
		// 형변환 가능 여부 확인
		// 문법 : 참조변수 or 객체 instanceof 자료형
		// instanceof 1. 일치 or 2. 상속 -> true 
		
		System.out.println("Parent type과 비교");
		System.out.println(p instanceof Parent); // 참조변수 p의 주소가 type Parent의 객체와 관련이 있는 지 여부
		System.out.println(s instanceof Parent); 
		System.out.println(d instanceof Parent);
		System.out.println(p2 instanceof Parent);
		
		System.out.println("Son type과 비교");
		System.out.println(p instanceof Son); 
		System.out.println(s instanceof Son); 
//		System.out.println(d instanceof Son); Error!
		System.out.println(p2 instanceof Son); 
		
		Parent[] mother = {new Son(), new Daughter()};
		((Son)mother[0]).study(); 		// 우선순위 때문에 Study부터 실행됨
		((Daughter)mother[1]).play();
		
		
//		향상된 for문
//		for(자료형 변수명: 참조변수)
		for(Parent parent: mother) {
			if(parent instanceof Son)			
				((Son) parent).study();
			else if (parent instanceof Daughter)
				((Daughter) parent).play();
		}
		
	}   
	
}