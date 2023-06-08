package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  public static WebElement Gender(WebDriver driver) {
	  return driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]"));
  }
}
