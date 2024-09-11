package t07;

public class Clock {
    private static Clock instance;
    int time = 0;
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
    public  int getTime() {
        return  this.time;
    }

}
