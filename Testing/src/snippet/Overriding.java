package snippet;

public class Overriding {
	
	int instanceVariable=4;
	static int staticVariable=21;
	
	public static void rishClassMethod(){
		System.out.println(staticVariable);
		//System.out.println(instanceVariable); //cannot access instance variable
		//Cannot make a static reference to the non-static field instanceVariable
	}
	
	public void neoInstanceMethod(){
		System.out.println(staticVariable);
		System.out.println(instanceVariable);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staticVariable);
		//System.out.println(instanceVariable);
		//Cannot make a static reference to the non-static field instanceVariable
	}

}
class Parent{
	void commonMethod(){
		
	}
}
class Child{
	
}