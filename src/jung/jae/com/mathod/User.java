package jung.jae.com.mathod;

public class User {

int id;
String login;
String password;
String phone;
String email;
String address;
String username;

public boolean signIn(User user) {
	System.out.println("�α��� �߽��ϴ�.");
	return true;
}
public boolean signOut(User user) {
	System.out.println("�α׾ƿ� �߽��ϴ�.");
	return true;
}
public int signUp(User user) {
	System.out.println("ȸ������ �߽��ϴ�.");
	return 1;
}
public int edit(User user) {
	System.out.println(user.username + "���� ������ �����Ͽ����ϴ�.");
	return 1;
}
	}


