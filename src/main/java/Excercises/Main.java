package Excercises;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, SDA");

        LinkedList list = new LinkedList();

        list.add(6);
        list.add(2);
        list.add(4);
        int elem;
        elem=list.get(1);
        System.out.println("element: " +elem );
        list.remove(2);
        list.print();
        list.reverse();
        list.print();
        System.out.println("Length of Linked List using iteration: "+list.lengthOfLinkedList());
    }

}
