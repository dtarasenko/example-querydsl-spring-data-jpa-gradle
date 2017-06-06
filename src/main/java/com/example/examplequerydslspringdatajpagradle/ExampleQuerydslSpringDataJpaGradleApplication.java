package com.example.examplequerydslspringdatajpagradle;

import com.example.examplequerydslspringdatajpagradle.entity.Cat;
import com.example.examplequerydslspringdatajpagradle.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleQuerydslSpringDataJpaGradleApplication implements CommandLineRunner {

	@Autowired
	private CatRepository catRepository;


	public static void main(String[] args) {
		SpringApplication.run(ExampleQuerydslSpringDataJpaGradleApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Cat cat1 = new Cat();
		cat1.setName("Tim");

		Cat cat2 = new Cat();
		cat2.setName("Oreo");

		Cat cat3 = new Cat();
		cat3.setName("Toby");

		catRepository.save(cat1);
		catRepository.save(cat2);
		catRepository.save(cat3);

		catRepository.flush();
	}
}
