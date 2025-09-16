package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interaction_resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/resizable.php");
		WebElement resize=d.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div"));
		Actions a= new Actions(d);
		a.clickAndHold(resize)
        .moveByOffset(100, 50)
        .release()
        .build()
        .perform();

	}

}
