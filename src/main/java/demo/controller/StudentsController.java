package demo.controller;

import java.util.List;

import demo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Students;

@RestController
public class StudentsController
{
    @Autowired
    StudentsService studentsService;

    @GetMapping("/students/getDetails")
    private List<Students> getAllStudents()
    {
        return studentsService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    private Students getStudents(@PathVariable("id") int id)
    {
        return studentsService.getStudentsById(id);
    }

    @DeleteMapping("/students/{id}")
    private void deleteStudents(@PathVariable("id") int id)
    {
        studentsService.delete(id);
    }

    @PostMapping("/students/saveDetails")
    private int saveStudents(@RequestBody Students students)
    {
        studentsService.saveOrUpdate(students);
        return students.getId();
    }
}
