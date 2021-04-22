package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public WebDriver driver;

	By email = By.name("em");
	By password = By.name("pw1");
	By login = By.xpath("//*[text()='Login'][1]");
	By review = By.xpath("//span[text()='Reviews']");
	By reviewStar = By
			.xpath("//review-star[@class='rvs-svg']//div[@class='rating-box-wrapper']//*[local-name()='svg'][4]");
	By dropdown = By.xpath("//*[text()='Select...']");
	By healthInsurance = By.xpath("//li[normalize-space()='Health Insurance']");
	By reviewTextArea = By.xpath("//textarea[@placeholder='Write your review...']");
	By submitButton = By.xpath("//*[text()='Submit']");
	By loginLink = By.xpath("//*[text()='Login']");
	By pendingLogin = By.xpath("//span[@ng-if='!pending']");
	By commentName = By.xpath("//span[normalize-space()='@sachin_namboori']");

	public Assignment2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getReview() {
		return driver.findElement(review);
	}

	public WebElement getReviewStar() {
		
		WebElement revStar = driver.findElement(reviewStar);
		Actions act = new Actions(driver);
		act.moveToElement(revStar).perform();
			
		return revStar;
	}

	public WebElement getDropdown() {
		return driver.findElement(dropdown);
	}

	public WebElement getHealthInsurance() {
		return driver.findElement(healthInsurance);
	}

	public WebElement getReviewTextArea() {
		return driver.findElement(reviewTextArea);
	}

	public WebElement getSubmit() {
		return driver.findElement(submitButton);
	}

	public WebElement getLoginLink() {
		return driver.findElement(loginLink);
	}

	// review this one
	public WebElement getLogin() {
		return driver.findElement(login);
		}
	 

	// review this one
	public WebElement getPendingLogin() {
		return driver.findElement(pendingLogin);
	}

	public WebElement getCommentName() {
		return driver.findElement(commentName);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}
	

	
	
	
	
}
