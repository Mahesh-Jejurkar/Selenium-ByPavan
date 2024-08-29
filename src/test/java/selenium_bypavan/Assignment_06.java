package selenium_bypavan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_06 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		WebElement dp_fromPort = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select_fromPort = new Select(dp_fromPort);
		WebElement dp_toPort = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select_toPort = new Select(dp_toPort);
		WebElement btn_findFlight =	driver.findElement(By.xpath("//input[@value='Find Flights']"));
		
		select_fromPort.selectByVisibleText("Portland");
		Thread.sleep(500);
		select_toPort.selectByVisibleText("Berlin");
		Thread.sleep(1000);
		btn_findFlight.click();
		Thread.sleep(2000);
		
	    //Getting the price list and storing in a new list.
		List<WebElement> list_price = driver.findElements(By.xpath("//tbody//tr//td[6]"));
	    int list_priceSize = list_price.size();
	    List<String> list_priceValue = new ArrayList<String>();
	    for(WebElement price	:list_price) {
	    	list_priceValue.add(price.getText());
	    }
		
	    //Sorting the new list.
	    Collections.sort(list_priceValue);
	    String lowestPrice = list_priceValue.get(0);
	    
	    //Clicking on lowest price button.  
	    for(int r=1; r<=list_priceSize; r++) {
	    	String price = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[6]")).getText();
	    	if(price.equals(lowestPrice)) {
	    		driver.findElement(By.xpath("//tbody//tr["+r+"]//td[1]/input")).click();
	    		break;
	    	}
	    }
	    Thread.sleep(2000);
	    
	    //Entering values.
	    driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("John Stanley");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='address']")).sendKeys("123 main road wow");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("London");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='state']")).sendKeys("London City");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("987654");
	    Thread.sleep(500);
	    WebElement cartType = driver.findElement(By.xpath("//select[@id='cardType']"));
	    Select select_carttype = new Select(cartType);
	    select_carttype.selectByVisibleText("American Express");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("3652 1478 2145 9856");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("02");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("John S");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	    Thread.sleep(2000);
	    String actual_confirmationMsg = driver.findElement(By.xpath("//div[@class='container']//h1")).getText();
	    String expected_confirmationMsg = "Thank you for your purchase today!";
	    
	    if(actual_confirmationMsg.equals(expected_confirmationMsg)) {
	    	System.out.println("Test paased...");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	System.out.println("Test failed...");
	    	Assert.assertTrue(false);
	    }
	    
	    closeDriver();
	}
}
