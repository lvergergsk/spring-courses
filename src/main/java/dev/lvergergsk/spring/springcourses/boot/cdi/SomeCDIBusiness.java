package dev.lvergergsk.spring.springcourses.boot.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Arrays;

@Named
public class SomeCDIBusiness {
    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest(){
        return Arrays.stream(someCdiDao.getData()).max().orElse(Integer.MIN_VALUE);
    }

}
