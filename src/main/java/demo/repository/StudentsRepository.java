package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer>
{

}
