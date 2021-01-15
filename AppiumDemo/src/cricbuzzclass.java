import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class cricbuzzclass extends capability {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void bt() throws MalformedURLException
	{ driver = capabilities();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
    @Test
    public void testcase1() throws InterruptedException {
    	driver.get("https://www.cricbuzz.com");
    	     	JavascriptExecutor js = (JavascriptExecutor)driver;
            	WebElement menubtn = driver.findElement(By.xpath("//a/span"));
    	js.executeScript("arguments[0].click()", menubtn);
    Thread.sleep(2000);
    WebElement home = driver.findElement(By.linkText("Home"));
    js.executeScript("arguments[0].click()", home);	
    System.out.println(driver.getTitle());
    WebElement TopStories = driver.findElement(By.xpath("//*[@id='top']/div/div[8]/h4"));
    js.executeScript("arguments[0].scrollIntoView", TopStories);
    String heading = TopStories.getText();
 Assert.assertEquals(heading, "Top Stories");
    	    }
}
