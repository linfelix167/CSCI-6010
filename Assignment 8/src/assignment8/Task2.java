package assignment8;

import java.math.*;
import java.util.*;

public class Task2 extends Thread{

    BigInteger n;

    public Task2(BigInteger n){

        this.n = n;
    }

    public static ArrayList<Long> factorize(long n){

        ArrayList prime = new ArrayList<Long>();

        long factor = 0L;

        for(long i = 2L; i <= n/i; ){
            if(n % i == 0){
                factor = i;
                prime.add(factor);
                n /= i;
            }else{
                i++;
            }
        }

        if(factor < n){
            prime.add(n);
        }else{
            prime.add(factor);
        }

        return prime;
    }

    @Override
    public void run(){

        System.out.println(Task2.factorize(n.longValue()));
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Task2(new BigInteger("41202343698665954385553136533257594817981169984432798284545562643387644556"
                +"52484261980988704231618418792614202471888694925609317763750334211309823974"
                +"85150944909106910269861031862704114880866970564902903653658867433731720813"
                +"104105190864254793282601391257624033946373269391")));

        t1.start();
        t1.sleep(100);

        Thread t2 = new Thread(new Task2(new BigInteger("51")));
        t2.start();

        Thread t3 = new Thread(new Task2(new BigInteger("247")));
        t3.start();

    }

}
