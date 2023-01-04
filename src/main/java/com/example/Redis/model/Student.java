package com.example.Redis.model;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "Student",timeToLive = 90L)
public class Student {
    public enum Gender{
        MALE,FEMALE
    }
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
