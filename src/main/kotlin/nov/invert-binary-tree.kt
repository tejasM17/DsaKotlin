package org.example.nov


var ti = TreeNode(5)
var v = ti.`val`
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val temp = root.left

    root.left = root.right
    root.right = temp

    invertTree(root.right)
    invertTree(root.left)

    return root
}