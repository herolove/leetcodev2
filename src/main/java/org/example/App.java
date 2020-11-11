package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
       String a = "1009";
       String b = "10080";
       char[] ch = a.toCharArray();
       char[] ch2 = b.toCharArray();

        System.out.println(a.compareTo(b));
    }
}
