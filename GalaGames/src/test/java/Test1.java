

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.gala.games/games");
		
		
//		From the Games page I should not be able to launch Town Star without being logged in
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/main/div/div/div[1]/div[6]/div/div[2]/div/div[2]/div[2]/button")).click();
		
		
		driver.manage().deleteAllCookies();
		
		
		
		
//		driver.close();
//		driver.quit();
		
		
	}

}
