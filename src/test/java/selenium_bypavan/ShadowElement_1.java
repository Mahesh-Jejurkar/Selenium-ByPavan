package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class ShadowElement_1 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		Thread.sleep(2000);
		
		//Shadow Element
		SearchContext shadowroot1 =	driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
		Thread.sleep(2000);
		String text1 = shadowroot1.findElement(By.cssSelector("#shadow-element")).getText();
		System.out.println(text1);
		
		//Nested Shadow Element
		SearchContext shadowroot2 = shadowroot1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(2000);
		String text2 = shadowroot2.findElement(By.cssSelector("#nested-shadow-element")).getText();
		System.out.println(text2);
		
		
		//Multi Nested Shadow Element
		SearchContext shadowroot3 = shadowroot2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(2000);
		String text3 =shadowroot3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		System.out.println(text3);
		
		
		closeDriver();
	}
}