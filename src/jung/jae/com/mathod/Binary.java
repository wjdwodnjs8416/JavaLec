package jung.jae.com.mathod;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = Integer.parseInt(JOptionPane.showInputDialog("10진수 넣어라 새@끼야"));
		int B[] = new int[8];
		int C = 0;
		int D = 0;

		for(int i = 0 ; i<=4 ; i++) {
			C = A % 2;
			D = A / 2;
			B[i] = C;
			A = D;
		}
		System.out.println("A : " + A);
		System.out.println(Arrays.toString(B));

	}
}


