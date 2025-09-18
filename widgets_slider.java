package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class widgets_slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.tutorialspoint.com/selenium/practice/slider.php"); //launch url
		WebElement slide=d.findElement(By.id("ageInputId"));//create webelement
		Actions a=new Actions(d);//call actions class
		
		a.clickAndHold(slide).moveByOffset(10, 0).build().perform();//perform action of slider
	}

}
