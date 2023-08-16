package org.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSample {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		//1.File
		
		File file=new File(
	
				"C:\\Users\\USER\\eclipse-workspace\\AprilBatchMaven\\src\\test\\resources\\Sample.json");
		
	//2.file reader--->Pass the file as input parameter
		
		FileReader reader=new FileReader(file);
		
		
		// 3.To read data from JSON, we need class called JSONParser==>This class is present in simple Json
		//maven dependency
		
		JSONParser parser=new JSONParser();
		
		//By using method called parse(), we are going to read JSON file
		
		Object parse = parser.parse(reader);
		
		
		//To get data from JSON,we  need to type object to JSONObject
		
		
		JSONObject ob=(JSONObject) parse;
		
		//Type casting==>convert of one form of datatype into another form is calles typecasting
		
		
		ob.get("Name");//---------->object
		//to get directly as string value
		
		String string = ob.get("Name").toString();
		System.out.println(string); 	
		
		
		
	
	
	}

}
