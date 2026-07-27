/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode temp = head;

        // Count the number of nodes
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // If the first node has to be removed
        if (length == n) {
            return head.next;
        }

        int index = length - n;

        temp = head;

        // Move to the node before the one to delete
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // Delete the node
        temp.next = temp.next.next;

        return head;
    }
}