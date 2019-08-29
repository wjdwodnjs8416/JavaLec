package jung.jae.com.mathod;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		
		rec.stdNum = JOptionPane.showInputDialog("학번");
		rec.stdName = JOptionPane.showInputDialog("이름");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("국어"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("영어"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("수학"));
		
		System.out.println(rec.stdNum + rec.stdName + "의 성적입니다.");
		
		rec.sum();
		rec.ave();

	}

}
