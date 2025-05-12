/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy= ListNode(0)
        var tail= dummy
        var linkedList1= list1
        var linkedList2= list2
        while(linkedList1!=null && linkedList2!=null){
            if(linkedList1.`val` < linkedList2.`val`){
                tail.next= linkedList1
                linkedList1= linkedList1.next
            }else{
                tail.next= linkedList2
                linkedList2= linkedList2.next
            }
            tail= tail.next
        }
        if(linkedList1!=null){
            tail.next= linkedList1
        }else if (linkedList2!=null){
            tail.next= linkedList2
        }
        return dummy.next
    }
}