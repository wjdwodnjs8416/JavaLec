package jung.jae.com;

import javax.swing.JOptionPane;

public class Functiontest {
	public int sum(int a, int b){
		return a+b;}
	public int minus(int a, int b) {
		return a-b;}
	public int multi(int a, int b) {
		return a*b;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Functiontest object = new Functiontest();

			int num1 = Integer.parseInt(JOptionPane.showInputDialog("��1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("��2"));

			int sumResult = object.sum(num1,num2);
			System.out.println(sumResult);
			int minusResult = object.minus(num1, num2);
			System.out.println(minusResult);
			int multiResult = object.multi(num1, num2);
			
			System.out.println(multiResult);
		}

	}
