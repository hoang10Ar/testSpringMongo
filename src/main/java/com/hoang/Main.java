package com.hoang;

import com.mongodb.client.MongoClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("mongo_cfg.xml");
//                new AnnotationConfigApplicationContext(AppConfig.class);

//          MongoOperations mongoOperations =
//                new MongoTemplate(MongoClients.create(), "learning_mongo");
    }
}
