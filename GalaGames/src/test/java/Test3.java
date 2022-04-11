



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver => new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://app.gala.games/store");
		driver.manage().window().maximize();
		
//		FluentWait wait = new FluentWait(driver);
//		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		
		
//		From the Store page I should be able to filter Town Star items by Epic Rarity
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div/div[1]/div/div[2]"));
		Search.click();
				
		WebElement Search2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div/div[1]/div/div[2]/input"));
		Search2.sendKeys("Town Star");

		
//		Search2.clear();
		
		WebElement Rarity = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[4]/div"));
		Rarity.click();
		
		driver.manage().deleteAllCookies();
			

//		driver.close();
//		driver.quit();
		
		
	}

}
