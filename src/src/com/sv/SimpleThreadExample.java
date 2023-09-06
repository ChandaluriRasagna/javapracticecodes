package com.sv;
    public class SimpleThreadExample extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // pause for 500ms
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
        public static void main(String[] args) {
            SimpleThreadExample thread1 = new SimpleThreadExample();
            SimpleThreadExample thread2 = new SimpleThreadExample();

            // Start the threads
            thread1.start();
            thread2.start();

            System.out.println("Main thread finished!");
        }
    }