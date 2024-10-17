package JavaBasics.ImportantInterviewQuestions;

public class MissingNumberInArray {

    public static int getMissingNumber(int n[], int totalSum) {

        int expSum = totalSum * (totalSum + 1) / 2;
        int actSum = 0;

        for (int i : n) {
            actSum += i;
        }

        return expSum - actSum;

    }

    public static void main(String[] args) {

        int n[] = {1,2,4,5};
        int value = getMissingNumber(n, 5);
        System.out.println(value);

    }


}


