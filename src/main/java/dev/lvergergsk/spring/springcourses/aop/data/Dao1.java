package dev.lvergergsk.spring.springcourses.aop.data;

import dev.lvergergsk.spring.springcourses.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
