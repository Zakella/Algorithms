package org.example.structures;

class Node<T> {

    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node() {
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public boolean hasNext() {
        return this.next != null;

    }

    public Node<T> nextNode() {
        if (this.hasNext()) {
            return this.getNext();

        }
        return null;

    }

    public boolean hasPrev(Node<T> node) {
        return node.getPrev() != null;

    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}