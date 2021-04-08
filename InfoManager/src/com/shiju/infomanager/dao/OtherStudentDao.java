package com.shiju.infomanager.dao;

import com.shiju.infomanager.domain.Student;

import java.util.ArrayList;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.dao
 * @ClassName : StudentZDao
 * @Date 2021/3/20 11:48
 * @Description:
 **/
public class OtherStudentDao implements BaseStudentDao{
    //1.创建学生对象数组
    private static ArrayList<Student> stus = new ArrayList<>();
    static {
        Student stu1 = new Student("heima001","张三","23","1997-11-11");
        Student stu2 = new Student("heima002","李四","18","2003-11-11");
        stus.add(stu1);
        stus.add(stu2);
    }

    public boolean addStudent(Student stu) {
        stus.add(stu);
        System.out.println("添加成功!");
        return true;
    }

    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }
        return students;
    }

    public void deleteStudentById(String id) {
        //1.查找id在容器中所在的索引位置
        int index = getIndex(id);
        stus.remove(index);
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student newStu) {
        //1.查找id在容器中的索引位置
        int index = getIndex(id);
        //2.将该索引位置,使用学生对象替换
        stus.set(index,newStu);
    }
}
