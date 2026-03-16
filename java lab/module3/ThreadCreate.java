public class ThreadCreate extends Thread {
        public void run(){
            System.out.println("Your thread.....");
        }
    public static void main(String[] args) {
        ThreadCreate t=new ThreadCreate();
        t.start();
    }
    
}
