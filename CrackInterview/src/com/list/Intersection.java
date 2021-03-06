package com.list;//class Node {
//    Node next = null;
//    int val;
//    public Node(int val){
//        this.val = val;
//    }
//}

public class Intersection{
    public Node findIntersectNode(Node head1, Node head2){
        // 1st: brute-force, for each node in head1 test whether it's exactly the same as nodes in head2
        // 2nd: convert this problem to find loopNode, the tail of head1 point to the head of head2
        Node cur1 = head1;
        while (cur1.next != null)
            cur1 = cur1.next;
        cur1.next = head2;
        Loop_Detection ld = new Loop_Detection();
        return ld.findLoopNode(head1);
    }
}