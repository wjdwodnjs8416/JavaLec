package jung.jae.com.mathod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<String,String>myMap = new HashMap<>();

		myMap.put("name" , "legend");
		myMap.put("age" , "18");
		myMap.put("job" , "����");

		System.out.println(myMap.get("name")+" of �Ǽ�");
		System.out.println("���� ���̴� " + myMap.get("age"));
		System.out.println("���� ������ " + myMap.get("job"));

		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey) {
			System.out.println("isContainsKey : " + isContainsKey);
		}
		boolean isContainsValue = myMap.containsValue("����");
		if(isContainsValue) {
			System.out.println("isContainsValue : " + isContainsValue);


		}
		int mapSize = myMap.size();
		System.out.println("mapSize : " + mapSize);

		showHashMap(myMap);

		boolean removeResult = myMap.remove("name", "legend");
		System.out.println("removeResult : " + removeResult);

		showHashMap(myMap);
	}
	public static void showHashMap(Map<String,String>Input) {
		Iterator<String>keys = Input.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("myMap.get(\"" + key + "\") = " + Input.get(key));
		}
	}
}

