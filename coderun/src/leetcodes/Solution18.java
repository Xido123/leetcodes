package leetcodes;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i<nums.length-3;i++){
            for(int j = i+1; j<nums.length-2;j++){
                for(int k = j+1;k<nums.length-1;k++){
                    for(int l = k+1;l<nums.length;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                            ArrayList<Integer> list = new ArrayList<>();
                            list.add(i);
                            list.add(j);
                            list.add(k);
                            list.add(l);
                            ll.add(list);
                        }
                    }
                }
            }
        }
        return ll;
    }
}
