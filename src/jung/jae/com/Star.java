package jung.jae.com;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		 for(i=0 ; i<4 ; i++) {
			 for(j=0 ; j<7 ; j++) {
				 if(3-i <= j && 3+i<= j) { System.out.println("*");
				 }else {System.out.println(" ");
				 }
			 }
		}System.out.println();
				
	}

}
