package com.shiju.infomanager.dao;

import com.shiju.infomanager.domain.Student;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.dao
 * @ClassName : StudentZDao
 * @Date 2021/3/20 11:48
 * @Description:
 **/
public class StudentDao implements BaseStudentDao{
    //1.创建学生对象数组
    private static Student[] stus = new Student[5];
    static {
        Student stu1 = new Student("heima001","张三","23","1997-11-11");
        Student stu2 = new Student("heima002","李四","18","2003-11-11");
        stus[0] = stu1;
        stus[1] = stu2;
    }

    public boolean addStudent(Student stu) {
        //2.添加学生到数组
        //2.1定义变量为index = -1.假设数组已经全部存满,没有null元素
        int index = -1;
        //2.2遍历数组取出每一个元素,判断是否是null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                index = i;
                //2.3 如果为null,让index变量记录当前索引位置,并使用break结束循环遍历
                break;
            }
        }
        //3. 返回是否添加成功的boolean类型状态
        if(index == -1){
            //装满了
            return false;
        }else {
            //没有装满
            stus[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public void deleteStudentById(String id) {
        //1.查找id在容器中所在的索引位置
        int index = getIndex(id);
        //2.将索引位置,使用null进行覆盖
        stus[index] = null;
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
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
        stus[index] = newStu;
    }
}
