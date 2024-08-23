package com.example.postgrespringboot.Service;

import com.example.postgrespringboot.DTO.StudentDTO;
import com.example.postgrespringboot.Model.School;
import com.example.postgrespringboot.Model.Student;
import com.example.postgrespringboot.Repository.SchoolRepository;
import com.example.postgrespringboot.Repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    public SchoolRepository schoolRepository;

    @Override
    public void addStudent(StudentDTO studentDTO) {
        Optional<School> school = schoolRepository.findById(studentDTO.getSchoolId());
        if(school.isPresent())
        {
            Student student = new Student();
            BeanUtils.copyProperties(studentDTO,student);
            //convertToEntity(studentDTO);
            student.setSchool(school.get());
            studentRepository.save(student);

        }
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = StreamSupport.stream(studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return students.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentByRollNumber(String rollNumber) {
        Student student = studentRepository.findByRollNumber(rollNumber);
        return student != null ? convertToDTO(student) : null;
    }

    @Override
    public void updateStudentName(String rollNumber, String newName) {
        Student student = studentRepository.findByRollNumber(rollNumber);
        if (student != null) {
            student.setName(newName);
            studentRepository.save(student);
        }
    }

    @Override
    public void deleteStudentByRollNumber(String rollNumber) {
        Student student = studentRepository.findByRollNumber(rollNumber);
        if (student != null) {
            studentRepository.delete(student);
        }
    }

    private StudentDTO convertToDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student, studentDTO);
        return studentDTO;
    }

//    private Student convertToEntity(StudentDTO studentDTO) {
//        return new Student(
//                studentDTO.getName(),
//                studentDTO.getStudentClass(),
//                studentDTO.getRollNumber(),
//                studentDTO.getDob()
//        );
//    }
}
