package JavaBasics.String;

public class CallByReference {

    int p, q;

    public static void main(String[] args) {

        CallByReference callByReference = new CallByReference();
        callByReference.p = 50;
        callByReference.q = 60;

        callByReference.swap(callByReference);
        System.out.println(callByReference.p);
        System.out.println(callByReference.q);

    }

    public void swap(CallByReference t) {
        int temp;
        temp = t.p; // temp=50;
        t.p = t.q; // t.p = 60;
        t.q = temp; // t.q=50;

    }
}
