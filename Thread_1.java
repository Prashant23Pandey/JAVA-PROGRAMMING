class ABC extends Thread {
    public void run() {
        int n = 5; 
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
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
    }
} 