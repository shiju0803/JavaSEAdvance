package com.shiju.file;

import java.io.File;

/**
 * @author shiju
 * @date 2021/04/03 09:30
 **/
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("E:\\out");
        file.mkdirs();
        rmFile(file);
    }

    private static void rmFile(File file) {
        File[] files = file.listFiles();
        if(files != null && files.length != 0){
            for (File f : files) {
                //System.out.println(f);
                if (f.isFile()) {
                    f.delete();
                } else {
                    rmFile(f);
                }
            }
        }else {
            System.out.println("文件不存在");
        }
        file.delete();
    }
}
