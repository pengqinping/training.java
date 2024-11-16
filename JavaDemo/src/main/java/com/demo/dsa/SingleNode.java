package com.demo.dsa;

public class SingleNode<T> {
    public SingleNode<T> next;
    public T data;

    public SingleNode(SingleNode<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    // 输出 当前节点为 Head 的 链表。
    public void echo() {
        SingleNode<T> p = this;
        while (p != null) {
            System.err.println("node.data = " + p.data);
            p = p.next;    
        }
    }

    public SingleNode<T> findT(T data) {
        SingleNode<T> p = this;
        while(p != null) {
            if (data.equals(p.data)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    // 在当前节点后面插入，
    public void insertAfter(SingleNode<T> who, SingleNode<T> node) {
        SingleNode<T> p = this;
        while(p != null) {
            if (p == who) {
                // 插入在后面
                node.next = p.next;
                p.next = node;
                return ;
            }
            p = p.next;
        }
    }

    //  没有前驱节点， 无法往前找. 链表反转？是否可以实现
    public void insertBefore(SingleNode<T> who, SingleNode<T> node) throws Exception {
        SingleNode<T> p = this;
        SingleNode<T> q = this.next;
        while(q.next != null) {
            p.next = q.next;
            q.next = p;
            q = p.next;
        }
        q.echo();

    }

    public SingleNode<T> reserve() {
        SingleNode<T> tail = this;
        SingleNode<T> head = tail;
        while(tail.next != null) {
            head = tail.next;
            tail.next = tail.next.next;
            head.next = tail;
        }
        head.echo();
        return head;
    }
}
