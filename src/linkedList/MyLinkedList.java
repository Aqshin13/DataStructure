package linkedList;

public class MyLinkedList<T> {

    private Node<T> first = null;

    private Node<T> last = null;

    public void addFirst(T t) {

        Node<T> node = new Node<>();
        node.e = t;
        node.next = null;
        if (first == null) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }

    }

    public void deleteFirst() {
        if (first == null) {
            System.out.println("There isn't data");
        } else {
            first = first.next;
        }
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("There isn't data");
        } else {
            Node temp = first;
            Node temp2 = first;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;

            }
            temp2.next = null;
            last = null;

        }

    }

    public void addLast(T t) {
        Node<T> node = new Node<>();
        node.e = t;
        node.next = null;
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }

    }

    public void add(T t) {
        Node<T> node = new Node<>();
        node.e = t;
        node.next = null;
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addInBetween(T t, int index) {

        Node<T> node = new Node<>();
        node.e = t;
        node.next = null;
        if (first == null && index == 0) {
            first = node;
            last = node;
        } else if (first != null && index == 0) {
            node.next = first;
            first=node;
        } else {

            Node temp = first;
            Node temp2 = first;
            int i = 0;
            while (temp != null) {
                i++;
                temp2 = temp;
                temp = temp.next;

            }
            if (i == index) {
                temp2.next = node;
                last = node;
            } else {
                temp = first;
                temp2 = first;

                for (int k = 0; k != index; k++) {
                    temp2 = temp;
                    temp = temp.next;
                }

                temp2.next = node;
                node.next = temp;

            }

        }

    }

    public void print() {

        if (first == null) {
            System.out.println("There isn't data");
        } else {
            Node temp = first;
            while (temp != null) {
                System.out.println(temp.e);
                temp = temp.next;
            }
        }
    }

    private class Node<E> {

        E e;

        Node next;

    }
}
