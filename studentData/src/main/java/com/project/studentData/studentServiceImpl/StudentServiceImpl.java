package com.project.studentData.studentServiceImpl;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgRepo.ClgRepo;
import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptRepo.DeptRepo;
import com.project.studentData.student.Student;
import com.project.studentData.studentDto.StudentDto;
import com.project.studentData.studentRepo.StudentRepo;
import com.project.studentData.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo repo;
    @Autowired
    private DeptRepo deptRepo;
    @Autowired
    private ClgRepo clgRepo;
    // save
    @Override
    public Student saveStudent(StudentDto dto,Integer dId,Integer clgId) {
        Dept dept=deptRepo.findById(dId).get();

        Clg  clg=clgRepo.findById(clgId).get();
        Student s = new Student();
        s.setName(dto.getName());
        s.setDob(dto.getDob());
        s.setFather(dto.getFather());
        s.setClgs(clg);
        s.setDepts(dept);
        return repo.save(s);
    }

    //update
    public Student updateStudent(StudentDto dto, Integer Id,Integer dId,Integer clgId){
        Student s = repo.findById(Id).get();

        Dept dept=deptRepo.findById(dId).get();

        Clg  clg=clgRepo.findById(clgId).get();
        s.setName(dto.getName());
        s.setDepts(dept);
        s.setClgs(clg);
        dept.setStudentd(s);
        return repo.save(s);
    }




    //get
    public List<Student> getStudent(){
        return repo.findAll();
    }
    //delete
    public void deleteStudent(Integer dId){
        repo.deleteById(dId);
    }

}
