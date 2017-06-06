package com.example.examplequerydslspringdatajpagradle.repository;

import com.example.examplequerydslspringdatajpagradle.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by dtarasenko on 6/1/2017.
 */
public interface CatRepository extends JpaRepository<Cat, Long>, QueryDslPredicateExecutor<Cat> {
}