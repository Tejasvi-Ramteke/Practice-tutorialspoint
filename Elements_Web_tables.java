package practice.com;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements_Web_tables {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Tutorials_point\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		d.findElement(By.xpath("//*[@id=\"navMenus\"]/li[4]/a")).click();//click on Web tables
	
		List<WebElement>tr=d.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr"));
			int row=tr.size();
			System.out.println("No.of rows-->"+row);
		
		List<WebElement>tc=d.findElements(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td"));
			int col=tc.size();
			System.out.println("No.of columns-->"+col);
		//row[5], col[7]
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=7;j++)
			{
				System.out.println(d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		
		//add button
		d.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button")).click();//click on Add Button
		Thread.sleep(1000);
		d.findElement(By.id("firstname")).sendKeys("Tejasvi");
		d.findElement(By.id("lastname")).sendKeys("Ramteke");
		d.findElement(By.id("email")).sendKeys("abc@gmail.com");
		d.findElement(By.id("age")).sendKeys("24yr");
		d.findElement(By.id("salary")).sendKeys("Rs.100000/-");
		d.findElement(By.id("deparment")).sendKeys("testing");
		
		d.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div[2]/input")).click();


	}

}
