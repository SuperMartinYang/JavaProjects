package com.linkedList;

public class App {
    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        // link noes
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listingLength(nodeA));

    }
    public static int listingLength(Node aNode){
        int length = 0;
        Node currentNode = aNode;
        while (currentNode != null){
            length ++;
            currentNode = currentNode.next;
        }
        return length;
    }
}
