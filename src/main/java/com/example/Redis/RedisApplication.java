package com.example.Redis;

import com.example.Redis.model.Student;
import com.example.Redis.repository.Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(Repository repository) {
        return args -> {
            Student student = new Student("id1", "pourya", "Karimi", "Bitmospher@gmail.com");
            Student student1 = new Student("id2", "HamidReza", "Karimi", "Bitmospher3@gmail.com");
            repository.save(student);
            repository.save(student1);
            System.out.println(repository.findAll());
            repository.deleteById("id1");
            System.out.println(repository.findAll());
        };
    }
}
