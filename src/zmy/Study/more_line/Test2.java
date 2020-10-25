package zmy.Study.more_line;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("d:/我爱LOL.txt"));
            try {
                String s = "辨识度部分嘎嘎嘎嘎嘎嘎嘎";
                fileOutputStream.write(s.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            thread_two t1 = new thread_two();
            thread_one t2 = new thread_one();
            t1.start();
            t2.start();
            //DataInputStream p=new DataInputStream(new BufferedInputStream(System.in));
            try {
                System.setOut(new PrintStream(new File("d:/我爱LOL1.txt")));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // FileOutputStream fileOutputStream1 = null;
            //fileOutputStream1 = new FileOutputStream(new File("d:/我爱LOL1.txt"));
            //fileOutputStream1.write();
        }
    }
}