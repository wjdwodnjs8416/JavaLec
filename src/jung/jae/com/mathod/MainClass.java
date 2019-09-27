package jung.jae.com.mathod;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {

		Palindrome Ai = new Palindrome();
		Ai.get("1001");
		
		System.out.println((Ai.get("89898")));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<Integer> list = new ArrayList<Integer>();
		while(list.size() <=50) {
			
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
		}*/

	}
}

