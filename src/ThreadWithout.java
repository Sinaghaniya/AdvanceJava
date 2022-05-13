
//This is an example of printing the functions without thread
//As you can see The functions are printing are the Successfully implementation
// of the first Function/Method this means it is not running concurrently
//like in Thread class

class Threadx{

    void run(){
        System.out.println("Parent class");
    }
}

class mona extends Threadx{

    @Override
    public void run(){



        for(int i=0;i<40;i++){
        System.out.println("Thread 1 running");
        System.out.println("I am happy");

      }
    }
}

class mona2 extends Threadx{

    @Override
    public void run(){



        for(int i =0;i<40;i++) {
            System.out.println("Thread 2 running");
            System.out.println("I am so sad");
        }
    }
}

public class ThreadWithout {

    public static void main(String[]args){

        mona t = new mona();

        mona2 t2 = new mona2();

        t.run();
        t2.run();

    }
}
