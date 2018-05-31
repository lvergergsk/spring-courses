package dev.lvergergsk.spring.springcourses.boot.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    //    Setter injection
    @Autowired
    @Qualifier("quick")
//    private SortAlgorithm bubbleSortAlgorithm;
    private SortAlgorithm sortAlgorithm;

    //    need default constructor if you use setter injection.
    public BinarySearchImpl() {
        super();
    }

    //    Constructor injection
//    If dependency is mandatory, better use constructor injection.
//    @Autowired
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    //    Setter injection
//    @Autowired
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("pre destory");
    }
}
