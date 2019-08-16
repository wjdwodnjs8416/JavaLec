package jung.jae.com;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str1 = "Hello world";
		String str2 = new String("Hello world");
		
		int where = str1.indexOf("world");
		
		boolean isSame = str1.equals(str2);
		boolean strRela = str1 == str2;
		
		System.out.println(isSame);
		
		System.out.println(where);
		
		
		str1 = str1.replaceAll("world","java");
		
		System.out.println(str1);
		
		String subResult = str1.substring(0,5);
		System.out.println(subResult);
		String str1 = "Hello world";
		int startIndex = 0;
		int worldIndex = str1.indexOf("world");
		
		System.out.println("startIndex : " + startIndex);
		System.out.println("worldIndex : " + worldIndex);
		String subResult = str1.substring(startIndex, worldIndex);
		System.out.println(subResult);*/
	   String str1 = "Hello world";
	   String str2 = str1.toUpperCase();
	   String str3 = str1.toLowerCase();
	    System.out.println(str1 + "  " +str2);
	   int str1Length = str1.length();
	   System.out.println(str1Length);
	}

}
