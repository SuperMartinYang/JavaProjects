package com.list;//class Node {
//    Node next = null;
//    int val;
//    public Node(int val){
//        this.val = val;
//    }
//}

public class Palindrome{
    public boolean palin(Node head){
        Node revHead = reverseList(head);
        return equalList(head, revHead);
    }
    private boolean equalList(Node head1, Node head2){
        Node cur1 = head1, cur2 = head2;
        while (cur1 != null){
            if (cur1.val == cur2.val){
                cur1 = cur1.next;
                cur2 = cur2.next;
            }else
                return false;
        }
        return cur2 == null;
    }
    private Node reverseList(Node head){
        Node pre = null;
        Node next;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}