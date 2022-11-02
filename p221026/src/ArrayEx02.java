
public class ArrayEx02 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		
		/* [첫 번째] 
		객체 배열 생성
		String[] strArr = new String[3]; 
	 	객체 배열에 주소되는 것은 주소, 메모리 상에는 참조변수만 연속으로, 객체는 연속적일 수도 아닐 수도 있음.
		
		strArr[0] = new String("Java");
		strArr[1] = new String("HTML");
		strArr[2] = new String("CSS"); */
		
		/* [두 번째]
		String[] strArr = new String[] {new String("Java"), new String("HTML"), new String("CSS")}; */
		
		/* [세 번째] 
			String[] strArr = {new String("Java"), new String("HTML"), new String("CSS")}; */
			
		// [네 번째]
			String[] strArr = {"Java", "HTML", "CSS"}; // String이라 가능  
		
		/* 일반 for문
		for(int i = 0; i<strArr.length; i++)
			System.out.println(strArr[i]); */
			
		// 향상된 for문
		for(String str: strArr) {
			System.out.println(str);
		}
	}

}
