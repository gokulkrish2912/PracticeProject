import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "D:\\\\chrome driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/myshine/login/");

		// email
		WebElement mail = driver.findElement(By.id("id_email_login"));
		mail.sendKeys("superadmin123@gmail.com");

		// password
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("Superadmin@123");
		
		Thread.sleep(20000);

		// button
		WebElement login = driver.findElement(By.cssSelector("#cndidate_login_widget .msitelogin_mid2 .ui-btn_n"));
		login.click();
		Thread.sleep(20000);

  }
}
