package net.argvarg;

/**
 * Created by fredrik on 11/11/14.
 */
public class LogHelper {
    private int debugLevel;
    LogHelper(int debugLevel) {
        this.debugLevel = debugLevel;
    }

    public void putLog(String message, int level) {
        if (level <= debugLevel) {
            System.out.println(message);
        }
    }
}
