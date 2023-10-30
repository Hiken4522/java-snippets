class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this,"demo thread");
        System.out.println("Child thread: "+t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 5; i>0;i--){
                System.out.println("child thread: "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("child interruptred");
        }
        System.out.println("exiting child thread");
    }
}

public class App1{
    public static void main(String[] args){
        new NewThread();
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("main thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("exiting main thread");
    }
}
