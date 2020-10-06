package leetcodes;

public class Solutionlcp19 {
    public static int minimumOperations(String leaves) {
        int L = -1;
        int R = -1;
        for(int i = 0; i<leaves.length();i++){
            if(leaves.charAt(i) == 'y'){
                L = i;
                break;
            }
        }
        for(int i = leaves.length()-1; i>0;i--){

            if(leaves.charAt(i) == 'y'){
                R = i;

                break;
            }
        }
        if(L==R)return 0;

        String newS = leaves.substring(L,R);
        int sum = 0;
        for (char c :  newS.toCharArray()) {
            if(c == 'r') sum++;
        }
    if (newS.toCharArray()[newS.length()-1] == 'y'&& sum>2 ||newS.toCharArray()[0] == 'y'&& sum>2   )sum+=1;
        return sum;
    }

  public static void main(String[] args) {
    //
    System.out.println(minimumOperations("yry"));
  }
}
