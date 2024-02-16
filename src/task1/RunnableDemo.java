package task1;

class Hii implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Hi");
            try { Thread.sleep(500); } catch(Exception ignored) {}
        }
    }
}

class Helloo implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println("Hello");
            try { Thread.sleep(500); } catch(Exception ignored) {}
        }
    }

}

public class RunnableDemo {
    public static void main(String[] args) {
        /* Hii obj1 = new Hii();
        Helloo obj2 = new Helloo(); */
        Runnable obj1 = new Hii();
        Runnable obj2 = new Helloo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try { Thread.sleep(10); } catch(Exception ignored) {}
        t2.start();

    }
}

