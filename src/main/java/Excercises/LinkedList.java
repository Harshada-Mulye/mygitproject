package Excercises;

// This class is used for each "box".
class Node {
    int elem;
    Node next;
    // so we can do new Node(5, null) etc.
    Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
}

public class LinkedList {
    private Node first = null;
    private Node last = null;

    /**
     * Adds an integer element to the end of the
     * linked list.
     *
     * @param elem The element to add.
     */
    public void add(int elem) {
        // 1. case: list is empty
        if (first == null) {
            first = new Node(elem, null);
            last = first;
        } else { // 2. case: list is non-empty
            // at least one node already exists!
            // this means, the `first` field is not null.

            Node nodeForElem = new Node(elem, null);
            // node that used to be last needs to be
            // connected to our new node!

            last.next = nodeForElem;
            last = nodeForElem;
        }
    }

    // get method
    public int get(int index) {
        // 1. case: index == 0
        if (index == 0) {
            return first.elem;
        } else { // 2. case: index > 0
            // not yet implemented

            // what we have:
            // field `first` referring to the first Node object
            // `first.next`
            int counter = 0;
            Node tmp;
            tmp=first;
            while (counter < index && tmp.next != null) {
                tmp = tmp.next;
                counter++;
            }
            // what we know: either counter < index is false
            // or tmp.next == null (Alarm bell!)
            if (counter == index) {
                return tmp.elem;
            } else {
                // list is too short!
                throw new IndexOutOfBoundsException();
            }

            /* NullPointerExceptions always occur:
             * (1) null.field
             * (2) null.method(arg1, arg2)
             */
        }
    }


    public int lengthOfLinkedList() {
        Node temp = first;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public void remove(int index) {
        if (index == 0) {
            // removing the first element must be handled specially
            first = first.next;
        } else {
            // removing some element further down in the list;
            // traverse to the node before the one we want to remove
            Node current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            // change its next pointer to skip past the offending node
            current.next = current.next.next;
        }
    }
    public void reverse() {
        Node pointer = first;
        Node previous = null, current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next; // reverse the link current.next = previous; previous = current; head = current; }
            current.next = previous;
            previous = current;
            first = current;
        }
    }
    public void print() {
        Node node = first;
        while (node != null) {
            System.out.print(node.elem + " ");
            node = node.next;
        }
        System.out.println("");
    }

}



