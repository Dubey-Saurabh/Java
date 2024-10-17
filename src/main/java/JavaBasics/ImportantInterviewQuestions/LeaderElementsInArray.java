package JavaBasics.ImportantInterviewQuestions;

public class LeaderElementsInArray {
    //All the right most element should be smaller than Leader Element, last element will always be a leader element.

    public static void leaderElements(int num[]) {

        int max = num[num.length - 1];
        System.out.println(max + " ");

        for (int i = num.length - 2; i >= 0; i--) {
            if (num[i] > max) {
                System.out.println(num[i] + " ");
                max = num[i];
            }
        }
    }

    public static void main(String[] args) {

        leaderElements(new int[]{92, 3, 4, 5, 2, 3, 1, 4});

        leaderElements(new int[]{92, 93, 4, 15, 2, 23, 1, 47});

    }

}
