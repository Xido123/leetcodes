package leetcodes;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class Solution1436 {
    public static String destCity(List<List<String>> paths) {
        String [] a = new String[paths.size()];
        String [] b = new String[paths.size()];
        for(int i  =0;i<paths.size();i++){
            a[i] = paths.get(i).get(0);

        }

        for(int i  =0;i<paths.size();i++){
            b[i] = paths.get(i).get(1);

        }
        for(int i  =0;i<paths.size();i++){
            int sum = 0;
            for(int j  =0;j<paths.size();j++){

                if(!b[i] .equals( a[j])){
                    sum++;
                }else{
                    break;
                }

            }
            if(sum == a.length)return b[i];
        }
        return "nukk";
    }

  public static void main(String[] args) {
    //

  }
}
