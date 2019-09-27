package jung.jae.com.mathod;

import javax.swing.JOptionPane;

public class Primenum {

	public static void main(String[] args) {
		//int input = Integer.parseInt(JOptionPane.showInputDialog("input"));
		int sum = 0;
		int count = 0;

		for(int j = 2 ; j<=500 ; j++) {
			boolean result = true;
			for(int i = 2 ; i<j ; i++) {
				if(j % i == 0) {
					result = false;
					break;
				}

			}
			if(result == true) {
				sum = sum + j;
				count = count + 1;
			}

		}
		System.out.println("count : " + count);
		System.out.println("모든 소수의 합은 : " + sum);
	}
}

