class MyTask implements Runnable {
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();

        System.out.println("Hello world!");
//        System.out.println("kjfffgitf");
    }
}