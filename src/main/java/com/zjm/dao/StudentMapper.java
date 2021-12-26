package com.zjm.dao;

import com.zjm.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //增加一个学生信息
    int addStudent(Student student);

    //根据id删除一个学生信息
    int deleteStudentById(String id);

    //更新学生信息
    int updateStudent(Student student);

    //根据id查询,返回一个学生信息
    Student queryStudentById(String id);


    //查询全部Student,返回list集合
    List<Student> queryAllStudent();

    //根据名字查询学生信息
    Student queryStudentByName(String StudentName);
}
