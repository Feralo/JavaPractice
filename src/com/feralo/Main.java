package com.feralo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test drive of the integer-based linked list");

        IntNode node = new IntNode(12, null);
        node.addNodeAfter(155);
        System.out.println(IntNode.listLength(node));

        System.out.println("Fizz-Buzz test");
        System.out.println(IntNode.listLength(node));
        for (int i = 1; i <= 20; i++){
            if (i % (3*5) == 0)  System.out.println("FizzBuzz");
            else if (i % 5 == 0)  System.out.println("Buzz");
            else if (i % 3 == 0)  System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
