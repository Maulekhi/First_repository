package baselibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waitUtility.WaitUtility;

public class Baselibrary implements WaitUtility
{
	
  public static WebDriver driver =null;
  public void launchBrowser() {
    //WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
	  driver.get("https://www.testingbaba.com/old/");
	  WebElement close = driver.findElement(By.xpath("//button[text()='×']"));
	  waitforClick(close);
	  driver.findElement(By.xpath("//button[text()='×']")).click();
}

@Override
public void waitforClick(WebElement ele) 
{	
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(ele));	
}

@Override
public void waitforVisibilty(WebElement ele) {
	// TODO Auto-generated method stub
	
}

@Override
public void waitforAlert() {
	// TODO Auto-generated method stub
	
}
}
