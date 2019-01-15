package colorproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.steadystate.css.dom.Property;

public class ColorofClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://billing.scriptinglogic.net/index.php/sessions/login");
		
		String expected = "#337ab7";
		
		WebElement btnlogin = driver.findElement(By.name("btn_login"));
		
		String color = btnlogin.getCssValue(propertyName: "background-color");
		
		
		
		

	}

}
