public class MeinThreadInterface implements Runnable{



    @Override
    public void run() {

        for (int i = 0; i < 3 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread " + Thread.currentThread().getName() + " ist beendet !");
    }
}
