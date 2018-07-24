package com.scrumcreator.admin.core.data;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by VMoskalenko on 05.01.2017.
 */
@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

    @Override
    public String getDatabaseName() {
        return "scrumcreator";
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb://user:user12@ds145881.mlab.com:45881/scrumcreator"));
    }
}
