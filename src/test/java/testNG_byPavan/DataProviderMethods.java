package testNG_byPavan;

import org.testng.annotations.DataProvider;

public class DataProviderMethods {
	
	@DataProvider(name="OpenCart_LoginData", indices = {0, 2})
	Object[][] OpenCart_LoginData() {
			Object[][] data = {
								{"jejurkar.mahesh@gmail.com","Mahesh@1990"}, 
								{"abc.xyz@jollyfree.com", "abc@xyz1"},
								{"abc.xyz@jollyfree.com", "abc@xyz"}
							};
			return data;
		}
}
