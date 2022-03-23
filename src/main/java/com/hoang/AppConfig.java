package com.hoang;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan({"com.hoang"})
@EnableMongoRepositories
public class AppConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "learning-mongodb-hoang";
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/learning-mongodb-hoang");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

}
