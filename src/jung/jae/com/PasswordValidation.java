package jung.jae.com;

import java.util.Scanner;

public class PasswordValidation {
	final static String SIGNS = "!@#$%^&*()-=_+\\|;:'\"/?,.<>~[]{}`";

	final static String BIG_ALPHABETS = "ABCDEFGHIJKLMNOPQLSTUVWXYZ";

	final static String SMALL_ALPHABETS = "abcdefghijklmnopqlstuvwxyz";

	final static String NUMBERS = "0123456789";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String input;
		input = scanner.nextLine();

		String [] arrStr = input.split(" ");
		for(int i=0 ; i<arrStr.length ; i++) {
			System.out.println(arrStr[i]); 
		}
	}

}


