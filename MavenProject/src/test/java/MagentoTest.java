
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest
{

	
	@Test
	public void magento()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://www.magento.com";
		driver.get(url);
		
		
		Home h = new Home(driver);
		h.clickmyacc();
		
		Login l1 = new Login(driver);
		l1.typeemail("nitinmanjunath1991@gmail.com");
		l1.typepassword("Welcome123");
		l1.clickonlogin();
		
		Logout lo = new Logout(driver);
		lo.clickonlogout();
	
		driver.quit();
	}
	
	

}
