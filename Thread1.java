class Process1 extends Thread
{
    public void run(){
        for(int i=0;i<=10;++i)
         System.out.println("i= "+i);
    }
}
class Process2 extends Thread {
    public void run()
    {
        for(int j=11;j<=20;++j)
            System.out.println("j= "+j);
    }


    
}
public class Thread1 {
    public static void main(String[] args) {
        Process1 obj=new Process1();
        Process2 obj2= new Process2();
        obj.start();
        obj2.start();
    }

    
}