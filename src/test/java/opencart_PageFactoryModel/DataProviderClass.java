package opencart_PageFactoryModel;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name = "getLoginData")
	public Object[][] getLoginData() {
		Object[][] data = {
				{"jejurkar.mahesh@gmail.com", "Mahesh@1990"},
				{"abc.xyz@jollyfree.com", "abc@xyz"}
		};
		return data;
	}
}
