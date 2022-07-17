import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test1221() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertTrue(new Solution().isPalindrome(head));
    }

    @Test
    public void test12() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertFalse(new Solution().isPalindrome(head));
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        assertTrue(new Solution().isPalindrome(head));
    }

}