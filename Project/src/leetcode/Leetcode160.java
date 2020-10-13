package leetcode;

public class Leetcode160 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        
        ListNode pa = headA, pb = headB;
        while(pa != pb){
            pa = pa.next;
            pb = pb.next;
            if(pa == pb)
                return pa;
            if(pa == null)
                pa = headB;
            if(pb == null)
                pb = headA;
        }
        
        return pa;
    }
}
