package leetcodes;

public class SolutionOffer17 {
    public static int[] printNumbers(int n) {
        int leng = 10;
        for (int i = 1;i<n;i++){
            leng *=10;
        }
        int [] a = new int[leng-1] ;
        for (int i = 0; i < leng-1&&i<leng-1;i++){
            a[i] = i+1;
        }
        return a;
    }

  public static void main(String[] args) {
    //
    System.out.println();
  }
}
