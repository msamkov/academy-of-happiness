package ru.multicon.academyofhappiness;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

@SpringBootTest
class AcademyOfHappinessApplicationTests {

    @Test
    void testArrayList() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
    }

    @Test
    void testQueue() {
        Queue<String> queueA = new LinkedList<>();

        System.out.println("queueA = " + queueA);

        queueA.add("Hello");
        queueA.add("Lip");

        System.out.println("queueA = " + queueA);


        System.out.println("queueA.element() = " + queueA.element());

        System.out.println("queueA = " + queueA);

        System.out.println("queueA.remove() = " + queueA.remove());

        System.out.println("queueA = " + queueA);


    }

    @Test
    void testStack() {

        Stack<String> stringStack = new Stack<>();

        System.out.println("stringStack = " + stringStack);

        stringStack.push("Hello");
        stringStack.push("Lip");

        System.out.println("stringStack = " + stringStack);


        System.out.println("stringStack.peek() = " + stringStack.peek());

        System.out.println("stringStack = " + stringStack);

        System.out.println("stringStack.pop() = " + stringStack.pop());

        System.out.println("stringStack = " + stringStack);
    }


    @Test
    void testSet() {
        Set<String> setA = new HashSet<>();
        System.out.println("setA = " + setA);
        setA.add("Hello");
        setA.add("Hello2");
        setA.add("Lip");
        setA.add("Hello");
        System.out.println("setA = " + setA);
    }
}




