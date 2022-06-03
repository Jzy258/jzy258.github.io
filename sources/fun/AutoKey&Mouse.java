import java.awt.*;
import java.awt.event.KeyEvent;

class RobotDemo {

    private Robot robot = null;

    public RobotDemo() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void keyBoardDemo() {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Interval:");
        int n = s.nextInt();
        while(true){
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);

            robot.delay(n);
        }
    }

    public void mouseDemo() {
        robot.mouseMove(200, 200);

        robot.mousePress(KeyEvent.BUTTON1_MASK);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        robot.mouseRelease(KeyEvent.BUTTON1_MASK);
    }

    public void delay(int milliseconds) {
        robot.delay(milliseconds);
    }

    public static void main(String[] args) {
        RobotDemo demo = new RobotDemo();
        //demo.mouseDemo();
        demo.keyBoardDemo();
    }
}