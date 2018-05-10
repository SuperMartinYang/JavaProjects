package com.list;//class Node {
//    Node next = null;
//    int val;
//    public Node(int val){
//        this.val = val;
//    }
//}

public class Partition{
//    public Node partition1(Node head, int pivot){
//        // partition list: left is less than pivot, right is greater or equal
//    }
    public Node partition2(Node head, int pivot){
        // addition to partition1, the elements partitioned should be in original order
        if (head == null)
            return null;
        Node greaterHead = new Node(0);
        Node lessHead = new Node(0);
        Node cur = head;
        Node curG = greaterHead;
        Node curL = lessHead;
        while (cur != null){
            if (cur.val >= pivot){
                curG.next = cur;
                curG = curG.next;
            }else {
                curL.next = cur;
                curL = curL.next;
            }
        }
        curL.next = greaterHead.next;
        return lessHead.next;
    }
}