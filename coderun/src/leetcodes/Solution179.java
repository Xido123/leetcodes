package leetcodes;

public class Solution179 {
    public static String largestNumber(int[] nums) {
        String [] s  = new String[nums.length];
        for (int i = 0;i< nums.length;i++ ) {
            s[i] = String.valueOf(nums[i]);
        }
String temp = "";
    for (int i = 0; i < s.length-1; i++) {
        for (int j = i+1;j<s.length;j++){
            if((s[i]+s[j]).compareTo(s[j]+s[i])<0){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
        }
    }

    temp = "";
    for (String sss :s ) {


        temp+=sss;
    }
    System.out.println("0000".compareTo("0") == "0000".length()-1);

        return temp;
//String s = "";
//String fin = "";
//        for (int i  : nums ) {
//             s +=String.valueOf(i);
//        }
//        int a = Integer.parseInt(s);
//        char [] c = s.toCharArray();
//        int [] nn = new int[]{0,0,0,0,0,0,0,0,0,0};
//        for(char cc :c){
//            int ccc = cc-'0';
//            nn[ccc]++;
//        }
//        for(int i = nn.length-1;i>=0;i--){
//            for (int j = 0;j<nn[i];j++){
//                fin+=String.valueOf(i);
//            }
//        }

    }

  public static void main(String[] args) {
    //
      largestNumber(new int []{3,31,34,5,9});
    System.out.println(largestNumber(new int []{3,30,34,5,9}));
  }
}
