package org.example.structures;

public class DoubleLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    Integer amount = 0;


    public void addFirst(T value) {
        if (listIsEmpty()) {
            Node<T> node = createNode(value, this.head, this.tail);

            this.head = node;
            this.tail = node;
            this.amount++;

        } else {
            this.head = createNode(value, this.head.getNext(), this.head);
            this.amount++;
            setTail();

        }

    }

    public void addLast(T value){
        if (listIsEmpty()) {
            Node<T> node = createNode(value, this.head, this.tail);
            this.head = node;
            this.tail = node;
            this.amount++;

        } else {
            this.tail = createNode(value, this.head.getNext(), this.head);
            this.amount++;
            setHead();


        }
    }

    private void setHead() {
        Node<T> node = this.tail;
        while (node.hasPrev(node)) {
            this.head = node.getPrev();
        }
    }


    private Node<T> createNode(T value, Node<T> next, Node<T> prev) {
        Node<T> node = new Node<T>();
        node.setValue(value);
        node.setNext(next);
        node.setPrev(prev);
        return node;
    }

    public boolean listIsEmpty() {
        return head == null && tail == null;
    }

    private void setTail() {
        Node<T> node = this.head;
        while (node.hasNext(node)) {
            this.tail = node;
        }
    }


    public Node<T> getFirst() {
        return head;
    }

    public Node<T> getLast() {
        return tail;
    }

    public Integer getAmount() {
        return amount;
    }
}
