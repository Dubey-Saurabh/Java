package JavaCollections.ArrayPrograms;

import java.util.Arrays;

public class LeftRightShiftOfZeroAndOne {

    // Define an array of integers containing 0s and 1s.
    // Perform segregation of 0s and 1s in the array.
    /* While 0 at the left, increment the left index. */
    /* While we see 1 at the right, decrement the right index. */
    // Swap 0 and 1 and increment left and decrement right.


    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};

        int i, nums_size = nums.length;
        int left = 0, right = nums_size - 1;
        int temp=0;

        while (left < right) {

            if (nums[left] ==1 && nums[right]==0){

                nums[temp] = nums[left];
                nums[left]=nums[right];
                nums[right]=nums[temp];
                left++;
                right--;

            }

            if (nums[left] ==0){
                left++;
            }
            if (nums[right] ==1){
                right--;
            }


        }

        System.out.println("Array after segregation is : " + Arrays.toString(nums));


    }
}
