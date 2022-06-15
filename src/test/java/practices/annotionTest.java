package practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class annotionTest {
	
	@Test(dataProvider="w")
	public void practiceTest(String src,String dest) {
		System.out.println(src + dest);
	}
	
	@DataProvider
	public Object[][] w()
	{
		Object[][] ss = new Object[2][2];
		
		ss[0][0]="anaicut";
		ss[0][1]="vellore";
		
		ss[1][0]="chennai";
		ss[1][1]="coim";
		return ss;
		
	}
}
