# CLASS MIN-HEAP

- A min-heap is a heap in which the root has the smallest value in the heap.
- In our min-heap each node has a value and 0, 1 or 2 children heaps. The root node of a min-heap contains the smallest value in the heap. If you pick any node in the heap it has a value that is equal to or less than all the nodes in either the left or right sub-heaps of the node.
 

## Node Insertion Logic In Min-Heap
- To add a new value to the heap add it to the top of the heap.
- If the heap is empty the new value becomes the root. 
- If heap is not empty then the smaller of the two values (current value in heap and the new value) is kept in the root. 
- The larger of the two values is added the sub-heap with the smallest height. 
- If both sub-heaps have the same height then the larger of the two values is added to the left heap. 
- The process is repeated until a value is added to a new node at the bottom of the heap.

### CONSTRUCTOR DETAILS

- private MinHeapNode(String data)
     - Constructs a Min-Heap Node with the specified value.

- public MinHeapNode()
     - Default Constructor.

### METHOD DETAILS

- addElement(String data)
   - This function add Node in Min Heap.
      
- int getHeapDepth(MinHeapNode currentNode)
   - This function calculates the depth of heap from current node.
      
- ArrayList<String> getHeapValuesList() 
   -  This functions returns values in the heap in pre-order (root, the left sub-heap, right sub-heap).

- ArrayList<String> getValuesWithINGList()
   -  This functions returns strings that end in "ing" in the heap in pre-order.
 