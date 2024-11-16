package com.demo.dsa.linkedlist;

import com.demo.dsa.SingleNode;

public class RunLinkedList {

    private static SingleNode<String> createLinkedList() {
        SingleNode<String> tail = new SingleNode<String>(null, "Tail");
        SingleNode<String> mm = new SingleNode<String>(tail, "Middle");
        SingleNode<String> header = new SingleNode<String>(mm, "HEAD");
        return header;
    }

    public static void main(String[] args) {
        SingleNode<String> p = createLinkedList();
        p.echo();
        SingleNode<String> m = p.findT("Middle");
        SingleNode<String> stu = new SingleNode<String>(null, "Student");
        p.insertAfter(m, stu);
        p.echo();
        System.err.println("----");
        p.reserve().echo();;
    }
}
