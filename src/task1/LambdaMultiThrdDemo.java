package task1;

public class LambdaMultiThrdDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Hi");
                try { Thread.sleep(500); } catch(Exception ignored) {}
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=5; i++) {
                System.out.println("Hello");
                try { Thread.sleep(500); } catch(Exception ignored) {}
            }
        });

        t1.start();
        try { Thread.sleep(10); } catch(Exception ignored) {}
        t2.start();

    }
}


