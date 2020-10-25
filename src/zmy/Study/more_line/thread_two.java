package zmy.Study.more_line;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class thread_two extends Thread {
    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        //int len = 0;
        FileInputStream ios = null;
        try {
            ios = new FileInputStream(new File("d:/我爱LOL.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            //if ((len = ios.read(bytes,0,18)) != -1) {
            ios.read(bytes, 0, 18);
            System.out.println("线程A：");
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
            //}
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ios != null) {
                try {
                    ios.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
