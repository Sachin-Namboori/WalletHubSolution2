package walletHub;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Assignment1;
import resources.Base;

public class LoginAndPost extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void init() throws IOException {
		driver = intializeDriver();
		log.info("Driver is intialized");
		
	}
	
	@Test
	public void loginAndPostInFacebook() throws IOException, InterruptedException {
		driver.get(prop.getProperty("facebookUrl"));
		log.info("Navigated to the Facebook");
		
		Assignment1 facebookPage = new Assignment1(driver);
		log.info("Object has been created");
		
		facebookPage.handleCookiePopup().click();
		log.info("Cookie popup has been handled");
		
		facebookPage.getEmail().sendKeys(prop.getProperty("emailID"));
		log.info("Email id has been entered");
		
		facebookPage.getPassword().sendKeys(prop.getProperty("password"));
		log.info("Password has been entered");
		
		facebookPage.getLogin().click();
		log.info("Login is clicked");
		
		facebookPage.getProfileName().click();
		log.info("Profile name clicked");
		
		facebookPage.getWhatsOnYourMind().click();
		log.info("Whats on your mind element clicked");
		
		facebookPage.getTypePost().sendKeys("Hello World");
		log.info("Hello World has been written");
		
		facebookPage.getCreatePost().click();
		log.info("Facebook post has been created");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
