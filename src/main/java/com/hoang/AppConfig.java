package com.hoang;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.hoang"})
public class AppConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "learning_mongo";
    }
}
