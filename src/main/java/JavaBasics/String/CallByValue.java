package JavaBasics.String;

public class CallByValue {

    public static void main(String[] args) {
        int x = 10, y = 20;
        CallByValue cb = new CallByValue();
        int result= cb.callByValue(x, y);
        System.out.println(result);// One copy of x and y will be given to a and b respectively, that's called callByValue.

    }

    public int callByValue(int a, int b) {
//        a=30;
//        b=40;
        int c = a + b;
        return c;
    }
}
