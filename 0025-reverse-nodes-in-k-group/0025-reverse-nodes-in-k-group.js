/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var removeDuplicates = function(nums) {
    if (nums.length === 0) return 0;

    let k = 1;

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[k - 1]) {
            nums[k++] = nums[i];
        }
    }

    return k;
};var reverseKGroup = function(head, k) {
    let dummy = new ListNode(0);
    dummy.next = head;

    let prevGroup = dummy;

    while (true) {
        let kth = prevGroup;

        for (let i = 0; i < k && kth; i++) {
            kth = kth.next;
        }

        if (!kth) break;

        let groupNext = kth.next;

        let prev = groupNext;
        let curr = prevGroup.next;

        while (curr !== groupNext) {
            let temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        let temp = prevGroup.next;
        prevGroup.next = kth;
        prevGroup = temp;
    }

    return dummy.next;
};