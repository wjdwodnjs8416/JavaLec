package jung.jae.com.mathod;
import java.util.ArrayList;
import java.util.List;
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>ls = new ArrayList<String>();
		ls.add("HI!");
		ls.add("Have!");
		ls.add("a Nice Day!");

		for(int i = 0 ; i<ls.size(); i++) {
			System.out.println(i + ";" + ls.get(i).toString());

		}
		System.out.println();

		ls.add(3,"Everybody~");
		for(int i = 0 ; i<ls.size() ; i++) {
			System.out.println(i + ";" + ls.get(i).toString());
		}
		System.out.println();

		ls.remove(0);
		for(int i = 0 ; i<ls.size() ; i++) {
			System.out.println(i + ";" + ls.get(i).toString());
		}
		System.out.println();

		ls.remove(0);
		for(String item: ls) {
			System.out.print(item + " | ");

		}
		System.out.println();	}

}
