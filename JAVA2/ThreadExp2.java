class SharedResource {
    synchronized void print(){
        for(int i=0; i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try{Thread.sleep(500);}catch(InterruptedException e){}
        }
    }
}

public class ThreadExp2 {
    public static void main(String[] args) {
        SharedResource res=new SharedResource();
        Thread t1=new Thread(res::print,"Thread1");
        Thread t2=new Thread(res::print,"Thread2");
        t1.start();
        t2.start();
    }
}