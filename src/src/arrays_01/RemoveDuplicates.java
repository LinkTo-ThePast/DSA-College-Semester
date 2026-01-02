package arrays_01;

public class RemoveDuplicates {
    // input array
    int[] nums;
    //
    int[] numsTest = {0,0,1,1};

    //
    int[] numsTest2 = {0,0,1,1,1,2,2,3,3,4};
    // return number of unique elements
    int k;

    public int getSizeOfUniqueElements(int[] nums) {
        k = 0;
        for (int i = 0; i < nums.length; i++ ) {
            // first iteration:
            // i = 0 --> nums[i=0] = 0;
            // j = i + 1 = 1 --> nums[j=1] = 0;

            // second iteration:
            // i = 1 ---> nums[i=1] = 0;
            // j = i + 1 = 2 ---> nums[j=2] = 1:

            // third iteration
            // i = 2 ----> nums[i=2] = 1;
            // j = i + 1 = 3 ---> nums[j=3] = 1;

            // fourth iteration
            // i = 3 --> = 1
            // j

            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    k++;
                }
            }
        }
        return k;
    }
}
