package com.hoang;

import com.mongodb.MongoException;

import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

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
