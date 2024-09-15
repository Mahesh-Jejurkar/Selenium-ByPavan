package selenium_bypavan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		clickSimpleAlert(driver);
//		Thread.sleep(2000);
//		clickConfirmationAlert(driver);
//		Thread.sleep(2000);
//		clickPromptAlert(driver);

		Thread.sleep(5000);
		driver.close();

	}

	public static void clickSimpleAlert(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert1 = driver.switchTo().alert();
		String alert_text1 = alert1.getText();
		Thread.sleep(1000);
		alert1.accept();
		System.out.println(alert_text1);
		Thread.sleep(1000);
		String actual_confirmMsg1 = driver.findElement(By.xpath("//p[2]")).getText();
		String extected_confirmMsg1 = "You successfully clicked an alert";
		if (actual_confirmMsg1.equals(extected_confirmMsg1)) {
			System.out.println("Test passed...");
		} else {
			System.out.println("Test failed...");
		}

	}

	public static void clickConfirmationAlert(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		String alert_text1 = alert1.getText();
		Thread.sleep(1000);
		alert1.accept();
		System.out.println(alert_text1);
		Thread.sleep(1000);
		String actual_confirmMsg1 = driver.findElement(By.xpath("//p[2]")).getText();
		String extected_confirmMsg1 = "You clicked: Ok";
		if (actual_confirmMsg1.equals(extected_confirmMsg1)) {
			System.out.println("You clicked on Ok : Test passed...");
		} else {
			System.out.println("You clicked on Ok : Test failed...");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert2 = driver.switchTo().alert();
		String alert_text2 = alert2.getText();
		Thread.sleep(1000);
		alert2.dismiss();
		System.out.println(alert_text2);
		Thread.sleep(1000);
		String actual_confirmMsg2 = driver.findElement(By.xpath("//p[2]")).getText();
		String extected_confirmMsg2 = "You clicked: Cancel";
		if (actual_confirmMsg2.equals(extected_confirmMsg2)) {
			System.out.println("You clicked on Cancel : Test passed...");
		} else {
			System.out.println("You clicked on Cancel : Test failed...");
		}
	}

	public static void clickPromptAlert(WebDriver driver) throws Exception {
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(500);
		String alert_text1 = alert1.getText();
		String input_value1 = "Mahesh";
		alert1.sendKeys(input_value1);
		Thread.sleep(1000);
		alert1.accept();
		System.out.println(alert_text1);
		Thread.sleep(1000);
		String extected_confirmMsg1 = "You entered: " + input_value1;
		String actual_confirmMsg1 = driver.findElement(By.xpath("//p[2]")).getText();
		if (actual_confirmMsg1.equals(extected_confirmMsg1)) {
			System.out.println("You clicked on Ok : Test passed...");
		} else {
			System.out.println("You clicked on Ok : Test failed...");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		String alert_text2 = alert2.getText();
		alert2.dismiss();
		System.out.println(alert_text2);
		Thread.sleep(1000);
		String extected_confirmMsg2 = "You entered: null";
		String actual_confirmMsg2 = driver.findElement(By.xpath("//p[2]")).getText();
		if (actual_confirmMsg2.equals(extected_confirmMsg2)) {
			System.out.println("You clicked on Cancel : Test passed...");
		} else {
			System.out.println("You clicked on Cancel : Test failed...");
		}
	}

}
