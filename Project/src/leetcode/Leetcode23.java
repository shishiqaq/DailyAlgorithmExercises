package leetcode;

public class Leetcode23 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = l1, second = l2, result = new ListNode(0);
        ListNode p = result;
        
        while(first != null && second != null){
            if(first.val > second.val){
                result.next = new ListNode(second.val);
                second = second.next;
                result = result.next;
            } else{
                result.next = new ListNode(first.val);
                first = first.next;
                result = result.next;
            }
        }
        if(first != null)
            result.next = first;
        else if(second != null)
            result.next = second;
        return p.next;
    }
    public void merge(ListNode[] lists, int n){
        if(n == 0)
            return;
        int left = 0, right = n;
        while(left < right){
            lists[left] = mergeTwoLists(lists[left++], lists[right--]);
        }
        merge(lists, right);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        merge(lists, lists.length - 1);
        return lists[0];
    }
}
