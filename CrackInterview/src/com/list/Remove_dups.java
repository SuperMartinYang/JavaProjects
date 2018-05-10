package com.list;

import java.util.HashMap;



public class Remove_dups{
    public Node removeDups(Node head){
        // 1st: use hashmap (temporary buffer) --> O(N)
        // 2nd: brute-force, get one, search dups before, no, remain it --> O(N^2)
        // 3rd:
        if (head == null)
            return null;
        HashMap<Integer, Boolean> map = new HashMap<>();
        // Put list into Map, skip node which is already existed in hashmap
        Node cur = head.next;
        Node res = head;
        while (cur != null){
            if (map.containsKey(cur.val))
                cur = cur.next;
            else {
                map.put(cur.val, true);
                res.next = cur;
                cur = cur.next;
                res = res.next;
            }
        }
        return head;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        (new Remove_dups()).removeDups(head);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}