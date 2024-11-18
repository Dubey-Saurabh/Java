package JavaBasics.Basics;

public class PrecidenceAndAssociativity {

    public static void main(String[] args) {

        //Note: First we'll check the precedence, which ever is highest priority will be given to that
        //           if both appears in same box, then we'll go with associativity like left to right or vice versa

        int a = 6*5 -34/2;

        // As per P and A, the first preference would be given to * then / then -

        System.out.println(a);

        int b = 60/5-34*2;

        // As per P and A, this is the tie case so as per associativity  the first preference would be given to / then * then -

        System.out.println(b);


    }
}
