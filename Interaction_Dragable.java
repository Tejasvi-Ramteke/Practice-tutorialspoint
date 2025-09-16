package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interaction_Dragable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/dragabble.php");
		
		//Simple
		WebElement drag=d.findElement(By.id("draggables"));
		Actions a=new Actions(d);
		a.clickAndHold(drag).moveByOffset(500, 180).build().perform();
		Thread.sleep(1000);
		
		//Axis Restricted
		d.findElement(By.id("nav-profile-tab")).click();//click on axis restricted
		WebElement d1=d.findElement(By.id("div_element"));//X-axis
		WebElement d2=d.findElement(By.id("div_elementy"));//Y-axis
		a.clickAndHold(d1).moveByOffset(200, 0).build().perform();
		a.clickAndHold(d2).moveByOffset(0, 150).build().perform();
		Thread.sleep(1000);
		
		d.switchTo().defaultContent();
		//Container Restricted
		d.findElement(By.xpath("//*[@id=\"nav-profile-tab\"]")).click();
//		WebElement drag1=d.findElement(By.id("intro"));
//		a.clickAndHold(drag1).moveByOffset(50,0).build().perform();
		//d.quit();
	}

}
