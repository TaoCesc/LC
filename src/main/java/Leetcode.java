public class Leetcode {

    public ListNode removeElements(ListNode head, int val) {
        while(head !=null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null){
            if(fast.val == val){
                slow.next = fast.next;
                fast = slow.next;
            }
            else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return head;
    }
    //迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public ListNode reverseListV2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {

    }
}
