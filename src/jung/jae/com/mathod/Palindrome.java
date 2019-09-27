package jung.jae.com.mathod;

public class Palindrome {

	public boolean get(String inputStr) {
		boolean isPalindrome = true;

		int input = Integer.parseInt(inputStr);
		int inputArr[] = new int[inputStr.length()];

		for(int i = 0 ; i<inputArr.length ; i++) {
			inputArr[i] = input % 10;
			input /= 10;
		}
		for(int i = 0 ; i<inputArr.length/2 ; i++) {
			if(inputArr[i] != inputArr[inputArr.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}



}
