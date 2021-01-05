public class ThreadDemo {

    public static void main(String[] args){


        System.out.println("Beispiel mit einer Vererbung !");
      MeinThreadVererbt meinThread1 = new MeinThreadVererbt();
      System.out.println("Name des Threads: "+meinThread1.getName()+"! und Status Vor Start des Threads : " + meinThread1.getState());
      meinThread1.start();
      System.out.println("Name des Threads: "+meinThread1.getName()+"! und Status NAch Start des Threads : " + meinThread1.getState());


      MeinThreadVererbt meinThread2 = new MeinThreadVererbt();
      meinThread2.start();
      meinThread2.setName("MeinThread Nr.2");

        System.out.println(meinThread1.getName());
        System.out.println(meinThread2.getName());
        System.out.println("Ich bins der Thread unterbrecher");



        System.out.println("Beispiel mit einer Interface Implementierung !");
        MeinThreadInterface meinThreadInterface1 = new MeinThreadInterface();
        MeinThreadInterface meinThreadInterface2 = new MeinThreadInterface();
        Thread thread1 = new Thread(meinThreadInterface1,"Der Name des Threads : Thread 1");
        Thread thread2 = new Thread(meinThreadInterface2,"Der Name des Threads : Thread 2");

        thread1.start();
        thread2.start();

        System.out.println(thread1.getName());



      System.out.println("Name des Threads: "+meinThread1.getName()+"! und Status Am Schluss des Main Programmes des Threads : " + meinThread1.getState());
    }
}
