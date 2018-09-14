package staticExample;

public class Question_1_5 {

	private String s = "Hi";
    public static void main(String[] args) {
        Question_1_5 q = new Question_1_5();
        q.s = "Bye"; // 1
        System.out.println(q.s); // 2
        
        System.out.println(s);//from static method only static variables reference is aalowed
    }
}
