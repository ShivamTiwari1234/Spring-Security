package com.example.SpringSecurity;

import com.example.SpringSecurity.models.MyUser;
import com.example.SpringSecurity.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	MyUserRepository myUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		MyUser myUser1 = MyUser.builder()
//				.name("john").email("john@gmail.com")
//				.password(passwordEncoder.encode("john123"))
//				.authority("dev")
//				.build();
//
//		MyUser myUser2 = MyUser.builder()
//				.name("preet").email("preet@gmail.com")
//				.password(passwordEncoder.encode("preet123"))
//				.authority("qa,admin")
//				.build();
//
//		myUserRepository.saveAll(Arrays.asList(myUser1,myUser2));

	}
}
