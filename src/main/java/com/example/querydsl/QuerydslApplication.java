package com.example.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@EnableBatchProcessing
@SpringBootApplication
public class QuerydslApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuerydslApplication.class, args);
    }

//    @Bean
//    JPAQueryFactory jpaQueryFactory(EntityManager em){
//        return new JPAQueryFactory(em);
//    }





}
