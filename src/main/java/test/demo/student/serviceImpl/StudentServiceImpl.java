package test.demo.student.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import test.demo.student.dao.StudentDao;
import test.demo.student.pojo.Student;
import test.demo.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findLAll() {
        List<Student> studentList = studentDao.select();
        return studentList;
    }
}
