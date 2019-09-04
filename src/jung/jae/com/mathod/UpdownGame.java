package jung.jae.com.mathod;

public class UpdownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max = 100;
		int Min = 0;
		int goal;
		
		double result = Math.random();
		int answer = (int)(goal * 100)+1;
		while(!result) {
			
			int answer = (Max + Min ) / 2;
			
			if(answer > goal) { 
				Max = answer;
			}else if(answer < goal) { 
				Min = answer + 1;
			}
		}
		


	}

}
