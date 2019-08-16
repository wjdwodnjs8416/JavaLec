package jung.jae.com;

public class UglyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[40];
		for(int i=0 ; i<nums.length ; i++) {
			nums[i] = 10 * (i+1);

		}
		for(int j=0 ; j<nums.length ; j++) {
			System.out.println("nums" + j + " => "+ nums[j]);
		}
	}

}
