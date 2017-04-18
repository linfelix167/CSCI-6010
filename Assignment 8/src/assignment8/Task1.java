package assignment8;

public class Task1 extends Thread{

    // The number we want to test
    private long num;

    public Task1(long num){


        this.num = num;
    }

    @Override
    public void run(){

        for(long i = 2; i <= num; i++){
            while(num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Task1(51));
        Thread t2 = new Thread(new Task1(247));


        t1.start();
        System.out.print("Thread 1: ");
        t1.sleep(100);
        System.out.println("\nThread 1 sleep...");
        System.out.print("Thread 2: ");
        t2.start();
        t2.sleep(100);
        System.out.println("\nThread 2 sleep...");

    }

}
