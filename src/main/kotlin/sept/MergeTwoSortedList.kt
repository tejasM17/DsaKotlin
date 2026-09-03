package sept

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(4)

    val list2 = ListNode(1)
    list1.next = ListNode(3)
    list1.next?.next = ListNode(4)

    println(MergeLists(list1, list2))

}

class MergeLists(list1: ListNode, list2: ListNode ) {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var current1 = list1
        var current2 = list2

        val mergedHead = ListNode(0)
        var tail = mergedHead

        while (current1 != null && current2 != null) {
            if (current1.`val` <= current2.`val`) {
                tail.next = current1
                tail = current1
                current1 = current1.next
            } else {
                tail.next = current2
                tail = current2
                current2 = current2.next
            }
        }

        if (current1 == null) {
            tail.next = current2
        } else {
            tail.next = current1
        }

        return mergedHead.next
    }
}