package practice.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		//count number of links
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[6]/a")).click();
		List<WebElement>links=d.findElements(By.tagName("a"));
		int l=links.size();
		System.out.println("No.of links-->"+l);
		
		//find links
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		//click on link and switch
		d.findElement(By.linkText("Home")).click();
		ArrayList<String> tabs=new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs.get(1));
		d.findElement(By.id("search-strings")).sendKeys("Selenium");//check activity
		

	}

}
