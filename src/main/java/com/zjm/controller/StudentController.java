package com.zjm.controller;

import com.zjm.pojo.Student;
import com.zjm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// @Controller用于创建一个控制器对象


//  注解 @RequestMapping 可以用在类定义处和方法定义处。


@Controller
@RequestMapping("/student")
public class StudentController {


    //构造器注入
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // 查询全部学生信息
    //ModeAndView用于视图和数据之间的操作model.addAttribute("list", list);就是把list加入model中，后续可以通过jsp（view）来提取数据
    @RequestMapping("/studentInfo")
    public String list(Model model) {
        List<Student> list = studentService.queryAllStudent();
        //相当于request.setAttribute
        model.addAttribute("list", list);
        //跳转到 studentInfo 页面
        return "studentInfo";
    }

    // 添加学生信息，跳转页面
    @RequestMapping("/toAddStudent")
    public String toAddStudent() {
        //  跳转到 studentadd.jsp 页面
        return "studentadd";
    }
    //添加学生信息的逻辑操作
    @RequestMapping("/addStudent")
    public String addStudent(Student student) {
        //1.调用studentService里的addStudent(添加学生信息)方法,同时利用student获取提交的数据
        studentService.addStudent(student);
        //重定向到studentInfo，更新视图
        return "redirect:/student/studentInfo";
    }

    //   修改学生信息
    //   跳转页面
    @RequestMapping("/toUpdateStudent")
    public String toUpdateStudent(Model model, String id) {
        // 获取的id值，通过?id={student.getId()}，因为其被${requestScope.get('list')}包含，所以可以获取数据
        Student student = studentService.queryStudentById(id);
        //  将获取到的 student 加入 model 中, model.addAttribute等同于request.setAttribute
        model.addAttribute("student", student);
        //  跳转到 studentmodify.jsp 页面
        return "studentmodify";
    }
    //更新学生信息
    @RequestMapping("/updateStudent")
    public String updateStudent(Model model, Student student) {
        // 因为已经跳转到studentmodify页面中，所以可以直接从model.addAttribute("student", student)获取student的数据。
        studentService.updateStudent(student);
        //通过id找出修改后的信息
        student = studentService.queryStudentById(student.getId());
        //然后更新student对象
        model.addAttribute("student", student);
        //  重定向到/student/studentInfo.jsp 页面，更新视图。
        return "redirect:/student/studentInfo";
    }

    //删除学生信息
    @RequestMapping("/del/{id}")
    //@PathVariable 接收请求路径中占位符的值
    public String deleteStudent(@PathVariable("id") String id) {
        studentService.deleteStudentById(id);
        // 重定向到 /student/studentInfo.jsp 页面，更新视图。
        return "redirect:/student/studentInfo";
    }

    //根据学生姓名查询学生信息
    @RequestMapping("/queryStudent")
    public String queryStudent(String queryStudentName, Model model) {
        //1.获取学生名字，根据<form>中<input name="queryStudentName">提交的信息
        Student student = studentService.queryStudentByName(queryStudentName);
        //2.创建一个Student类型的List集合
        List<Student> list = new ArrayList<Student>();
        //3.把数据库查询出来的数据传入list集合中
        list.add(student);
        //4.判断，如果student为空list则为全部学生，相当于返回主页面。
        if (student == null) {
            list = studentService.queryAllStudent();
            model.addAttribute("errorMsg", "未查到学生信息");
        }
        //5.如果student不为空，则证明查询到了消息。更新list信息。
        model.addAttribute("list", list);
        //6.跳转到studentInfo中
        return "studentInfo";
    }
}

