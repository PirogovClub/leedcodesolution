package addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode listToReturn = new ListNode(0);
        int addtition = 0;
        ListNode tmpL1 = l1, tmpL2 = l2, tmpResult = listToReturn;
        while ((tmpL1!=null)||(tmpL2!=null)){
            int s1=(tmpL1!=null)? tmpL1.val:0;
            int s2=(tmpL2!=null)? tmpL2.val:0;
            int sum = s1 + s2 + addtition;
            addtition= sum /10;
            tmpResult.next = new ListNode(sum %10);
            tmpResult=tmpResult.next;

             if (tmpL1!=null) tmpL1 = tmpL1.next;
             if (tmpL2!=null) tmpL2 = tmpL2.next;
        }
        if (addtition>0){
            tmpResult.next=new ListNode(addtition);
        }
        return listToReturn.next;
    }


}
