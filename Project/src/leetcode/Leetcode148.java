package leetcode;

public class Leetcode148 {
	
	public class ListNode {
	    int val;
	    ListNode next;
	   	ListNode() {}
   		ListNode(int val) { this.val = val; }
  		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
    
    public static void main(String[] args) {
    	Leetcode148 o = new Leetcode148();
		ListNode n = o.new ListNode(4);
		n.next = o.new ListNode(2);
		n.next.next = o.new ListNode(3);
		n.next.next.next = o.new ListNode(1);
		o.sortList(n);
	}
    
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 == null) ? list2 : list1;
        return dummyHead.next;
    } 
    
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
}
