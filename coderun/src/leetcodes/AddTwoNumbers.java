package leetcodes;


import java.sql.SQLOutput;

class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = head;
        int addOne = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(l1!=null||l2!=null){
            l = l1 == null?0:l1.val;
            r = l2 == null?0:l2.val;
            sum = l+r+addOne;
            if(head == null){
                head = tail = new ListNode(sum%10);
            }else{
                tail =  tail.next = new ListNode(sum%10);
            }
            addOne = sum/10;
            if(l1 !=null)l1 = l1.next;
            if(l2
                        !=null)l2 = l2.next;
        }

        if(addOne>0){
            tail.next = new ListNode(addOne);
        }
        return head;


    }

  public static void main(String[] args) {
    //
      ListNode l = new ListNode(1);
      l.next = new ListNode(8);

      ListNode R = new ListNode(0);


      ListNode T = addTwoNumbers(l,R);
    System.out.println(T.val);



  }
}