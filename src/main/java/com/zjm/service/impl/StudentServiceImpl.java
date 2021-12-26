package com.zjm.service.impl;

import com.zjm.dao.StudentMapper;
import com.zjm.pojo.Student;
import com.zjm.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //idea不推介注释注入，我们按照提示改为构造器注入
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }


    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudentById(String id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    @Override
    public Student queryStudentByName(String studentName) {
        return studentMapper.queryStudentByName(studentName);
    }
}
