package arrays_01;

public class RemoveDuplicates {
    // input array
    int[] nums;
    //
    int[] numsTest = {0,0,1,1};
    // return number of unique elements
    int k;

    private int getSizeOfUniqueElements(int[] nums) {
        k = 0;
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    k++;
                }
            }
        }
        return k;
    }
}
