package practice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widgets_tool_tip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.tutorialspoint.com/selenium/practice/tool-tips.php");//launch url
		
		//Tooltip on top
		String actualtip=d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).getAttribute("title");
		System.out.println("1- tool tip on top is= "+actualtip);
		
		//Tooltip on right
		String acttool=d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]")).getAttribute("title");
		System.out.println("2- tool tip on right is= "+acttool);
		
		//Tooltip on bottom
		String actual=d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]")).getAttribute("title");
		String expected= "tool tip";
		if(expected.equals(actual))
		{
			System.out.println("3- tool tip matches");
		}
		else
		{
			System.out.println("3- tool tip do not match");
		}
		
		//Tooltip on left
		String acttooltip=d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[4]")).getAttribute("title");
		String exptool="Tooltip on left";
		if(exptool.equals(acttooltip))
		{
			System.out.println("4- Tool tip matches");
		}
		else
		{
			System.out.println("4- Tool tip do not match");
		}
	}

}
