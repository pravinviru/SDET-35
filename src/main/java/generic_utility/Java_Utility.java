package generic_utility;

import java.util.Date;
import java.util.Random;

public class Java_Utility {
	  /**
	   * this method is used to random number within the range of 1000
	   * @pravin      
	   */
	
	public int getRanDomNum()
	{
		Random random = new Random();
		  int rannum = random.nextInt(1000);
		   return rannum;
	}
	
	public String  getSystemDate() {
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] arr = currentDate.split(" ");
		
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
	
			String formate = yyyy+"-"+mm+"-"+dd;
			return formate;
	}

}
