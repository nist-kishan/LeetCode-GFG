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
        ListNode temp=new ListNode(0);
        temp.next=head;

        ListNode ptr1=temp;
        ListNode ptr2=temp;

        for(int i=0;i<=n;i++){
            ptr1=ptr1.next;
        }

        while(ptr1!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        ptr2.next=ptr2.next.next;
        
        return temp.next;
    }
}