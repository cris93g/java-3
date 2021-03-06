package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    List nums = new ArrayList<>();
    Sync(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();
        int i=0;
        while(i<100){
            int randInt = rand.nextInt(100);
            this.nums.add(randInt);
            i++;
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Sync syncThread = new Sync("sync thread");
        syncThread.start();
        syncThread.join();
        System.out.println(syncThread.nums);
        //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up  here.  There is a brute force way and a more sophisticated way.  Either or will work, but strive for sophistication :)

    }

}