package Pages_Coordinator;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	WebDriverWait wait;
	protected static   WebDriver driver;
	public JavascriptExecutor jse ; 
	public Actions actions;
	public static String parentWindow;
	//create constructor
	
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,35);

	}
	
public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}

public boolean checkIfElementISDisplayed(WebElement element) {

    try{
         return element.isDisplayed();

     }catch (Exception exc){
         System.out.println(element+" Is not Displayed");
     }
     return false;
 }

 public void clickon(WebElement element){

     try{
         wait.until(ExpectedConditions.visibilityOf(element));
         if (checkIfElementISDisplayed(element)) {
             element.click();
         }
     }catch (Exception exc){
         System.out.println(element+" is not Displayed");
     }

  
   }
}