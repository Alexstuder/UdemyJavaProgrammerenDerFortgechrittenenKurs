import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args){

        Queue<String> iceQueue = new LinkedList<String>();

        iceQueue.offer("Hendrik");
        iceQueue.offer("Janik");
        iceQueue.offer("Susanne");
        iceQueue.offer("Karl");


        while (!iceQueue.isEmpty()){
            System.out.println(iceQueue.poll());
        }

        // iceQueue.peek() greift zu ohne zu entfernen

    }
}
