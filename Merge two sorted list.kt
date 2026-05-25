class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var l1 = list1
        var l2 = list2

        if (l1 == null) return l2
        if (l2 == null) return l1

    return if (l1.`val` < l2.`val`) {
        l1.next = mergeTwoLists(l1.next, l2)
        l1
    } else {
        l2.next = mergeTwoLists(l1, l2.next)
        l2
    }
    }
}
