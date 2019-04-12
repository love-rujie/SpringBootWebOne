package test.demo.controller;

import test.demo.student.pojo.Student;
import test.demo.student.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/list")
    public ModelAndView queryList() {
        List<Student> studentList = studentService.findLAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("studentList",studentList);
        return modelAndView;
    }
}
