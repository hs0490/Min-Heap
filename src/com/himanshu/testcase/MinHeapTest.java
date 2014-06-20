package com.himanshu.testcase;

import com.himanshu.minheap.MinHeap;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {
    MinHeap aNode;

    @Before
    public void setupMinHeapNode() throws Exception {
        aNode = new MinHeap();
    }

    @Test
    public void testAddElement() {
        aNode = new MinHeap();

        aNode.addElement("surfing");
        ArrayList<String> expectedResultList = aNode.getHeapValuesList();

        ArrayList<String> actualResultList = new ArrayList<String>();
        actualResultList.add("surfing");

        assertEquals(expectedResultList, actualResultList);
    }

    @Test
    public void testGetHeapValuesList() {
        MinHeap aNode = new MinHeap();
        aNode.addElement("ing");
        aNode.addElement("singing");
        aNode.addElement("asking");
        aNode.addElement("class");
        aNode.addElement("cooking");
        aNode.addElement("chair");
        aNode.addElement("table");
        aNode.addElement("dressing");

        ArrayList<String> expectedResultList = aNode.getHeapValuesList();

        ArrayList<String> actualResultList = new ArrayList<String>();
        actualResultList.add("asking");
        actualResultList.add("chair");
        actualResultList.add("singing");
        actualResultList.add("table");
        actualResultList.add("class");
        actualResultList.add("cooking");
        actualResultList.add("ing");
        actualResultList.add("dressing");

        assertEquals(expectedResultList, actualResultList);
    }

    @Test
    public void testValuesWithINGList() {
        MinHeap aNode = new MinHeap();
        aNode.addElement("ing");
        aNode.addElement("singing");
        aNode.addElement("asking");
        aNode.addElement("class");
        aNode.addElement("cooking");
        aNode.addElement("chair");
        aNode.addElement("table");
        aNode.addElement("dressing");
        ArrayList<String> expectedResultList = aNode.getValuesWithINGList();

        ArrayList<String> actualResultList = new ArrayList<String>();
        actualResultList.add("asking");
        actualResultList.add("singing");
        actualResultList.add("cooking");
        actualResultList.add("ing");
        actualResultList.add("dressing");

        assertEquals(expectedResultList, actualResultList);
    }
}
