package JavaBasics.Practice;

public class Divide {

    public static void main(String[] args) {

        int seconds = 86399;

        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes //1,439.983333333333
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours

        System.out.print(H + ":" + M + ":" + S);


    }
}
