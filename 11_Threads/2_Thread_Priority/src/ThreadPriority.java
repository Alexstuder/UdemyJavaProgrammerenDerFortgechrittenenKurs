public class ThreadPriority {

    public static void main(String[] args){



        MeinThreadInterface meinThreadInterface1 = new MeinThreadInterface();
        MeinThreadInterface meinThreadInterface2 = new MeinThreadInterface();
        Thread thread1 = new Thread(meinThreadInterface1,"Thread_PriorityDemo 1");
        Thread thread2 = new Thread(meinThreadInterface2,"Thread_PriorityDemo 2");

        thread1.start();
        thread2.setPriority(10);
        thread1.setPriority(1);
        thread2.start();


      System.out.println("Main Thread beendet");


    }
}
