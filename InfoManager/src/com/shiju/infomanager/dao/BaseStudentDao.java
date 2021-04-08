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
public interface  BaseStudentDao {

    public abstract boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String id);
    public abstract int getIndex(String id);

    public abstract void updateStudent(String id, Student newStu);
}
