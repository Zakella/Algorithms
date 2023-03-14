package org.example.structures;

import javax.sound.midi.Soundbank;

public class DoubleLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    Integer amount;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.amount = 0;
    }


    public void addFirst(T value) {
        if (listIsEmpty()) {
            setFirstInChain(value);

        } else {
            Node <T> newNode = new Node<>();
            newNode.setValue(value);
            Node <T> nextNode;
            if (head.hasNext()){
                nextNode  = head.getNext();
            }else nextNode = tail;

            nextNode.setPrev(newNode);
            newNode.setNext(nextNode);
            newNode.setPrev(head);
            head.setNext(newNode);
//            newNode.setPrev(newNode);

            this.amount++;
        }

    }

    private void setFirstInChain(T value){
        Node<T> node = new Node<>();
        this.head = createNode(null, node, null);
        this.tail = createNode(null, null, node);
        node.setPrev(this.head);
        node.setNext(this.tail);
        node.setValue(value);
        this.amount++;
    }

    public void addLast(T value) {
        if (listIsEmpty()) {
            setFirstInChain(value);
        } else {

            Node <T> newNode = new Node<>();
            newNode.setValue(value);
            newNode.setNext(tail);
            newNode.setPrev(tail.getPrev());
            Node <T> prevNode;
            if (tail.hasPrev()){
                prevNode = tail.getPrev();
            }else prevNode = this.head;

            prevNode.setNext(newNode);
            tail.setPrev(newNode);
            this.amount++;

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


    public Node<T> getFirst() {
        return head;
    }

    public Node<T> getLast() {
        return tail;
    }

    public Integer getAmount() {
        return amount;
    }

    public void reverse() {

        if (listIsEmpty()) {
            return;
        }

        Node<T> currentNode = head;
        while (currentNode != null) {
            Node<T> temp = currentNode.getNext();
            currentNode.setNext(currentNode.getPrev());
            currentNode.setPrev(temp);
            currentNode = temp;
        }

        Node<T> temp = head;
        head = tail;
        tail = temp;

    }

    public void putInOrder() {
        if (head == null) return;

        if (head.hasNext()){
            Node<T> node = head.getNext();
            while (node.hasNext()){
                System.out.println(node);
                node = node.getNext();
            }

        }

    }


}
