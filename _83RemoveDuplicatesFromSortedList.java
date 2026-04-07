import java.util.HashSet;
import java.util.Set;

/** Definition for singly-linked list. */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        if (head==null) {
            return null;
        }
        // 1 1 2 3 3
        ListNode prevNode = head;
        ListNode nextNode = prevNode.next;
        set.add(prevNode.val);
        while (nextNode!=null) {
            if (set.contains(nextNode.val)) {
                prevNode.next= nextNode.next;
                nextNode = prevNode.next;
            }else{
                set.add(nextNode.val);
                prevNode = prevNode.next;
                nextNode = prevNode.next;
            }
        }
        

        return head;
    }
}

public class _83RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode hea = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2))));
        Solution solution = new Solution();
       ListNode  head = solution.deleteDuplicates(hea);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
