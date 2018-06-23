package dev.lvergergsk.spring.springcourses.springdata;

import dev.lvergergsk.spring.springcourses.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
