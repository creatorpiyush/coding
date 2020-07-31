package dynamicstack;

import stack.stackusingArray;

public class dynamicstackclient {

    public static void main(String[] args) throws Exception {

        stackusingArray stack = new dynamicstack(5);

        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
            displayStackinfo(stack);
        }

        for (int i = 6; i <= 10; i++) {
            stack.push(i * 10);
            displayStackinfo(stack);
        }
        stack.push(160);
        while (!stack.isEmpty()) {
            displayStackinfo(stack);
            stack.pop();
        }

        stack.pop();

    }

    public static void displayStackinfo(stackusingArray stack) throws Exception {
        System.out.println("***********************");
        stack.display();
        System.out.println("Top=" + stack.top());
        System.out.println("Size=" + stack.size());
        System.out.println("***********************");
    }

}