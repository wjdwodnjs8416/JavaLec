package jung.jae.com.mathod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.json.JSONObject;

public class FileControl {
	//	static final Logger logger = Logger.getLogger(FileControl.class.getSimpleName());

	public static void main(String[] args) {
		final String fileTitle = "myjson.txt";

		FileControl fileControl = new FileControl();
		fileControl.writeFile(fileTitle, "���ϳ���");

		System.out.println(fileControl.readFile(fileTitle));

		JSONObject updateJson = new JSONObject();
		final String nowDate = LocalDateTime.now().toString();
		updateJson.put("update", nowDate);
		fileControl.appendFile(fileTitle, updateJson.toString());

		System.out.println(fileControl.readFile(fileTitle));
		// fileControl.deleteFile(fileTitle);
	}

	/**
	 * ���� �����ϱ�
	 * 
	 * @param title
	 * @return
	 */
	public boolean deleteFile(String title) {
		boolean result = false;
		File storedFile = new File(title);
		if(storedFile.exists()) {
			result = storedFile.delete();
		}
		return result;
	}

	/**
	 * ���� �����ϱ�
	 * 
	 * @param title
	 * @param content
	 */
	public void appendFile(String title, String content) {
		File storedFile = new File(title);
		try(BufferedWriter writer = new BufferedWriter(
				new FileWriter(storedFile, true))){
			writer.append(content);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���� �б�
	 * 
	 * @param title
	 * @return
	 */
	public String readFile(String title) {
		StringBuilder result = new StringBuilder();
		File storedFile = new File(title);

		try(BufferedReader reader = new BufferedReader(
				new FileReader(storedFile))){
			String line;
			while((line = reader.readLine()) != null) {
				result.append(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	/**
	 * ���� ���� �� �ؽ�Ʈ����
	 * 
	 * @param title
	 * @param content
	 */
	public void writeFile(String title, String content) {
		File newFile = new File(title);

		try (BufferedWriter writer = 
				new BufferedWriter(new FileWriter(newFile))){
			writer.write(content);
			System.out.println(newFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}