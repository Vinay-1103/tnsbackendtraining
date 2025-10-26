package me.vinay.tns.threads.intercommunication;

public class Consumer extends  Thread{
    public void start() {
    }

        private SharedResource resource;

        Consumer(SharedResource resource) {
            this.resource = resource;
        }
    

        public void run() {
            for (int i = 1; i <= 5; i++) { // Consuming 5 items
                resource.consumer();
//            try {
//                Thread.sleep(800); // Simulate time to consume
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            }
        }
    }

