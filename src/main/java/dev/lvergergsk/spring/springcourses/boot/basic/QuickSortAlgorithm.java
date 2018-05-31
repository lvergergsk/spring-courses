package dev.lvergergsk.spring.springcourses.boot.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
