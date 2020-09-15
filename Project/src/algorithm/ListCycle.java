package algorithm;

public class ListCycle {
	
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
    	}
		ListNode(){}
	}

	public boolean isCycle(ListNode head) {
		ListNode p = head;
	
		while(p != null) {
			p = p.next;
			if(p == head)
				return true;
		}
		return false;
	}
	
	public boolean isCycle2(ListNode head){
	    ListNode slow = head, fast = head, meet1 = head, meet2;
	   
	    while ( fast != null && fast.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if ( slow == fast ) {
                while(slow != meet1){
                    slow = slow.next;
                    meet1 = meet1.next;
                }
	        }
	    }
	    slow = slow.next;
	    fast = fast.next.next;      
	    while ( fast != slow )
	    {
	        slow = slow.next;
	        fast = fast.next.next;     
	    }
	    meet2 = slow;
	    if(meet1 == meet2)
	    	return true;
	    else
	    	return false;
	}
}
