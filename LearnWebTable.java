package table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		System.out.println(tRow.size());
		
		List<WebElement> tData = tRow.get(0).findElements(By.tagName("td"));
		
		System.out.println(tData.size());
		
		System.out.println(tData.get(1).getText());
		
	}

}



