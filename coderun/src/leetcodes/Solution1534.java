package leetcodes;

public class Solution1534 {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int x =0;
        for (int i = 0; i < arr.length-2;i++) {
            for (int j = i+1; j < arr.length-1;j++) {


                for (int k = j+1;k<arr.length;k++) {

                    if ((Math.abs(arr[i] - arr[j]) <= a )&& (Math.abs(arr[j] - arr[k]) <= b )
                            && (Math.abs(arr[i] - arr[k]) <= c)) {
                        x++;
            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" ");
                    }
                }
            }
        }
        return x;
    }

  public static void main(String[] args) {
    //
    System.out.println(countGoodTriplets(new int[] {3,0,1,1,9,7},7,
            2,
            3));
  }
}
