
public class PingPong extends Thread {
    private String saying;
    private int interval;
    public PingPong(String saying, int interval) {
        this.saying = saying;
        this.interval = interval;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(saying);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        PingPong pong = new PingPong("Ping", 1000);
        PingPong ping = new PingPong("    Pong", 500);
        PingPong tsing = new PingPong("   ----Tsing", 2000);
        pong.start();
        ping.start();
        tsing.start();
    }
}
