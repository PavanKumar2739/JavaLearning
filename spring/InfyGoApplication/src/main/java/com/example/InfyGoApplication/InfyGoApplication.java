package com.example.InfyGoApplication;

import java.util.Scanner;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.example.InfyGoApplication.entityDTO.UserDto;
import com.example.InfyGoApplication.service.RegistrationService;

@SpringBootApplication
public class InfyGoApplication implements CommandLineRunner {

	@Autowired
	private Environment environment;
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(InfyGoApplication.class, args);
		
		
	}
	@Bean
	public ModelMapper moderMapper() {
		
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			UserDto user = new UserDto();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user id: ");
			String uid = sc.nextLine();
			System.out.println("Enter password: ");
			String pwd = sc.nextLine();
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter city: ");
			String city = sc.nextLine();
			System.out.println("Enter email: ");
			String mail = sc.nextLine();
			
			Scanner phoneScanner = new Scanner(System.in);
			System.out.println("Enter phone: ");
			String phone = phoneScanner.nextLine();

			sc.close();
			phoneScanner.close();

			user.setCity(city);
			user.setEmail(mail);
			user.setName(name);
			user.setPassword(pwd);
			user.setPhone(phone);
			user.setUserId(uid);
			
			RegistrationService service = (RegistrationService) context.getBean("registrationService");
			String registrationMessage = service.registerUser(user);
			System.out.println(environment.getProperty(registrationMessage));
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
