package com.example1.foodiesapi;




import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@RequiredArgsConstructor
public class mongodbdebugrunner implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;

    @Override
    public void run(String... args) {
        System.out.println("🔥 CONNECTED DATABASE = " + mongoTemplate.getDb().getName());
    }
}
