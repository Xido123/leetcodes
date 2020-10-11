package leetcodes;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.util.Date;

public class exam10112 {

    public static boolean checkPalindromeFormation(String a, String b) {
        if(a.length() ==1|| b.length()==1)return true;
        char al = 'a';
        char ar = 'a';
        char bl = 'a';
        char br = 'a';


        if(a.charAt(0) !=b.charAt(b.length()-1) &&b.charAt(0) !=a.charAt(b.length()-1))return false;
        boolean l = false;
        int lsum = 0;
        int rsum = 0;
        boolean r = false;
        int x = 0;
        if(a.length()%2 == 0) x = a.length()/2;
        else x = a.length()/2+1;

        for (int i = 0;i < x;i++){
           al = a.charAt(i);
           ar = a.charAt(a.length()-1-i);
           bl = b.charAt(i);
           br = b.charAt(a.length()-1-i);

           if(al == br){
               l = true;
               continue;
           }else {
               al = bl;
              if(al == br){
                  l = true;
                  continue;
                  }else {
                  l = false;
                  break;
              }
           }
        }

        for (int i = 0;i < a.length();i++){
            al = a.charAt(i);
            ar = a.charAt(a.length()-1-i);
            bl = b.charAt(i);
            br = b.charAt(a.length()-1-i);
//             System.out.println(bl+" "+ar);
            if(bl == ar){
                r = true;
                continue;
            }else {
                bl = al;
//                System.out.println(bl+" "+ar);
                if(bl == ar){
                    r = true;
                    continue;
                }else {
                    r = false;
                    break;
                }
            }
        }
//    System.out.println(l+ " "+r);
        return l||r;
    }

  public static void main(String[] args) {
    //
      long start = System.currentTimeMillis();
//此处写要测试的代码


    System.out.println(checkPalindromeFormation("abda",
            "acmc"));
    long end = System.currentTimeMillis();

    System.out.println(end-start);
  }
}
