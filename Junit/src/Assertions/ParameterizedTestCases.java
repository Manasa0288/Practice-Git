package Assertions;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class ParameterizedTestCases {
	public String username;
	public String password;
	public int pin;
public ParameterizedTestCases(String username, String password, int pin){
	this.username=username;
	this.password=password;
	this.pin=pin;
}
@Parameters


	
}


