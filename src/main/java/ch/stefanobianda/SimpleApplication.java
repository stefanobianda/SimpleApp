package ch.stefanobianda;

import java.util.concurrent.TimeUnit;

public class SimpleApplication {

    private static SimpleForm simpleForm1;
    private static SimpleForm simpleForm2;
    private static SimpleForm simpleForm3;
    private static int count = 0;
    private static final int version = 1;

    public static void main(String[] args) {
        System.out.println("Start SimpleApplication");
        simpleForm1 = new SimpleForm();
        simpleForm1.setVersion(version);
        run();
    }

    private static void run() {
        while (true)
        {
            try {
                TimeUnit.SECONDS.sleep(1);
                count++;
                System.out.println(count);
                simpleForm1.updateCount(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
