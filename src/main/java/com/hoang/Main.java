package com.hoang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        Customer customer = new Customer();
        customer.setName("Hoang");
        service.save(customer);


//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("mongo_cfg.xml");
//                new AnnotationConfigApplicationContext(AppConfig.class);

//          MongoOperations mongoOperations =
//                new MongoTemplate(MongoClients.create(), "learning_mongo");
    }
}
