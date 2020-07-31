package tech.lvjiawen.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper strdentMapper;

    public Student findStudent(Integer id) {
        return strdentMapper.findById(id);
    }

}
