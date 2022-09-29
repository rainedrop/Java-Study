
public class Order {

	long orderNum;
	String customerID;
	String orderDate;
	String name;
	String itemNum;
	String address;
	
	public static void main(String[] args ) {
		
		Order order318 = new Order();
		order318.orderNum = 201803120001L;
		order318.customerID = "abc123";
		order318.orderDate = "2018년 3월 12일";
		order318.name = "홍길순";
		order318.itemNum = "PD0345-12";
		order318.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order318.orderNum);
		System.out.println("주문자 아이디: " + order318.customerID);
		System.out.println("주문 날짜: " + order318.orderDate);
		System.out.println("주문자 이름: " + order318.name);
		System.out.println("주문 상품 번호: " + order318.itemNum);
		System.out.println("배송 주소: " + order318.address);
	}
}
