import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases {
	public static boolean checkLogin(){
	return false;
	}
	@BeforeClass
	public static void Beggining()
	{
		System.out.println("++++++++++++++++");
		Assume.assumeTrue(false);
	}
	@AfterClass
	public static void Ending()
	{
		System.out.println("##############");
	}
	@Before
	public void openBrowser()
	{
		System.out.println("Opening");
	}
	@Test
	public void LoginTest()
	{
	System.out.println("Looged in");
	}
	@After
	public void closeBrowser()
	{
		System.out.println("closing");
	}

}
