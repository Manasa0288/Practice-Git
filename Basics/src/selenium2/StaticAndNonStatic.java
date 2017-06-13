package selenium2;

public class StaticAndNonStatic {

	private String mod;

	public static void main(String[] args) {
		 StaticAndNonStatic a = new StaticAndNonStatic();
		 StaticAndNonStatic b = new StaticAndNonStatic();
		 StaticAndNonStatic c = new StaticAndNonStatic();
		
		
		a.mod="A";
		b.mod="B";
		c.mod="C";
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		a=b;
		b=c;
		c=a;
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		a.mod="pathi";
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		
		

	}

}
