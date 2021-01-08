package tools;

import java.io.*;

public class TestTools {
    /**
     * Checks if File exists
     * If exists returns true
     * If doesn't waits 10 times {@code maxWaitTime}/10 milliseconds
     * On each time checks if File exists
     *
     * @param maxWaitTime int milliseconds to wait if file does not exist
     * @param path        String File path
     * @return true if file exists, false after {@code maxWaitTime} milliseconds if file doesn't exist
     * @throws InterruptedException exception
     */
    public static boolean waitForFile(String path, int maxWaitTime) throws InterruptedException {
        int counter = 10;
        int dividedWaitTime = maxWaitTime / counter;

        for (int i = 0; i < counter; i++) {
            if (new File(path).exists()) {
                return true;
            } else {
                Thread.sleep(dividedWaitTime);
            }
        }
        return false;
    }

    /**
     * @param path String File path
     * @return true if removing was successful else false
     */
    public static boolean deleteFile(String path) {
        return (new File(path)).delete();
    }
}
