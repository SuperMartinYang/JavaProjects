package com.list;//class Node {
//    Node next = null;
//    int val;
//    public Node(int val){
//        this.val = val;
//    }
//}

public class Loop_Detection{
    public Node findLoopNode(Node head){
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        Node meet = slow;
        fast = head;
        while (fast != meet){
            fast = fast.next;
            meet = meet.next;
        }
        return fast;
    }
}