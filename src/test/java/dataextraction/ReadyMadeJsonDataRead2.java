package dataextraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ReadyMadeJsonDataRead2 {

	@Test
	public void readData() throws FileNotFoundException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\SampleData.json";
		
		FileInputStream fis = new FileInputStream(path);
				
		JsonPath jp = new JsonPath(fis);
		
		String websiteValue = jp.getString("dashboard.website");
		
		System.out.println(websiteValue);
		
		int sizeOfCourse = jp.getInt("course.size()");
		
		System.out.println(sizeOfCourse);
		
	}
}
