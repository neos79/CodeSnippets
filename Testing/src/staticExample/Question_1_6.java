package staticExample;

public class Question_1_6 {

	private static int a;
    private int b;
    static {
        a = 1;
        b = 2;//Cannot make a static reference to the non-static field b
    }
    public static void main(String[] args) {
        Question_1_6 q1 = new Question_1_6();
        Question_1_6 q2 = new Question_1_6();
        q2.b = 1;
        System.out.println(q1.a + q2.b);
    }

}
