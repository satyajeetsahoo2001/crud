package com.library.studentdata.studentserviceImpl;

import com.library.studentdata.StudentRepo.StudentRepo;
import com.library.studentdata.student.Student;
import com.library.studentdata.studentDto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {
    @Autowired
private StudentRepo repo;

    //    save
    public Student saveStudent(StudentDto dto){
        Student student =new Student();
        student.setName(dto.getName());
        return repo.save(student);
    }
    //update
    public Student updateStudent(StudentDto dto,Integer id){


            Student student =repo.findById(id).get();
            student.setName(dto.getName());
            return repo.save(student);
    }

    //delete
    public void deleteStudent(Integer id){
        repo.deleteById(id);
    }

    //get
        public List<Student> getStudent(){
         return  repo.findAll();

    }
    //getbyid
    public Student getStudentById(Integer id){
        return repo.findById(id).get();
    }

}
