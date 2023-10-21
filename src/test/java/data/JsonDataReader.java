package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonDataReader {
	
	public String lite_content_saudia, lite_price_saudia, classic_content_plan_saudia, classic_content_price_saudia,
	premium_content_plan_saudia, premium_content_price_saudia, lite_content_bahrin,lite_price_bahrin,
	classic_content_bahrin, classic_price_bahrin, premium_content_plan_bahrin, premium_content_price_bahrin,
	lite_content_kuwait, lite_price_kuwait, classic_content_plan_kuwait, classic_content_price_kuwait,
	premium_content_plan_kuwait, premium_content_price_kuwait;
	
	
	public void jsonreader() throws FileNotFoundException, IOException, ParseException {
		
		String filePath= System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(filePath); 

		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 
		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ; 
			lite_content_saudia  = (String) person.get("lite_content_saudia"); 
			System.out.println(lite_content_saudia);

			lite_price_saudia = (String) person.get("lite_price_saudia"); 
			System.out.println(lite_price_saudia);

			classic_content_plan_saudia = (String) person.get("classic_content_plan_saudia"); 
			System.out.println(classic_content_plan_saudia);

			classic_content_price_saudia = (String) person.get("classic_content_price_saudia"); 
			System.out.println(classic_content_price_saudia);
			
			
			premium_content_plan_saudia = (String) person.get("premium_content_plan_saudia"); 
			System.out.println(premium_content_plan_saudia);
			
			premium_content_price_saudia = (String) person.get("premium_content_price_saudia"); 
			System.out.println(premium_content_price_saudia);
			///////////////////////////////////////////////////////
			lite_content_bahrin = (String) person.get("lite_content_bahrin"); 
			System.out.println(lite_content_bahrin);
			
			lite_price_bahrin = (String) person.get("lite_price_bahrin"); 
			System.out.println(lite_price_bahrin);
			
			classic_content_bahrin = (String) person.get("classic_content_bahrin"); 
			System.out.println(classic_content_bahrin);
			
			classic_price_bahrin = (String) person.get("classic_price_bahrin"); 
			System.out.println(classic_price_bahrin);
			
			premium_content_plan_bahrin = (String) person.get("premium_content_plan_bahrin"); 
			System.out.println(premium_content_plan_bahrin);
			
			premium_content_price_bahrin = (String) person.get("premium_content_price_bahrin"); 
			System.out.println(premium_content_price_bahrin);
			
			///////////////////////////////////////////////////////////
			lite_content_kuwait = (String) person.get("lite_content_kuwait"); 
			System.out.println(lite_content_kuwait);
			
			lite_price_kuwait = (String) person.get("lite_price_kuwait"); 
			System.out.println(lite_price_kuwait);
			
			classic_content_plan_kuwait = (String) person.get("classic_content_plan_kuwait"); 
			System.out.println(classic_content_plan_kuwait);
			
			classic_content_price_kuwait = (String) person.get("classic_content_price_kuwait"); 
			System.out.println(classic_content_price_kuwait);
			
			premium_content_plan_kuwait = (String) person.get("premium_content_plan_kuwait"); 
			System.out.println(premium_content_plan_kuwait);
			
			premium_content_price_kuwait = (String) person.get("premium_content_price_kuwait"); 
			System.out.println(premium_content_price_kuwait);
			
			
			
			


		}
		
		
	}

}
