package jung.jae.com.mathod;

public class UpdownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double random = Math.random();
		int Max = 100;
		int Min = 0;
		int goal = (int)(random * 100)+1;
		boolean result = false;
		int answer = (int)(goal * 100)+1;
		while(result == false) {

			 answer = (Max + Min ) / 2;

			if(answer > goal) { 
				Max = answer;
				System.out.println(answer);
			}else if(answer < goal) { 
				Min = answer + 1;
				System.out.println(answer);
			}else if(answer == goal) {
				result = true;
			}
		}



	}

}
