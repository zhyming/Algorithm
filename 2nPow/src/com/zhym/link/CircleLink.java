package com.zhym.link;

/**
 * @description:
 * @author: zhym
 * @time: 2021/1/18 0018 19:39
 */
public class CircleLink {

    private Node head;

    private Node last;

    private int size = 0;

    public Node addHead(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            last = newNode;
        }else {
            newNode.next = head;
            last.next = newNode;
        }
        head = newNode;
        size ++;

        return newNode;
    }

    public void yusf(int num) {
        Node cur = head;
        while (size != 1) {
            for (int i = 1; i < num - 1; i ++) {
                cur = cur.next;
            }
            if (head == cur.next) {
                head = head.next;
            }

            cur.next = cur.next.next;
            cur = cur.next;
            size --;
            itrator();

        }
    }

    public void itrator() {
        Node cur = head;
        for (int i = 0; i < size; i ++) {
            System.out.println(cur.value);
            cur = cur.next;
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        CircleLink link = new CircleLink();
        link.addHead(6);
        link.addHead(5);
        link.addHead(4);
        link.addHead(3);
        link.addHead(2);
        link.addHead(1);
        link.itrator();
        link.yusf(5);
    }


}

class Node {

    public int value;

    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
