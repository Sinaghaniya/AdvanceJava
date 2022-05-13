//Threads are small process which are done within the program running
//Threads switch between functions and work concurrently
//it can be invoke by extending Thread class or by
// implementing runnable interface
//This program is based on Extending Thread class

class MyThread extends Thread {
    @Override
    public void run(){

        int i =0;
        while(i<400){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{

    @Override
    public void run(){

        int i=0;

        while(i<400) {
            System.out.println("Chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class thread {

    public static void main(String[]args){

        MyThread t1 = new MyThread();

        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


    }
}
