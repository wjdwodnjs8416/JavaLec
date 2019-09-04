package jung.jae.com.mathod;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		while(list.size() <=0) {
			//System.out.println(list.size());
			double randomNum = Math.random();
			int random = (int)(randomNum * 100)+1;
			if(list.contains(random)) {
				continue;
			}else {
				list.add(random);
			}
		}
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("randomNum : " + list.get(i));
		}

	}
}

