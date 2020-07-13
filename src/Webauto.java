import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class Webauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a ISS locator to see if the ISS is in sight, please enter your location \n");
		try (Scanner scan = new Scanner(System.in)) {
			String location = scan.nextLine();
			
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedrivernew.exe"); 
			   WebDriver driver=new ChromeDriver();  
			   driver.navigate().to("https://spotthestation.nasa.gov/sightings/index.cfm"); 
			   driver.manage().window().maximize();  
			  
			      
			     // Click on the Search button  
			    
			    
			    
			    driver.findElement(By.cssSelector(".geocoder-control-input")).sendKeys(location);
			    driver.findElement(By.cssSelector(".geocoder-control-input")).sendKeys(Keys.ENTER);
			    

		}
	        
	        

	}

}
