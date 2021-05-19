package newproject;
 
import org.openqa.selenium.interactions.Actions;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class FirstCase {
 
 public static void main(String[] args){
 //Setting the driver path
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
 //Creating WebDriver instance
 WebDriver driver = new ChromeDriver();
driver.get("https://www.gittigidiyor.com/");
driver.manage().window().maximize();
Actions action = new Actions(driver);
WebElement element= driver.findElement(By.name("profile"));
action.moveToElement(element).build().perform();
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']")));
WebElement element2 = driver.findElement(By.xpath("//a[@class='qjixn8-0 sc-1bydi5r-0 kNKwwK']"));
action.moveToElement(element2);

action.click().build().perform();

System.out.println(driver.getCurrentUrl());

WebElement uName = driver.findElement(By.id("L-UserNameField"));
uName.sendKeys("aleynatezerisir@hotmail.com");
WebElement pswd = driver.findElement(By.id("L-PasswordField"));
pswd.sendKeys("a123456");
WebElement Button = driver.findElement(By.xpath("//input[@id='gg-login-enter']"));
Button.submit();

WebElement search = driver.findElement(By.xpath("//input[@placeholder='Keþfetmeye Bak']"));
search.sendKeys("bilgisayar");
WebElement srchbutton = driver.findElement(By.xpath("//button[@type='submit']"));
srchbutton.submit();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,8000)");
WebElement page = driver.findElement(By.xpath("//a[normalize-space()='2']"));
page.click();
js.executeScript("window.scrollBy(0,1000)");
WebElement p1 = driver.findElement(By.xpath("//img[@alt='QUADRO STARK H8122 Intel Core i3 4130T 4GB 240GB SSD 21.5 Hd FreeDOS All In One Bilgisayar 40424']"));
p1.click();
js.executeScript("window.scrollBy(0,1000)");
WebElement product = driver.findElement(By.id("add-to-basket"));
product.click();
WebElement sepetim = driver.findElement(By.xpath("//a[@class='dIB']"));
sepetim.click();
// Create object of the Select class
WebElement art = driver.findElement(By.xpath("//div[@class='number-selection gg-form-item']//div[contains(@class,'gg-input gg-input-select')]"));
art.click();
Select select = new Select(driver.findElement(By.xpath("//select[@class='amount']")));
// Select the option with value "2"
select.selectByValue("2");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
WebElement delete = driver.findElement(By.xpath("//div[@class='gg-d-24 hidden-m update-buttons-container']//a[@title='Sil']"));
delete.click();
driver.quit();
}
 
}