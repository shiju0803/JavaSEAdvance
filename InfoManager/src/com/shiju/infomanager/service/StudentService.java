package com.shiju.infomanager.service;

import com.shiju.infomanager.dao.OtherStudentDao;
import com.shiju.infomanager.dao.StudentDao;
import com.shiju.infomanager.domain.Student;

/*
 * @Author 时距
 * @PackageName:com.shiju.infomanager.service
 * @ClassName : StudentService
 * @Date 2021/3/20 11:48
 * @Description:
 **/
public class StudentService {

    //1.创建StudentDao对象
    private OtherStudentDao studentDao = new OtherStudentDao();

    public boolean addStudent(Student stu) {
        //2.将学生对象,传递给StudentDao中的addStudent方法
        //3.将返回的boolean类型结果,返还给StudentConntroller
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        //假设id在数组中不存在
        boolean exits = false;
        //遍历数组,获取每一个学生对象,准备进行判断
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && student.getId().equals(id)){
                exits = true;
                break;
            }
        }
        return exits;
    }

    public Student[] findAllStudent() {
        //1.调用库管对应的findAllSTudent获取学生对象数组
        Student[] stus = studentDao.findAllStudent();
        //2.判断数组中是否有信息(有:返回地址 , 没有:返回null)
        //思路:数组中只要存在一个不是null的元素,那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if (flag) {
            //有信息
            return stus;
        }else {
            //无信息
            return null;
        }
    }

    public void deleteStudentByid(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(String id, Student newStu) {
        studentDao.updateStudent(id,newStu);
    }
}
