package com.shiju.outputstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author shiju
 * @date 2021/04/03 11:36
 **/
public class OutputStreamDemo01 {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("day11_File\\a.txt");
            os.write("hello".getBytes());
            os.write("world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
