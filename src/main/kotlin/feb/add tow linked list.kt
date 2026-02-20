package feb

class Node(var value: Int) {
    var next: Node? = null
}

    fun mergeList(list1: Node?, list2: Node?): Node? {
        val dummy = Node(0)
        var tail = dummy

        var l1 =list1
        var l2 = list2
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                tail.next = l1
                l1 = l1.next
            }
            else
            {
                tail.next = l2
                l2 = l2.next
            }
            tail = tail.next!!
        }

        if (l1 == null){
            tail.next = l2
        }else{
            tail.next = l1
        }

        return dummy.next
    }



fun buildList(arr: IntArray): Node? {
    if (arr.isEmpty()) return null

    val head = Node(arr[0])
    var current = head

    for (i in 1 until arr.size) {
        current.next = Node(arr[i])
        current = current.next!!
    }

    return head
}

fun main() {
    val ls1 = buildList(intArrayOf(1,2,4))
    val ls2 = buildList(intArrayOf(1,3,4))

    val merg = mergeList(ls1, ls2)
    println( merg)
}