package demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.Students;
import demo.repository.StudentsRepository;

@Service
public class StudentsService
{
	@Autowired
	StudentsRepository studentsRepository;

	public List<Students> getAllStudents()
	{
		List<Students> students = new ArrayList<Students>();
		studentsRepository.findAll().forEach(student -> students.add(student));
		return students;
	}


	public Students getStudentsById(int id)
	{
		return studentsRepository.findById(id).get();
	}

	public void saveOrUpdate(Students students
	)
	{
		studentsRepository.save(students)
	}

	public void delete(int id)
	{
		studentsRepository.deleteById(id);
	}


}
