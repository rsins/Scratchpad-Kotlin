package com.myexample.tree

import kotlin.random.Random

class TreeNode<T> (private var dataValue: T) {
    private var mLeft : TreeNode<T>? = null
    private var mRight : TreeNode<T>? = null

    constructor(dataValue : T, mLeft : TreeNode<T>?, mRight : TreeNode<T>?) : this(dataValue) {
        this.mLeft = mLeft
        this.mRight = mRight
    }

    fun getValue() : T {
        return this.dataValue
    }

    fun getLeft() : TreeNode<T>? {
        return this.mLeft
    }

    fun setLeft(node : TreeNode<T>?) : Unit {
        this.mLeft = node
    }

    fun getRight() : TreeNode<T>? {
        return this.mRight
    }

    fun setRight(node: TreeNode<T>?): Unit {
        this.mRight = node
    }
}

class Tree<T> {
    private var root : TreeNode<T>? = null

    companion object {
        @JvmStatic
        fun generateTreeStructureWithIntValues(): Tree<Int> {
            var myTree: Tree<Int> = Tree<Int>()
            myTree.root = TreeNode(Random.nextInt(Int.MIN_VALUE, Int.MAX_VALUE))
            return myTree
        }
    }
}