package queueInterface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10);

        queue.offer("Tonni");
        queue.offer("Ramdani");
        queue.offer("Abdul");
        queue.offer("Mubdee");

        for(String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());


    }
}
