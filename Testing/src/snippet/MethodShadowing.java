package snippet;

public class MethodShadowing {
	
	int i=10;
	public void instanceMethod(){
		int i=11;//this is called method shadowing
		System.out.println(i);
	}
	public static void main(String []a){
		MethodShadowing ms=new MethodShadowing();
		ms.instanceMethod();
	}

}

