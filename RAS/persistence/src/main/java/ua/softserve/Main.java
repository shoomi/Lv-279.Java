package ua.softserve;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.softserve.config.DataConfig;
import ua.softserve.persistence.dao.AcadeTestJpa;
import ua.softserve.persistence.dao.AcademyDAO;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DataConfig.class);

        AcadeTestJpa personService = context.getBean(AcadeTestJpa.class);

        System.out.println(personService.findOne(796));

    }

}