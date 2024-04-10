package com.example.springSimpleForm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections4.MapUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSimpleFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSimpleFormApplication.class, args);
		String id=null;
		Scanner s=new Scanner(System.in);
		Map<String,String> movieList=new LinkedHashMap<>();
		movieList.put("M101", "SpiderMan");
		movieList.put("M102", "Thor");
		movieList.put("M103", "Logan");
		movieList.put("M104", "Conuring2");
		movieList.put("M105", "IronMan");
		
		System.out.println("***************************");
		System.out.println("   Welcome To MovieMax");
		System.out.println("***************************\n");
		System.out.println();
		
		System.out.println("Enter your name");
		String name=s.nextLine();
		System.out.println("Enter your email");
		String email=s.nextLine();
		System.out.println("Enter your phone number");
	
		long mobile=s.nextLong();
		
		System.out.println("Enter your city");
		String city=s.nextLine();
		System.out.println("Select a movie : \n");
		System.out.println("*    "+movieList.get("M101"));
		System.out.println("*    "+movieList.get("M102"));
		System.out.println("*    "+movieList.get("M103"));
		System.out.println("*    "+movieList.get("M104"));
		System.out.println("*    "+movieList.get("M105"));
		String movie=s.nextLine();
		HashMap<String, String> reversedHashMap = (HashMap<String, String>) MapUtils.invertMap(movieList); 
		System.out.println("Hi "+name+"\n"+
		"Movie is successfully booked with movie id : "+reversedHashMap.get(movie));
		
	}

}
