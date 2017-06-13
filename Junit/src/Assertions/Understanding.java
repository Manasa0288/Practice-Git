package Assertions;

import org.junit.Assert;
import org.junit.Test;

public class Understanding {
	@Test
	public void TestFacebook()
	{
		
	int actual_total_friends=100;
	int expected_total_friends=108;
	/*if(actual_total_friends==expected_total_friends)
		
		System.out.println("Pass");
	else
		System.out.println("fail");
	}*/
	
	Assert.assertEquals(actual_total_friends,expected_total_friends);
	}
	}