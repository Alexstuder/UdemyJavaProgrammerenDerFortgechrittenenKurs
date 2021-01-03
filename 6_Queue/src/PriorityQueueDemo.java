import java.util.PriorityQueue;

public class PriorityQueueDemo {


    public static void main(String[] args){

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.offer("Zala");
        priorityQueue.offer("Fritz");
        priorityQueue.offer("Kurt");
        priorityQueue.offer("Alfred");
        priorityQueue.offer("Bert");

        System.out.println("Die Quere wird nach dem Alphabet sortiert und bearbeitet !");
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

    }
}
