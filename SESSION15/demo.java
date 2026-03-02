package SESSION15;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class demo {
    public static void main(String[] args) {
//        int b = 100;
//        System.out.println("Ket thuc");
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println("Phan tu o dinh stack: " + stack.pop());
//        System.out.println("lay phan tu tren cung nhung ko xoa no: " + stack.peek());
//
//        while(!stack.isEmpty()) {
//            Integer top = stack.pop();
//            System.out.println("top: " + top);
//        }
//
        Queue<String> queue = new ArrayDeque<>();
        queue.add("apple");// them
        queue.offer("banana");// them

        queue.remove("apple");// xoa
        queue.poll();// xoa phan tu dau tien
        queue.peek();// lay phan tu dau tien nhung ko xoa no
        queue.element();// lay phan tu dau tien nhung ko xoa no, neu queue rong se nem ra ngoai le
    }


}
