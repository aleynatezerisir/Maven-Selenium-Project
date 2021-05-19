package newproject;
 
import org.openqa.selenium.interactions.Actions;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
	private static ChromeDriver driver;
	WebElement element;

	@BeforeClass
	 public static void openBrowser(){
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
@Test
public void valid_UserCredential(){
	System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	driver.get("https://www.gittigidiyor.com/");
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
	element element= driver.findElement(By.name("profile"));
	action.moveToElement(element).build().perform();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']")));
	element element2 = driver.findElement(By.xpath("//a[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']"));
	action.moveToElement(element2);

	action.click().build().perform();

	System.out.println(driver.getCurrentUrl());

	element uName = driver.findElement(By.id("L-UserNameField"));
	uName.sendKeys("aleynatezerisir@hotmail.com");
	element pswd = driver.findElement(By.id("L-PasswordField"));
	pswd.sendKeys("a123456");
	element Button = driver.findElement(By.xpath("//input[@id='gg-login-enter']"));
	Button.submit();

	element search = driver.findElement(By.xpath("//input[@placeholder='Keþfetmeye Bak']"));
	search.sendKeys("bilgisayar");
	element srchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	srchbutton.submit();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,8000)");
	element page = driver.findElement(By.xpath("//a[normalize-space()='2']"));
	page.click();
	js.executeScript("window.scrollBy(0,1000)");
	element p1 = driver.findElement(By.xpath("//img[@alt='QUADRO STARK H8122 Intel Core i3 4130T 4GB 240GB SSD 21.5 Hd FreeDOS All In One Bilgisayar 40424']"));
	p1.click();
	js.executeScript("window.scrollBy(0,1000)");
	element product = driver.findElement(By.id("add-to-basket"));
	product.click();
	element sepetim = driver.findElement(By.xpath("//a[@class='dIB']"));
	sepetim.click();
	// Create object of the Select class
	element art = driver.findElement(By.xpath("//div[@class='number-selection gg-form-item']//div[contains(@class,'gg-input gg-input-select')]"));
	art.click();
	Select select = new Select(driver.findElement(By.xpath("//select[@class='amount']")));
	// Select the option with value "2"
	select.selectByValue("2");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	try {
		element delete = driver.findElement(By.xpath("//div[@class='gg-d-24 hidden-m update-buttons-container']//a[@title='Sil']"));
		delete.click();
	}catch(Exception e){
		 Assert.assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
	}
	
}

@AfterClass
public static void closeBrowser(){
	 driver.quit();
}
 
}