package jung.jae.com;

import java.util.Scanner;

public class Pass123 {


	// TODO Auto-generated method stub
	final static String SIGNS = "!@#$%^&*()-=_+\\|;:'\"/?,.<>~[]{}`";

	final static String BIG_ALPHABETS = "ABCDEFGHIJKLMNOPQLSTUVWXYZ";

	final static String SMALL_ALPHABETS = "abcdefghijklmnopqlstuvwxyz";

	final static String NUMBERS = "0123456789";



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input;

		input = scanner.nextLine();



		String [] arrStr = input.split("");

		if(arrStr.length >= 8 && arrStr.length <= 15) {

			System.out.println("�Է��� ��й�ȣ�� 8�� �̻� 15�� ���� �Դϴ�.");

		}else {

			System.out.println("�Է��� ��й�ȣ�� 8�� �̻� 15�� ���ϰ� �ƴմϴ�.");

		}
		for(int i=0 ; i<arrStr.length ; i++) {
			System.out.println(arrStr[i]);
		}
		
		
	        boolean result = false;

	        for(int i=0; i<arrStr.length; i++) {

	        	if(result = SIGNS.contains(arrStr[i])) {

	        		break;

	        	}

	        }





	        if(result == true) {

	        	System.out.println("��й�ȣ�� ��ȣ(SIGN)�� ���ԵǾ� �ֽ��ϴ�.");

	        }else {

	        	System.out.println("��й�ȣ�� ��ȣ(SIGN)�� ���ԵǾ� ���� �ʽ��ϴ�.");

	        }


/*
	        result = false;

	        for(int i=0; i<arrStr.length; i++) {

	        	if(result = NUMBERS.contains(arrStr[i])) {

	        		break;

	        	}

	        }



	        if(result == true) {

	        	System.out.println("��й�ȣ�� ����(NUMBERS)�� ���ԵǾ� �ֽ��ϴ�.");

	        }else {

	        	System.out.println("��й�ȣ�� ����(NUMBERS)�� ���ԵǾ� ���� �ʽ��ϴ�.");

	        }



	        result = false;

	        for(int i=0; i<arrStr.length; i++) {

	        	if(result = BIG_ALPHABETS.contains(arrStr[i])) {

	        		break;

	        	}

	        }

	        if(result) {

	        	System.out.println("��й�ȣ�� �빮��(BIG_ALPHABETS)�� ���ԵǾ� �ֽ��ϴ�.");

	        }else {

	        	System.out.println("��й�ȣ�� �빮��(BIG_ALPHABETS)�� ���ԵǾ� ���� �ʽ��ϴ�.");

	        }



	        result = false;

	        for(int i=0; i<arrStr.length; i++) {

	        	if(result = SMALL_ALPHABETS.contains(arrStr[i])) {

	        		break;

	        	}

	        }

	        if(result) {

	        	System.out.println("��й�ȣ�� �빮��(SMALL_ALPHABETS)�� ���ԵǾ� �ֽ��ϴ�.");

	        }else {

	        	System.out.println("��й�ȣ�� �빮��(SMALL_ALPHABETS)�� ���ԵǾ� ���� �ʽ��ϴ�.");

	        }
		 */
	}




}


