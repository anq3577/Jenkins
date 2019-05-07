package Demolink.Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
	  WebElement fl;
	public String test="Hi";
	
  @Test
  public void f() {
  }
  /*@BeforeMethod
  public void beforeClass()
  {
  	 
  }
  /*
  static NewTest init(WebDriver webDriver) {
      return new NewTest(webDriver);
  }
  
  */
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  PageFactory.initElements(driver, this);
	
	//  PageFactory.initElements(driver, this);
	
	  
	   driver.get("https://www.google.com");
	   fl.sendKeys("selenium tutorial");
	   
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
