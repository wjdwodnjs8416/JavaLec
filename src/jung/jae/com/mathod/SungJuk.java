package jung.jae.com.mathod;

public class SungJuk {

	String stdNum;
	String stdName;
	int kor;
	int eng;
	int mat;

	public int sum() {
		System.out.println("합계는 " + (kor + eng + mat) + "입니다.");
		return kor + eng + mat;

	}
	public double ave() {
		System.out.println("평균은 " + (sum()/3) + "입니다.");
		return (double)sum()/3;
	}
}


