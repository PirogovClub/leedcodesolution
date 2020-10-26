package addtwonumbers;

public class main {

    public static void main(String[] args) {
        System.out.println("start");
        Solution calc = new Solution();
        ListNode v1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode v2 = new ListNode(5,new ListNode(6, new ListNode(4)));
        ListNode tmp = calc.addTwoNumbers(v1,v2);
        while (tmp!=null){
            System.out.print(tmp.val);
            tmp=tmp.next;
        }
        System.out.println("");
        System.out.println("finish");

    }


}
