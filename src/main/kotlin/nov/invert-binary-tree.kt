package org.example.nov


var ti = TreeNode(5)
var v = ti.`val`
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun invertTree(root: TreeNode?): {
    if (root == null) return null

}