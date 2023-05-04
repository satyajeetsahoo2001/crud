package com.project.student.serviceImpl;

import com.project.student.dto.StudentDTO;
import com.project.student.entity.Department;
import com.project.student.entity.Student;
import com.project.student.repository.CollegeRepository;
import com.project.student.repository.DepartmentRepository;
import com.project.student.repository.StudentRepository;
import com.project.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private CollegeRepository collegeRepository;
    // save
    @Override
    public Student saveStudent(StudentDTO studentDTO) {
        Department department= departmentRepository.findById(dId).get();

        Clg  clg= collegeRepository.findById(clgId).get();
        Student s = new Student();
        s.setName(dto.getName());
        s.setDob(dto.getDob());
        s.setFather(dto.getFather());
        s.setClgs(clg);
        s.setDepts(dept);
        return repo.save(s);
    }

    //update
    public Student updateStudent(StudentDTO dto, Integer Id, Integer dId, Integer clgId){
        Student s = repo.findById(Id).get();

        Department dept= departmentRepository.findById(dId).get();

        Clg  clg= collegeRepository.findById(clgId).get();
        s.setName(dto.getName());
        dept.setStudentd((List<Student>) s);
        s.setDepts(dept);
        s.setClgs(clg);
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

    @Autowired
    private DepartmentRepository repo;
    // save
    @Override
    public Dept saveDept(DepartmentDTO dto) {
        Dept dept = new Dept();
        dept.setDName(dto.getDName());
        return repo.save(dept);
    }

    //update
    public Dept updateDept(DepartmentDTO dto, Integer dId){
        Dept dept = repo.findById(dId).get();
        dept.setDName(dto.getDName());
        return repo.save(dept);
    }




    //get
    public List<Dept> getDept(){
        return repo.findAll();
    }
    //delete
    public void deleteDept(Integer dId){
        repo.deleteById(dId);
    }

    @Autowired
    private CollegeRepository clgREpo;
    // save
    public Clg saveClg(CollegeDTO dto) {
        Clg clg=new Clg();
        clg.setClgName(dto.getClgName());
        return clgREpo.save(clg);
    }
    //update
    public Clg updateClg(CollegeDTO dto, Integer clgId){
        Clg clg=clgREpo.findById(clgId).get();
        clg.setClgName(dto.getClgName());
        return clgREpo.save(clg);
    }
    //get
    public List<Clg> getClg(){
        return clgREpo.findAll();
    }
    //delete
    public void deleteClg(Integer clgId){
        clgREpo.deleteById(clgId);
    }

}
