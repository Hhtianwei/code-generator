package com.training.service;

import com.training.mapper.StudentMapper;
import com.training.pojo.Student;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName StudentService
 * @Description TODO
 * @DATE 2019/12/3 10:30
 * @VERSION 1.0
 **/
public class StudentService {

    private StudentMapper studentMapper;
    public StudentService(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    public void queryTest(){
        Example example = new Example(Student.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name","tian");
        List<Student> students = studentMapper.selectByExample(example);
        students.stream().forEach(System.out::println);
    }

}
