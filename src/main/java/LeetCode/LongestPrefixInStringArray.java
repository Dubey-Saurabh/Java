package LeetCode;

import java.util.Arrays;

public class LongestPrefixInStringArray {

    public static void main(String[] args) {

        String arr[] = {"flower", "flow", "flight"};
        System.out.println(getLongestPrefix(arr));

    }

    public static String getLongestPrefix(String arr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String str = arr[0];
        String trr = arr[arr.length - 1];
        int idx = 0;

        while (idx < str.length() && idx < trr.length()) {
            if (str.charAt(idx) == trr.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }

        return str.substring(0, idx);

    }
}
