package jung.jae.com.mathod;

public class SungJuk {

	String stdNum;
	String stdName;
	int kor;
	int eng;
	int mat;

	public int sum() {
		System.out.println("�հ�� " + (kor + eng + mat) + "�Դϴ�.");
		return kor + eng + mat;

	}
	public double ave() {
		System.out.println("����� " + (sum()/3) + "�Դϴ�.");
		return (double)sum()/3;
	}
}


