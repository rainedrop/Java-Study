package task;

public class StringEx02 {
	public static void main(String[] args) {

		String[] str = {"one", "two", "three", "four"};
		String con = "";		// 빈 문자열
//		
//		System.out.println((str[0] + str[1] + str[2] + str[3]));
//		// [문법] 문자열.concat(문자열)
//		System.out.println(str[0].concat(str[1]));
//		
		
		// ���� for��
		for(String s:str)
			con = con.concat(s);	// con에 대입 후 저장해야 한다.
//			con = con.concat(s).concat(", ");	// 가능		
//			con = con.concat(s + ", ");			// 가능	
			
		System.out.println("concat >> " + con);
	}

}
