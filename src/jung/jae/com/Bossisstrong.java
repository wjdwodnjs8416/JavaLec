package jung.jae.com;

public class Bossisstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myHp = 100;
		int bossHp = 100;
		
		myHp = myHp - 99;
		bossHp = bossHp - 100;
		
		if(myHp > 0 && bossHp <= 0) {
			System.out.println("my win");
		}else if(myHp <= 0 && bossHp<= 0) {
			System.out.println("draw");
		}else if(myHp <= 0 && bossHp > 0) {
			System.out.println("boss win");
		}
System.out.println(!true);
System.out.println(!false);
	}

}
