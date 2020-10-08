package leetcodes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> l = new LinkedList<>();
        int min = arr[1]-arr[0];
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min){
                min = arr[i+1]-arr[i];
            }
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == min){
                LinkedList a = new LinkedList();
                a.add(arr[i]);
                a.add(arr[i+1]);

                l.add(a );
            }
        }

        return l;
    }
    public static void main(String[] args){
    System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}).get(2).get(1));
    }
}
