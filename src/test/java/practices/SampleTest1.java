package practices;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_utility.Baseclass;


@Listeners(generic_utility.ListnerImgClass.class)
public class SampleTest1 extends Baseclass {
	
	
	@Test
	public void aaa()
	{
		System.out.println("====TestStart====");
		
		Assert.assertEquals(false, true);
		
		System.out.println("====TestEnd====");
	}

}
