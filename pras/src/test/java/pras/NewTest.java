package pras;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
	String url="https://www.google.com";
	
  @Test
  
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\prasuna.nimmana\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	  d=new ChromeDriver();
	  d.get(url);
	  d.manage().window().fullscreen();
	  d.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
  }
  
}
