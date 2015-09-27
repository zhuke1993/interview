package concurrence;

/**
 * Created by ZHUKE on 2015/9/26.
 */
public class MainThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(new LiftOff());
            th.start();
        }
    }
}
