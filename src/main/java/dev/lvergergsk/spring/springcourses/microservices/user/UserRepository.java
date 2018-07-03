package dev.lvergergsk.spring.springcourses.microservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

// <object, primaryKey>
public interface UserRepository extends JpaRepository<User,Integer> {

}
