package com.queue;

public class App {
    public static void main(String args[]) throws Exception {
        Queue q = new Queue(3);
        q.insert(100);
        q.insert(80);
        q.insert(60);
        q.insert(40);
        q.insert(20);
        q.view();
    }
}
