package Tests_Coordinator;


import java.io.FileNotFoundException;
import java.io.IOException;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages_Coordinator.Coordinator_login_page;
import data.JsonDataReader;


public class Coordinator_login_test extends testbase  {
	
    Coordinator_login_page Coordinator_object_object;
    JsonDataReader jsonReader;
    
	//String lite_content_saudia = "LITE"; 
	//String lite_price_saudia="15 SAR/month";
     
     //String classic_content_plan_saudia="CLASSIC";
     //String classic_content_price_saudia="25 SAR/month";
     
     //String premium_content_plan_saudia="PREMIUM";
     //String premium_content_price_saudia="60 SAR/month";
     
     //String lite_content_bahrin="LITE";
     //String lite_price_bahrin="2 BHD/month";
	
     //String classic_content_bahrin="CLASSIC";
     //String classic_price_bahrin="3 BHD/month";
     
     //String premium_content_plan_bahrin="PREMIUM";
     //String premium_content_price_bahrin="6 BHD/month";
     
     //String lite_content_kuwait="LITE";
     //String lite_price_kuwait="1.2 KWD/month";
	
     //String classic_content_plan_kuwait="CLASSIC";
     //String classic_content_price_kuwait="2.5 KWD/month";
     
     //String premium_content_plan_kuwait="PREMIUM";
     //String premium_content_price_kuwait="4.8 KWD/month";
     
	@Test(priority=0)
	@Severity(SeverityLevel.CRITICAL)
	@Description("verify lite package for saudia correctly")
	@Link(url = "https://www.google.com/")
		public void user_package_saudia() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		 jsonReader = new JsonDataReader(); 
		jsonReader.jsonreader();
		
		Coordinator_object_object=new Coordinator_login_page(driver);
		Coordinator_object_object.package_saudia_lite(driver);
		
		Assert.assertEquals(Coordinator_object_object.lite_plan.getText(), jsonReader.lite_content_saudia);
		Assert.assertEquals(Coordinator_object_object.lite_price.getText(), jsonReader.lite_price_saudia);

	}
	
	@Test(priority=1)
	public void user_package_saudia_classic() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_saudia_classic(driver);
	
	Assert.assertEquals(Coordinator_object_object.classic_plan.getText(), jsonReader.classic_content_plan_saudia);
	Assert.assertEquals(Coordinator_object_object.classic_price.getText(), jsonReader.classic_content_price_saudia);

}
	
	@Test(priority=2)
	public void user_package_saudia_premium() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_saudia_premium(driver);
	
	Assert.assertEquals(Coordinator_object_object.premium_plan.getText(), jsonReader.premium_content_plan_saudia);
	Assert.assertEquals(Coordinator_object_object.premium_price.getText(), jsonReader.premium_content_price_saudia);

}
	@Test(priority=3)
	public void user_choose_bahrin() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.choose_bahrin(driver);


}
	@Test(priority=4)
	public void user_package_bahrin_lite() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_bahrin_lite(driver);
	
	Assert.assertEquals(Coordinator_object_object.lite_plan.getText(), jsonReader.lite_content_bahrin);
	Assert.assertEquals(Coordinator_object_object.lite_price.getText(), jsonReader.lite_price_bahrin);

}
	@Test(priority=5)
	public void user_package_bahrin_classic() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_bahrin_classic(driver);
	
	Assert.assertEquals(Coordinator_object_object.classic_plan.getText(), jsonReader.classic_content_bahrin);
	Assert.assertEquals(Coordinator_object_object.classic_price.getText(), jsonReader.classic_price_bahrin);

}
	@Test(priority=6)
	public void user_package_bahrin_premium() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_bahrin_premium(driver);
	
	Assert.assertEquals(Coordinator_object_object.premium_plan.getText(), jsonReader.premium_content_plan_bahrin);
	Assert.assertEquals(Coordinator_object_object.premium_price.getText(), jsonReader.premium_content_price_bahrin);

}	
	@Test(priority=7)
	public void kuwait() throws InterruptedException {
	
	//oordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.choose_kuwait(driver);


}
	
	@Test(priority=8)
	public void user_package_kuwait_lite() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_kuwait_lite(driver);
	
	Assert.assertEquals(Coordinator_object_object.lite_plan.getText(), jsonReader.lite_content_kuwait);
	Assert.assertEquals(Coordinator_object_object.lite_price.getText(), jsonReader.lite_price_kuwait);

}
	@Test(priority=9)
	public void user_package_kuwait_classic() throws InterruptedException {
		
		//Coordinator_object_object=new Coordinator_login_page(driver);
		Coordinator_object_object.package_kuwait_classic(driver);
		
		Assert.assertEquals(Coordinator_object_object.classic_plan.getText(), jsonReader.classic_content_plan_kuwait);
		Assert.assertEquals(Coordinator_object_object.classic_price.getText(), jsonReader.classic_content_price_kuwait);

	}
	@Test(priority=10)
	public void user_package_kuwait_premium() throws InterruptedException {
	
	//Coordinator_object_object=new Coordinator_login_page(driver);
	Coordinator_object_object.package_kuwait_premium(driver);
	
	Assert.assertEquals(Coordinator_object_object.premium_plan.getText(), jsonReader.premium_content_plan_kuwait);
	Assert.assertEquals(Coordinator_object_object.premium_price.getText(), jsonReader.premium_content_price_kuwait);

}
	
}
