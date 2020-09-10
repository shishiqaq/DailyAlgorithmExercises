package leetcode;

public class Leetcode2 {
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode p = l1, q = l2, curr = sum;
        int carry = 0;
        while(p != null || q != null){
            int x = (p == null) ? 0 : p.val;//1 0
            int y = (q == null) ? 0 : q.val;//9 9
            int temp = (x + y + carry) % 10;//10%10=0 10%10=0
            carry = (x + y + carry) / 10;   // 10/10=1 9/10=0
            curr.next = new ListNode(temp); //0 0
            curr = curr.next;
            if(p != null)
                p = p.next;
            if(q != null)
                q = q.next;
        }
        if(carry > 0)
            curr.next = new ListNode(1);
        
        return sum.next;
    }
}
