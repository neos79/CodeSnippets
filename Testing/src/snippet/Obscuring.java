package snippet;

public class Obscuring {
	static int k;
	
	{
		System.out.println("IIB");
	}
	
	static {
		int r=2;
		System.out.println("static block");
	}
	
	Obscuring(){
		
		System.out.println("constructor");
	}
	
	public static void main(String []s){
		//System.out.println("hhii");//this is obscurring
		//Cannot make a static reference to the non-static field SystemCannot
		//make a static reference to the non-static field System
		System.out.println(Obscuring.k);
		//System.out.println( "	"+new Obscuring());
	}
}


