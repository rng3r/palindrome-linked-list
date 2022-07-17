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
    public boolean isPalindrome(ListNode head) {

        if (head.next == null)
            return true;

        ListNode reverseHead = null;

        ListNode directHead = head;

        while (directHead != null) {
            reverseHead = new ListNode(directHead.val, reverseHead);
            directHead = directHead.next;
        }

        directHead = head;
        while (directHead != null && reverseHead != null) {
            if (directHead.val != reverseHead.val)
                return false;
            directHead = directHead.next;
            reverseHead = reverseHead.next;
        }

        return true;

    }



}