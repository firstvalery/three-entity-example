package ru.firstvalery.threeentityexample;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreeEntityExampleApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(ThreeEntityExampleApplication.class, args);
		org.h2.tools.Console.main(args);
	}

}
