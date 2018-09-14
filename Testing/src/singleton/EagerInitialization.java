package singleton;

/*
If your singleton class is not using a lot of resources, this is the approach to use.
But in most of the scenarios, Singleton classes are created for resources such as 
File System, Database connections etc and we should avoid the instantiation until 
unless client calls the getInstance method. Also this method doesn’t provide any options 
for exception handling.
*/

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization(){}
    
    public static EagerInitialization getInstance(){
        return instance;
    }
    
    
    public static void main(String ar[]){
    	System.out.println("First Time :"+getInstance());
    	System.out.println("Second Time :"+getInstance());
    	
    	EagerInitialization eagerInitialization1=getInstance();
    	EagerInitialization eagerInitialization2=getInstance();
    	    	
    	System.out.println("Are they equal :"+getInstance().equals(getInstance()));
    	System.out.println("Are they equal :"+eagerInitialization1.equals(eagerInitialization2));
    	System.out.println("Are they equal :"+(eagerInitialization1==eagerInitialization2));
    }
}
