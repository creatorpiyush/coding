package stack;

import java.util.Scanner;

public class SUAclient {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        stackusingArray stack = new stackusingArray(n);

        for (int i = 0; i < n; i++) {
            stack.push(s.nextInt());
        }
        System.out.println("*************");
        stack.display();
        System.out.println(stack.top());

        System.out.println("*************");

        System.out.println(stack.pop());
        System.out.println("*************");
        stack.display();
        System.out.println(stack.top());

    }

}