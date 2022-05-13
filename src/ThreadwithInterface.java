
class Thread1 implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<30;i++){
        System.out.println("Thread1 Running");
        System.out.println("Running ");
     }
    }

}

class Thread2 implements Runnable{

    @Override
    public void run(){

        for(int i=0;i<30;i++){
        System.out.println("Thread2 is running");
        System.out.println("Calling someone");
     }
    }
}

public class ThreadwithInterface {

    public static void main(String[]args){

        Thread1 t1 = new Thread1();

        Thread gun = new Thread(t1);

        Thread2 t2 = new Thread2();

        Thread gunner = new Thread(t2);



        gun.start();
        gunner.start();



    }
}
