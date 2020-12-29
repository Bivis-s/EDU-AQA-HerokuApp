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
    private static boolean waitForFile(String path, int maxWaitTime) throws InterruptedException {
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
     * Returns String contains all File strings if File exists
     * Throws an IOException if File doesn't exist
     *
     * @param path        String File path
     * @param maxWaitTime int milliseconds to wait if file does not exist
     * @return All text content of File
     * @throws IOException          IOException
     * @throws InterruptedException InterruptedException
     */
    public static String readTextFile(String path, int maxWaitTime) throws IOException, InterruptedException {
        if (waitForFile(path, maxWaitTime)) {
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();

            // char-reading
            int c;
            while ((c = br.read()) != -1) {
                sb.append((char) c);
            }
            br.close();
            return sb.toString();
        } else {
            throw new IOException("File does not exist. Path: " + path);
        }
    }

    /**
     * @param path String File path
     * @return true if removing was successful else false
     */
    public static boolean deleteFile(String path) {
        return (new File(path)).delete();
    }
}
