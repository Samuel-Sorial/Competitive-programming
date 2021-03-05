
// O(N) Solution for https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3660/
/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
* @param {ListNode} head
* @return {Number}
*/
var getLength = (head) => {
    let cursor = head;
    let length = 0;
    while(cursor){
        length++;
        cursor = cursor.next;
    }
    return length;
}
/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let cursor_A = headA;
    let cursor_B = headB;
    while(cursor_A && cursor_B){
        let length_A = getLength(cursor_A);
        let length_B = getLength(cursor_B);
        while(length_A > length_B){
            cursor_A = cursor_A.next;
            length_A--;
        }
        while(length_B > length_A){
            cursor_B = cursor_B.next;
            length_B--;
        }
        if(length_A > length_B){
            cursor_A = cursor_A.next;
            length_A--;
        }else if(length_A < length_B){
            cursor_B = cursor_B.next;
            length_B--;
        }else{
            if(cursor_A === cursor_B) {
                return cursor_A
            }else{
                cursor_A = cursor_A.next;
            }
        }
    }