package com.shiju.homework;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
 * 2.键盘录入6个学员信息(录入格式:张三,男,25),要求有两个相同的信息,将6个学员信息存入到ArrayList集合中
 * 3.将存有6个学员信息的ArrayList集合对象写入到 StudentInfo.txt文件中
 * 4.读取 StudentInfo.txt文件中的ArrayList对象并遍历打印
 * 5.对ArrayList集合中的6个学生对象进行去重,将去重后的结果利用字符缓冲流写入到 NewStudentInfo.txt文件中(写入格式：张三-男-25)
 *
 * @author shiju
 * @date 2021/04/05 20:48
 **/
public class TestStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //定义集合对象,存储学生信息
        ArrayList<Student> list = new ArrayList<>();
        //调用方法,输入学生信息,并存入集合
        getStudent(list);
        //对学生对象集合进行序列化和反序列化,最后打印学生对象信息
        printStudent(list);

        List<Student> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重后的学生信息:");
        for (Student s : newList) {
            System.out.println(s.toString());
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\NewStudentInfo.txt"));
        for (Student h : newList) {
            bw.write(h.getName() + "-" + h.getGender() + "-" + h.getAge());
            bw.newLine();
        }
        //释放资源
        bw.close();
    }

    private static void printStudent(ArrayList<Student> list) throws IOException, ClassNotFoundException {
        //序列化
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\StudentInfo.txt"));
        //将存有学生对象信息的集合对象信息写入到D盘StudentInfo.txt文件中
        oos.writeObject(list);
        //释放资源
        oos.close();
        //反序列化
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\StudentInfo.txt"));
        //读取 StudentInfo.txt文件中的ArrayList对象并遍历打印
        Object o = ois.readObject();
        ArrayList<Student> stuList = (ArrayList<Student>) o;
        System.out.println("StudentInfo.txt文件中的学生信息如下:");
        for (Student student : stuList) {
            System.out.println(student);
        }
        //释放资源
        ois.close();
    }

    //键盘录入学生信息,将6个学员信息存入到ArrayList集合中
    private static void getStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "学生信息(录入格式:张三,男,25):");
            String s = sc.nextLine().trim();
            //将字符串中信息截取出来
            String[] stu = s.split(",");
            //将数组中的元素封装成学生对象,并存入集合
            list.add(new Student(stu[0], stu[1], Integer.parseInt(stu[2])));
        }
    }
}
