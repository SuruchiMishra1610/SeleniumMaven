package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver driver;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(className = "email")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement UserPass;
	
	@FindBy(className = "rememberMe")
	WebElement Checkbox;
	
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver basedriver) {
		
		this.driver = basedriver;
		PageFactory.initElements(basedriver, this);
	}
	
	public void Login(String UserNameVal, String PasswordVal) {
		
		LoginLink.click(); //click on login button
		UserName.sendKeys(UserNameVal); // Passing username value
		UserPass.sendKeys(PasswordVal); // Passing Password value
		Checkbox.click();
		LoginBtn.click(); // clicking on login button
		
	}

}
