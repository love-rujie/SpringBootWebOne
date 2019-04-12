package test.demo.student.serviceImpl;

import test.demo.student.pojo.Student;
import test.demo.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findLAll() {
        return null;
    }
}
