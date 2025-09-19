package me.vinay.tns.threads.intercommunication;

public class Main {

        public static void main(String[] args) {
            SharedResource resource = new SharedResource();
            Producer producer = new Producer(resource);
            Consumer consumer = new Consumer(resource);

            producer.start();
            consumer.start();
        }
    }

