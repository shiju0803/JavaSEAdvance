package com.shiju.file;

import java.io.File;
import java.util.HashMap;

/**
 * @author shiju
 * @date 2021/04/03 10:13
 **/
public class CountFile {
    public static void main(String[] args) {
        File file = new File("E:\\IdeaProjects\\JavaSEAdvance");
        HashMap<String, Integer> map = new HashMap<>();
        getCount(file,map);
        System.out.println(map);
    }
    //1.定义一个方法,参数是HashMap集合用来统计次数和File对象要统计的文件夹
    private static void getCount(File file,HashMap<String, Integer> map) {
        // 2.遍历File对象,获取它下边的每一个文件和文件夹对象
        File[] files = file.listFiles();
        for (File f : files) {
            //3.判断当前File对象是文件还是文件夹
            if(f.isFile()){
                //如果是文件,判断这种类型文件后缀名在HashMap集合中是否出现过
                String fileName = f.getName();
                //获取最后一个点出现的索引
                int index = fileName.lastIndexOf(".");
                String fileEndName = fileName.substring(index + 1);
                if(map.containsKey(fileEndName)){
                   // 出现过,获取这种类型文件的后缀名出现的次数,对其+1,在存回集合中
                    Integer count = map.get(fileEndName);
                    //这种文件又出现了一次
                    count++;
                    //把已经出现的次数给覆盖掉
                    map.put(fileEndName,count);
                }else {
                    //没出现过,将这种类型文件的后缀名存入集合中,次数存1
                    map.put(fileEndName,1);
                }
            }else {
                //如果是文件夹,递归调用自己,HashMap集合就是参数集合,File对象是当前文件夹对象代码实现
                getCount(f,map);
            }
        }
    }
}
