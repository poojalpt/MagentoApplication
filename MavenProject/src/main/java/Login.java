
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="send2")
	WebElement login;
	public Login(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void typeemail(String username)
	{
		email.sendKeys(username);
	}
	
	public void typepassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonlogin()
	{
		login.click();
	
	}
	


	

}
