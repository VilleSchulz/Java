package t06;

public class Clock {
    private static Clock instance;
    double time = System.nanoTime();
    private Clock() {


    }
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }
    public void setTime(int time) {
        this.time = time;

    }
    public  double getTime() {
        return  this.time;
    }

}
