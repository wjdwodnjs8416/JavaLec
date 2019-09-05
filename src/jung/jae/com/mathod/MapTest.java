package jung.jae.com.mathod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<String,String>myMap = new HashMap<>();

		myMap.put("name" , "legend");
		myMap.put("age" , "18");
		myMap.put("job" , "병신");

		System.out.println(myMap.get("name")+" of 권수");
		System.out.println("그의 나이는 " + myMap.get("age"));
		System.out.println("그의 직업은 " + myMap.get("job"));

		boolean isContainsKey = myMap.containsKey("name");
		if(isContainsKey) {
			System.out.println("isContainsKey : " + isContainsKey);
		}
		boolean isContainsValue = myMap.containsValue("병신");
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

