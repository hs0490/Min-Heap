/**
 *
 * Name : Himanshu Saxena           REDID: 817349215        Data: 4 Feb, 2014
 *
 *                                   Assignment 1
 *                  CS 635 Advanced Object-Oriented Programming
 *                            Instructor : Dr. Roger Whitney
 *
 */

package com.himanshu.minheap;

import java.util.ArrayList;

public class MinHeap {

    private MinHeap rootNode;

    String data;
    MinHeap leftChildNode;
    MinHeap rightChildNode;

    // creates Min Heap Node
    private MinHeap(String data) {
        this.data = data;
    }

    // default constructor
    public MinHeap() {
        this(null);
    }

    /**
     * This function add Node in Min Heap and calls function insertElement().
     *
     * @param data
     *            The value of the node
     */
    public void addElement(String data) {

        MinHeap newNode = new MinHeap(data);
        if (rootNode == null)
            rootNode = newNode;
        else
            insertElement(rootNode, newNode);

    }

    /**
     * This function compare new node with current node. The larger of two node
     * is inserted to sub heap with small height. If height of both sub heap are
     * same then the larger of two node is inserted in left sub heap. The
     * function is repeated until a node is added to a new node at the bottom of
     * the heap.
     *
     * @param currentNode
     *            The current node that new node is compared to.
     * @param newNode
     *            The new node to be inserted.
     * */
    private void insertElement(MinHeap currentNode, MinHeap newNode) {
        if (currentNode.data.compareTo(newNode.data) < 0) {
            if (getHeapDepth(currentNode.leftChildNode) <= getHeapDepth(currentNode.rightChildNode)) {
                if (currentNode.leftChildNode != null) {
                    insertElement(currentNode.leftChildNode, newNode);
                    return;
                }
                // If currentNode rightChildNode is null
                currentNode.leftChildNode = newNode;
            } else {
                if (currentNode.rightChildNode != null) {
                    insertElement(currentNode.rightChildNode, newNode);
                    return;
                }
                // If currentNode rightChildNode is null
                currentNode.rightChildNode = newNode;
            }
        } else {
            // swap nodes
            String data = currentNode.data;
            currentNode.data = newNode.data;
            newNode.data = data;

            insertElement(currentNode, newNode);
        }
    }

    /**
     * This function calculates the depth of heap from current node.
     *
     * @param currentNode
     *            The depth of sub heap is calculated from this node.
     * @return Depth of left sub heap.
     */
    private int getHeapDepth(MinHeap currentNode) {
        if (currentNode == null)
            return 0;
        return 1 + Math.max(getHeapDepth(currentNode.leftChildNode),
                getHeapDepth(currentNode.rightChildNode));
    }

    /**
     * This functions returns values in the heap in pre order (root, the left
     * sub-heap, right sub-heap).
     *
     * @return ArrayList
     */
    public ArrayList<String> getHeapValuesList() {
        String condition = null;
        return preOrderTraversal(rootNode, condition, new ArrayList<String>());
    }

    /**
     * This functions returns strings that end in "ing" in the heap in pre
     * order.
     *
     * @return ArrayList
     */
    public ArrayList<String> getValuesWithINGList() {
        String condition = "ing";
        return preOrderTraversal(rootNode, condition, new ArrayList<String>());
    }

    /**
     * This traverse the heap in pre order traversal.
     *
     * @param currentNode
     * @param traverseCondition
     *            Traversing Condition for pre order traversal.
     * @param list
     *            Array list where traversed node are stored.
     * @return ArrayList
     */
    private ArrayList<String> preOrderTraversal(MinHeap currentNode,
                                                String traverseCondition, ArrayList<String> list) {
        if (currentNode != null) {
            String data = currentNode.data;
            if (traverseCondition != null) {
                if (data.endsWith(traverseCondition))
                    list.add(data);
            } else
                list.add(data);

            preOrderTraversal(currentNode.leftChildNode, traverseCondition,
                    list);
            preOrderTraversal(currentNode.rightChildNode, traverseCondition,
                    list);
        }
        return list;
    }
}
