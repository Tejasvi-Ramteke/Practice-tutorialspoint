package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interaction_Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		
		//Simple
		WebElement drag=d.findElement(By.id("draggable"));
		WebElement drop=d.findElement(By.id("droppable"));
		Actions a=new Actions(d);
		a.dragAndDrop(drag, drop).build().perform();
		
		//Accept
		d.findElement(By.xpath("//*[@id=\"nav-profile-tab\"]")).click();
		WebElement drag1=d.findElement(By.id("div2"));
		WebElement drop1=d.findElement(By.id("div1"));
		a.dragAndDrop(drag1, drop1).build().perform();
		
		//Prevent Propagation
		d.findElement(By.xpath("//*[@id=\"nav-profile-tab\"]")).click();
	}

}
