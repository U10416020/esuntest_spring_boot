package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
    @Autowired
    private UserRepository userRepository;
    
	@Override
	public void run(String... args) throws Exception {
/*
		User user1 = User.builder()
				.userName("Apple")
				.phoneNumber("0212345678")
				.build();

		User user2 = User.builder()
				.userName("Candy")
				.phoneNumber("0287654321")
				.build();


		userRepository.save(user1);
		userRepository.save(user2);
*/
	}
}