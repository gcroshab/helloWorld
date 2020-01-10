package multiT;

public class ThreadExample1 extends Thread {


    public void run(){
        System.out.println("The thread is running ........");
    }


    public static void main(String... args) throws InterruptedException {
        ThreadExample1 t1 = new ThreadExample1();
        t1.wait(1000);
        t1.run();
    }
}
