package test.demo.student.dao;

import test.demo.student.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao {
    @Select("select * from student")
    public List<Student> select();
}
