package jung.jae.com.mathod;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		
		rec.stdNum = JOptionPane.showInputDialog("�й�");
		rec.stdName = JOptionPane.showInputDialog("�̸�");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		System.out.println(rec.stdNum + rec.stdName + "�� �����Դϴ�.");
		
		rec.sum();
		rec.ave();

	}

}
