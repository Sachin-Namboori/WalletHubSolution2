package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment1 {

	public WebDriver driver;
	
	By email = By.id("email");
	By password = By.name("pass");
	By login = By.name("login");	
	By profileName = By.xpath("//span[text()='Sachin Namboori']");
	By whatsOnYourMind = By.cssSelector("div[class='m9osqain a5q79mjw jm1wdb64 k4urcfbm'] span[class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']");
	By typePost = By.xpath("(//*[@class='_1mf _1mj'])[2]");
	By createPost = By.xpath("//span[text()='Post']");
	By cookies = By.xpath("//button[normalize-space()='Accept All']");
	
	public Assignment1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getProfileName() {
		return driver.findElement(profileName);
	}
	
	public WebElement getWhatsOnYourMind() {
		return driver.findElement(whatsOnYourMind);
	}
	
	public WebElement getTypePost() {
		return driver.findElement(typePost);	
	}
	
	public WebElement getCreatePost() {
		return driver.findElement(createPost);
	}
	
	public WebElement handleCookiePopup() {
		return driver.findElement(cookies);
	}
}
