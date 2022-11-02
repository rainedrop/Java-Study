/*
 * [상속관계] IS-A 관계
 *  - ~는 ~다
 *    ex1) 학생은 사람이다. (O)
 *    ex2) 사람은 학생이다. (X)
 *    
 * [포함 관계]
 *  - ~는 ~를 포함(소유)하고 있다.
 * 	  ex1) 폰은 카메라를 포함하고 있다. (O)
 * 	  ex2) 카메라는 폰을 포함하고 있다. (X)
 * 
 *    ex1) 경찰이 총을 소유하고 있다. (O)
 *    ex2) 총이 경찰을 소유하고 있다. (X)
 */

class Gun {
	int bullet;
	
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
class Police{
	int handcuffs;
// containment
	Gun pistol; // 참조변수가 멤버 변수로 올 수 있다. 자주 씀
	
	public Police(int bnum, int bcuff) {
		handcuffs = bcuff;
		if(bnum != 0)
			pistol = new Gun(bnum);
		else
			pistol = null;
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shoot() {
		if(pistol == null)
			System.out.println("Hut BBANG!");
		else 
			pistol.shoot();
	}
}

public class InheritanceHASA {

	public static void main(String[] args) {
		
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
	}
	
}
