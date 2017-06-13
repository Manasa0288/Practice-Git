package selenium2;

public class Operators {
	public static void main(String args[])
	{
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b&a<c);//false & true = false  

System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true    
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
int min=(a<b)?a:b;  
System.out.println(min);  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
System.out.println(a);  
System.out.println(b);  
		
	}

}
