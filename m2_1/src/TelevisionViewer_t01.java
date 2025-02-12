//Task 1: Television class
//Implement class Television that together with TelevisionViewer
// produces the following output:


public class TelevisionViewer_t01 {
    public static void main(String[] args) {
        class Television {
            private int channel;
            private boolean isOn = false;

            public boolean isOn() {
                return isOn;

            }

            public void pressOnOff() {
                isOn = !isOn;


            }

            public void setChannel(int channel) {
                if (channel == 11) {
                    channel = 1;
                }
                this.channel = channel;

            }

            public int getChannel() {
                return channel;
            }

        }


        Television myTV = new Television();
        myTV.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!myTV.isOn())
                myTV.pressOnOff();

            while (!tired) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() + 1);
                if (myTV.getChannel() % 4 == 0)
                    tired = true;
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}




















































