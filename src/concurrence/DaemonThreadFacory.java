package concurrence;

import java.util.concurrent.ThreadFactory;

/**
 * Created by ZHUKE on 2015/9/26.
 */
public class DaemonThreadFacory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
