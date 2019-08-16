package jung.jae.com;

import javax.swing.JOptionPane;

public class BoolearnTest {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		int Weight;
		String weight;
		Weight=Integer.parseInt(JOptionPane.showInputDialog("몸무게 입력 : "));

		if(Weight>=90) {
			weight="초고도비만";
		}else if(Weight>=80) {
			weight="고도비만";
		}else if(Weight>=70) {
			weight="평균";
		}else if(Weight>=60) {
			weight="저체중";
		}else {
			weight="쌉저체중";
		}
		System.out.println("권수의 몸무게는 : " + weight + " 입니다.");

	}

}
