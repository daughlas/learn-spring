package tech.lvjiawen.springbootlearn;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
@Repository
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student findById(Integer id);
}
