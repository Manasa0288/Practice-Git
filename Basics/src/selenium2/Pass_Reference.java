package selenium2;

public class Pass_Reference {
	int x; 
	int y;

	public static void main(String[] args) {
		Pass_Reference p=new Pass_Reference();
		p.x=10;
		p.y=20;
		System.out.println(p.x+"-----"+p.y);
		Swap(p.x,p.y);
		System.out.println(p.x+"-----"+p.y);
		swapvals(p);
		System.out.println(p.x+"---"+p.y);
		
		}

	private static void Swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
	public static void swapvals(Pass_Reference t){
		int temp=t.x;
		t.x=t.y;
		t.y=temp;
		
	}

}
