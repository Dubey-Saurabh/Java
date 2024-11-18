package JavaBasics.Basics;

public class BreakAndContinue {

    public static void main(String[] args) {

        //do while
        int a = 0;
        do {
            System.out.println(a);
            if (a == 2) {
                System.out.println("Ending loop");
                break;
            }
            a++;
        }
        while (a < 5);

        // for loop
        for (int i = 0; i < 5; i++) {

            System.out.println(i);

            if (i == 2) {
                System.out.println("Ending loop");
                break;
            }


        }

        //Continue

        for (int i=0;i<5;i++){
            if (i==2){
                System.out.println("Ending loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }


    }


}
