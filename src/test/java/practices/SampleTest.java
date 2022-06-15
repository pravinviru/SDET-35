package practices;

import org.testng.annotations.Test;



//@Test
public class SampleTest {
	
	
    @Test(invocationCount = 2)
	public void  createContactTest()
	{
		System.out.println("contact created");
	}

   @Test(invocationCount = 1)     // here the method is depend on another 
                                                     // if the method got failed mean then the dependant 
	public void modifyContact()                       //dependant method should be skipped
	{
		System.out.println("contact modified");
	}                                                 //dependsOnMethods
                                                      //priority=1    
	 @Test(invocationCount = 3)
	public void deleteContactTest()
	{
		System.out.println("contact deleted");
	}
}
