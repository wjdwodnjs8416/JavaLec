package jung.jae.com;

public class Star123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		final int horizon = 7;
		for(i=0 ; i<horizon ; i++) {
			for(int j=0 ; j<horizon ; j++) {
				if(i<4) {
					if(horizon/2-i <= j && horizon/2+i >= j) {
						System.out.print("*");
					}else { System.out.print(" ");

					}
				}else {
					if(horizon+i-10 <= j && horizon-i+2 >= j) {
						System.out.print("*");
					}else { System.out.print(" ");

					}

				}

			}System.out.println();
		}

	}

}
