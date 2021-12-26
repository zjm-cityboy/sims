package com.zjm.pojo;

public class Student {
    private String id;//学号
    private String name;//姓名
    private String sex;//性别
    private String grade;//年级
    private String major;//专业；

    //无参构造函数
    public Student() {
    }
    //获取学生学号
    public String getId() {
        return id;
    }
    //设置学生学号
    public void setId(String id) {
        this.id = id;
    }
    //获取学生姓名
    public String getName() {
        return name;
    }
    //获取学生学号
    public void setName(String name) {
        this.name = name;
    }
    //设置学生性别
    public String getSex() {
        return sex;
    }
    //设置学生性别
    public void setSex(String sex) {
        this.sex = sex;
    }
    //获取学生年级
    public String getGrade() {
        return grade;
    }
    //设置学生年级
    public void setGrade(String grade) {
        this.grade = grade;
    }
    //获取学生专业
    public String getMajor() {
        return major;
    }
    //设置学生年级专业
    public void setMajor(String major) {
        this.major = major;
    }
    //重写方法方便测试
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
