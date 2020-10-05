package leetcodes;

import java.util.LinkedList;
import java.util.Queue;

public class offer42 {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i : nums){

        }
        return 1;
    }

    /**
     * 贪心算法
     */
    public int maxSubArrayT(int [] nums){
        int sesSum = 0;
        int curSum = 0;

    for (int i : nums) {
      if (curSum <= 0) curSum = i;
      else curSum += i;
      resSum = curSum > resSum ? curSum : resSum;
        }
    }
    /**
     *
     */
}



