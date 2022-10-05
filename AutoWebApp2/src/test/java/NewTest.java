import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NewTest {
  @Test
  public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement signin = driver.findElement(By.id("nav-signin-tooltip"));
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//1.png") ;
		
		signin.click();
		driver.findElement(By.name("email")).sendKeys("gokul5707@gmail.com");
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//2.png") ;
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("9791630630p");
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//3.png") ;
		
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro");
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//4.png") ;
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//5.png") ;
		
		driver.get("https://www.amazon.in/Apple-iPhone-13-Pro-128GB/dp/B09G99YPQM/ref=sr_1_1_sspa?crid=3AOT1AD80NXS3&keywords=iphone+13+pro&qid=1664954567&qu=eyJxc2MiOiI0LjEyIiwicXNhIjoiMy45OSIsInFzcCI6IjMuNzEifQ%3D%3D&sprefix=iphone+13+pro%2Caps%2C355&sr=8-1-spons&psc=19");
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//6.png") ;
		
		WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		Thread.sleep(7000);
		this.takeSnapShot(driver, "C:\\Simpli\\phase 3\\AutoWebApp2\\src\\test\\java//7.png") ;
		
	}
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
		File DestFile=new File(fileWithPath);
		
		FileUtils.copyFile(SrcFile, DestFile);
		}
}