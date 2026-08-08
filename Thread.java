class ABC extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        ABC t = new ABC(); 
        t.start();        
        System.out.println("Main method is running...");
    }
}