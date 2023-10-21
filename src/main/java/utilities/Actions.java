package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
	public  WebDriver driver;
	WebDriverWait wait;

    public Actions()
    {
        wait = new WebDriverWait(driver,40);
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
