package Tests_Coordinator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.helper;


public class testbase {
	public  WebDriver driver;



	@BeforeSuite
	@Parameters({"browser"})

	public void startdriver(@Optional("chrome") String browsename) {

		if(browsename.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");

		}
		else if(browsename.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if (browsename.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//	driver.get("http://52.143.143.101/main/Login/AD");
		driver.navigate().to("https://subscribe.stctv.com/sa-en");
	}




	@AfterSuite
	public void stop_driver() {
		//driver.quit();

	}

	//take screenshoot when testcase fail and add it in screen folder
	@AfterMethod
	public void screenshootonfailure(ITestResult result) {

		if(result.getStatus() == ITestResult.FAILURE)
		{

			System.out.print("failed");
			System.out.print("taking screenshoot ----");
			helper.capturescreenshoot(driver, result.getName());
		}

	}

}
