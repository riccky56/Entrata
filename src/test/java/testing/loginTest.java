package testing;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import Base.Browser2;
import pages.loginpage;



public class loginTest extends Browser2{

	//static WebDriver driver;



    @BeforeClass
	public  void setup(){
		//driver = new ChromeDriver(); if no driver is assigned from browser2 or any other class
		Browser2.startBrowser();
		//driver.get("https://www.saucedemo.com/");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();

	}


	@Test
	public void first() {
        
		loginpage log = new loginpage(driver);
		log.enterusername("standard_user");
		log.enterpassword("secret_sauce");
		log.loginbutton();

		
		driver.quit();


	}

}
