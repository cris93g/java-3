package concurrency;

class Reasoning extends Thread {
    // set up this class so it can become a valid thread.
    void distinguish() {
        System.out.println("A process can have multiple threads. A thread is sometimes called a lightweight process");
        System.out.println("Thread.start creates a new thread while run is executing on the calling thread");
    }

    @Override
    public void run() {
        this.distinguish();
    }

}
