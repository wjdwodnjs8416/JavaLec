package jung.jae.com;

import javax.swing.JOptionPane;

public class BoolearnTest {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		
		int Weight;
		String weight;
		Weight=Integer.parseInt(JOptionPane.showInputDialog("������ �Է� : "));

		if(Weight>=90) {
			weight="�ʰ���";
		}else if(Weight>=80) {
			weight="����";
		}else if(Weight>=70) {
			weight="���";
		}else if(Weight>=60) {
			weight="��ü��";
		}else {
			weight="����ü��";
		}
		System.out.println("�Ǽ��� �����Դ� : " + weight + " �Դϴ�.");

	}

}
