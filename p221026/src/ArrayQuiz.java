class Fruit2 {
	String sort;
	int count;
	
	public Fruit2(String sort, int count) {
		this.sort = sort;
		this.count = count;
	}
	
	public void Fruit2Info() {
		System.out.println(this.sort +"가 " + this.count + "개 있습니다.");
	}
}
public class ArrayQuiz {

	public static void main(String[] args) {
		// 길이가 3인 객체 배열 생성
		
		Fruit2[] fruit2 = new Fruit2[3];
		fruit2[0] = new Fruit2("사과", 5);
		fruit2[1] = new Fruit2("바나나", 2);
		fruit2[2] = new Fruit2("망고", 3);
		
		// 1) 배열 요소(객체)의 정보 출력 - > 2) 향상된 for문으로 변경
		
		// 1) 
		for (int i = 0; i < fruit2.length; i++ )
			fruit2[i].Fruit2Info();
		System.out.println();
		
		// 2)
		for (Fruit2 f:fruit2) {
			f.Fruit2Info();
		}
	}

}
