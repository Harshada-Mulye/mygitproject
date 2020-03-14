package Testing;

import Excercises.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    @Test

    public void testAddSingleElement() {
        LinkedList list = new LinkedList();
        list.add(5);
        int result = list.get(0);
        assertEquals(5, result);
    }

    @Test
    public void testAddTwoElements() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        int result = list.get(0);
        assertEquals(5, result);
    }

    @Test
    public void testAddTwoElementsAndGetSecond() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(2);
        int result = list.get(1);
        assertEquals(2, result);
    }

    @Test
    public void testAddSingleElementAndGetSecond() {
        LinkedList list = new LinkedList();
        list.add(5);
        boolean success = false;
        try {
            int result = list.get(1);
        } catch (IndexOutOfBoundsException e) {
            success = true;
        }
        assertEquals(true, success);
    }

    @Test
    public void testGetWithNegativeIndex () {
        LinkedList list = new LinkedList();
        list.add(5);
        boolean success = false;
        try {
            int result = list.get(-1);
        } catch (IndexOutOfBoundsException e) {
            success = true;
        }
        assertEquals(true, success);
    }
    @Test
    public void testRemoveWithIndex() {
        LinkedList list = new LinkedList();
        boolean success=true;
        list.add(1);
        list.add(2);
        list.add(13);



        list.remove(2);

        int length = list.lengthOfLinkedList();
        assertEquals(2,length);

    }
    @Test
    public void TestSizeWithEmptyList()
    {
        LinkedList list=new LinkedList();
        list.add(2);
        int result=list.lengthOfLinkedList();
        assertEquals(1,result);

    }
}

