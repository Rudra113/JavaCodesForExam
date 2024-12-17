class SharedResource {
    private int item;
    private boolean isProduced = false;

    // Produce an item
    public synchronized void produce(int value) throws InterruptedException {
        while (isProduced) {
            wait(); // Wait if an item has already been produced
        }
        item = value;
        System.out.println("Produced: " + item);
        isProduced = true;
        notify(); // Notify the consumer
    }

    // Consume an item
    public synchronized void consume() throws InterruptedException {
        while (!isProduced) {
            wait(); // Wait if no item is produced
        }
        System.out.println("Consumed: " + item);
        isProduced = false;
        notify(); // Notify the producer
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                resource.produce(i); // Produce items 1 to 5
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                resource.consume(); // Consume items
                Thread.sleep(5000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
