package walletHub;

import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.Assignment2;
import resources.Base;

public class ReviewAndTest extends Base {
	public WebDriver driver;
	String expectedTextArea="@sachin_namboori"; 
	String actualTextArea;
	WebDriverWait wait;
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@BeforeTest
	public void init() throws IOException {
		driver = intializeDriver();
		log.info("Driver is intialized");
		
	}
	
	
	@Test
	public void reviewAndTest() throws InterruptedException {
		driver.get(prop.getProperty("walletHubUrl"));
		log.info("Navigated to the homepage");
				
		// creating object to that class and invoke methods of it
		Assignment2 walletHub=new Assignment2(driver);
		log.info("Object has been created");
		
		walletHub.getReview().click();
		log.info("Review has been clicked"); 
		 
		walletHub.getReviewStar().click();
		log.info("Review star has been clicked"); 
		
		walletHub.getDropdown().click();
		log.info("Dropdown has been clicked");
		
		walletHub.getHealthInsurance().click();
		log.info("Health Insurance has been selected");
		
		walletHub.getReviewTextArea().sendKeys("This is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer"
		 		+ "This is a game changerThis is a game changer");
		log.info("Some random text has been selected");
		
		walletHub.getSubmit().click();
		log.info("Submit has been clicked");
		
		Thread.sleep(10000);
		walletHub.getLoginLink().click();
		log.info("Clicked on login link");
		
		walletHub.getEmail().sendKeys("sachin.namboori@gmail.com");
		log.info("Email has been entered");
		
		walletHub.getPassword().sendKeys("Penholder@123");
		log.info("Password has been entered");
		
		walletHub.getPendingLogin().click();
		log.info("Click on login link");
		
		Thread.sleep(15000);
		
		for (int i = 0; i <= 2; i++) {
			try { actualTextArea =
					walletHub.getCommentName().getText(); break;
				}
			catch (Exception e) {
				System.out.println("This is the exception occured: " + e); }
		 
		}
		

			Assert.assertEquals(expectedTextArea, actualTextArea);
	
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
