package jung.jae.com.mathod;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Board {


	int id;
	String title;
	String content;
	User writer;
	Date wdate;
	Date udate;

	public boolean insert(Board board) {
		System.out.println("insert");
		return true;

	}
	public boolean edit(Board board) {
		System.out.println("edit");
		return true;
	}
	public Board getBoard(int id) {
		Board result = new Board();
		return result;
	}
	public List<Board>getList(){
		List<Board>result = new ArrayList<Board>();
		return result;
	}
}
