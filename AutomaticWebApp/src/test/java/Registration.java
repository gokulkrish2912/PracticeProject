import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Registration {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "D:\\chrome driver/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Superadmin");
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("superadmin123@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9876543210");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Superadmin@123");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		Thread.sleep(20000);
		register.click();
		Thread.sleep(20000);
		
	}

}
