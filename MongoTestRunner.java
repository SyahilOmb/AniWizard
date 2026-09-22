package com.movie.moviereview;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoTestRunner implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    public MongoTestRunner(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("====== FORCE CONNECTING TO MONGO ======");
        // This forces Spring to actually touch the database
        mongoTemplate.createCollection("test_connection_collection");
        System.out.println("====== MONGO CONNECTION SUCCESSFUL! ======");
    }
}
