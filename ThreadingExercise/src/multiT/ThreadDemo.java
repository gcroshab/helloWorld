package multiT;


public class ThreadDemo {

    public static void main(String args[]) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("HI soakshya.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {

            for (int j = 0; j <= 5; j++) {
                System.out.println("Hello Soakshya");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }

        }, "Hello Thread");
        t1.start();
        t2.start();
        // obj1.start();
        // obj2.start();
        //obj1.run();
        //obj2.run();
        //t1.setName("Hi Thread");
        //t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t2.isAlive());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t1.isAlive());
        System.out.println("bye bi bi");

    }
}
