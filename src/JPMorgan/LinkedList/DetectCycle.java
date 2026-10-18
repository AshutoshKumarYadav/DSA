package JPMorgan.LinkedList;

import java.util.Arrays;

public class DetectCycle {

    void main(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        // Connect nodes: 1 -> 2 -> 3 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Create cycle: 4 -> 2
        node4.next = node2;
        System.out.println(hasCycle(node1));
    }

    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
        // Slow move one step
            slow = slow.next;
            // fast move two step
            fast = fast.next.next;

            // both pointer meet at one point
            if(slow == fast){
                return true;
            }
        }
        // Fast reached the end, so no cycle
        return false;
    }
}
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next =null;
    }
}
