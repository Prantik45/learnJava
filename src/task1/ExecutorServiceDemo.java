package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Temp implements Callable<String> {
    int x;
    Temp(int num) {
        this.x = num;
    }

    public String call() throws Exception {
        return "Hi "+x;
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {

        ExecutorService tasks = Executors.newFixedThreadPool(10);
        List<Temp> callables = new ArrayList<>();

        for(int i=0; i<5; i++) {
            callables.add(new Temp(i+1));
        }

        try {
            List<Future<String>> futures = tasks.invokeAll(callables);

            for (Future<String> future : futures) {
                String result = future.get();
                System.out.println("Returned output: " + result);
            }
        } catch (Exception e) {
            System.out.println("Exception Caught!");
        }
        tasks.shutdown();
    }
}
