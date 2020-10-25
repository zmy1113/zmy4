package zmy.Study.more_line;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class thread_one extends Thread {
    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        int len = 0;
        FileInputStream ios = null;
        try {
            ios = new FileInputStream(new File("d:/我爱LOL.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {

            if ((len = ios.read(bytes, 18, 18)) != -1) {
                System.out.println("线程B：");

                ios.read(bytes, 18, 18);
                System.out.println(new String(bytes, StandardCharsets.UTF_8));
            }
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
