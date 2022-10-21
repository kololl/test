package com.example.DemoGK;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.DemoGK.interfac.ChuyenBayDao;


@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class DemoGkApplication {

	@Bean
	public CommandLineRunner run(ChuyenBayDao chuyenBayDao) {
		return (ArgsAnnotationPointcut -> {

			System.out.println((chuyenBayDao.findAll()));
			
			System.out.println(
					"-------------------------- 1. Cho biết các chuyến bay đi Đà Lạt (DAD).-----------------------------");
			System.out.println((chuyenBayDao.listChuyenBayDAD()));


		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGkApplication.class, args);
	}
}
