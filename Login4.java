import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys(" ");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(" ");
		
	
		WebElement button = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		button.click();
	}
}
