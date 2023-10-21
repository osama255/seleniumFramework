package Pages_Coordinator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Coordinator_login_page extends PageBase {
	WebDriver driver;
	PageBase action;
    Actions actions;
    
	public Coordinator_login_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		//Instantiate Action Class       
        action = new PageBase(driver);

	}

	@FindBy (xpath="//strong[@id='name-lite']") 
	public WebElement lite_plan;
	
	@FindBy (xpath="//div[@id='currency-lite']")
	public WebElement lite_price;
	
	@FindBy (xpath="//span[@id='country-name']")
	public WebElement btn_country;
	
	@FindBy(xpath="//a[@id='bh']")
    public WebElement btn_bahrin;
	
	@FindBy(xpath="//strong[@id='name-classic']")
	public WebElement classic_plan;
	
	@FindBy(xpath="//div[@id='currency-classic']")
	public WebElement classic_price;
	
	@FindBy(xpath="//strong[@id='name-premium']")
    public WebElement premium_plan;
	
	@FindBy(xpath="//div[@id='currency-premium']")
    public WebElement premium_price;
	
	@FindBy(xpath="//a[@id='kw']")
	public WebElement btn_kuwait;
	
	public void package_saudia_lite(WebDriver driver) throws InterruptedException {
		
		//action= new PageBase(driver);
	     

		//check lite plan and price for saudia
        action.checkIfElementISDisplayed(lite_plan);
        action.checkIfElementISDisplayed(lite_price);
					
	}
	
   public void package_saudia_classic(WebDriver driver) throws InterruptedException {
		
		//action= new PageBase(driver);
		
		//check classic plan and price for saudia
        action.checkIfElementISDisplayed(classic_plan);
        action.checkIfElementISDisplayed(classic_price);
					
	}
   
   public void package_saudia_premium(WebDriver driver) throws InterruptedException {
		
		//action= new PageBase(driver);
		
		//check premium plan and price for saudia
       action.checkIfElementISDisplayed(premium_plan);
       action.checkIfElementISDisplayed(premium_price);
					
	}
   
	public void choose_bahrin(WebDriver driver) throws InterruptedException{
		
		//action= new PageBase(driver);
		
		//click to choose country
		action.clickon(btn_country);
		
		//click to choose bahrin
		action.clickon(btn_bahrin);
		
		
		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
       // wait.until(ExpectedConditions.elementToBeClickable(btn_country));
        //btn_country.click();
		//clickButton(btn_country);
		//btn_country.click();
     //clickButton(btn_country);		
		//btn_bahrin.click();
	}
	
	public void package_bahrin_lite(WebDriver driver) throws InterruptedException {
		
		//action= new PageBase(driver);
		
		//check lite plan and price for bahrin
        action.checkIfElementISDisplayed(lite_plan);
        action.checkIfElementISDisplayed(lite_price);
					
	}
	
	  public void package_bahrin_classic(WebDriver driver) throws InterruptedException {
			
			//action= new PageBase(driver);
			
			//check classic plan and price for bahrin
	        action.checkIfElementISDisplayed(classic_plan);
	        action.checkIfElementISDisplayed(classic_price);
						
		}
	 
	  public void package_bahrin_premium(WebDriver driver) throws InterruptedException {
			
			//action= new PageBase(driver);
			
			//check premium plan and price for bahrin
	       action.checkIfElementISDisplayed(premium_plan);
	       action.checkIfElementISDisplayed(premium_price);
						
		}
	  
	  public void choose_kuwait(WebDriver driver) throws InterruptedException{
			
			//action= new PageBase(driver);
			
			//click to choose country
			action.clickon(btn_country);
			
			//click to choose kuwait
			action.clickon(btn_kuwait);
	  }
	  
	  public void package_kuwait_lite(WebDriver driver) throws InterruptedException {
			
			//action= new PageBase(driver);
			
			//check lite plan and price for kuwait
	        action.checkIfElementISDisplayed(lite_plan);
	        action.checkIfElementISDisplayed(lite_price);
	  }
	
	  public void package_kuwait_classic(WebDriver driver) throws InterruptedException {
			
			//action= new PageBase(driver);
			
			//check classic plan and price for kuwait
	        action.checkIfElementISDisplayed(classic_plan);
	        action.checkIfElementISDisplayed(classic_price);
						
		}
	  
	  public void package_kuwait_premium(WebDriver driver) throws InterruptedException {
			
			//action= new PageBase(driver);
			
			//check premium plan and price for kuwait
	       action.checkIfElementISDisplayed(premium_plan);
	       action.checkIfElementISDisplayed(premium_price);
						
		}
}

