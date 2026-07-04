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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode (-1 , head );
        ListNode temp = dummy.next ; 
        ListNode prev = dummy ; 
        while(temp != null){
            if (temp.val != val ){
                prev = temp ; 
                temp = temp.next ;

            }
            else{
                prev.next = temp.next ; 
                temp = temp.next ;
            }
        }
        return dummy.next ;
    }
}



// Time: O(n) — You must visit every node at least once because any node could contain val. You cannot do better than O(n).
// Space: O(1) — You only use a few pointers (dummy, prev, temp).
// So there is no algorithm with better asymptotic complexity.