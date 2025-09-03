package com.example.springApplication1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springApplication1.entity.Users;
import com.example.springApplication1.exception.DataNotMatched;
import com.example.springApplication1.exception.UserNotFound;
import com.example.springApplication1.payloadDTO.JwtAuthResponce;
import com.example.springApplication1.payloadDTO.LoginDto;
import com.example.springApplication1.payloadDTO.UserDetailsDto;
import com.example.springApplication1.payloadDTO.UserDto;
import com.example.springApplication1.repository.UserRepository;
import com.example.springApplication1.security.JwtTokenProvider;
import com.example.springApplication1.service.UserDetailsService;
import com.example.springApplication1.service.UserService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserDetailsService userDetailsService;
 
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	//get login page
	@GetMapping(value = "/login")
	public String home() {
		return "login";
	}
	//get the register page 
	@GetMapping(value = "/register")
	public String registerPage() {
	    return "register";
	}
	
	// store the user in db and additioanal details will open
	@PostMapping("/registerSuccess")
	public String createUser( UserDto userDto, Model model) {

	System.out.println("mail id ======" + userDto.getId());
	System.out.println("mail id ======" + userDto.getEmail());
	System.out.println("mail id ======" + userDto.getPassword());
	boolean isExists=false;
	while(!isExists) {
	try {
		userService.createUser(userDto);
        
        model.addAttribute("email",userDto.getEmail());
        isExists=true;
		return "UserDetails";
	}
	catch (DataNotMatched e) {
		model.addAttribute("msg","Given email is already exists");
		return "register";
				
	}
	catch (Exception e) {
		model.addAttribute("msg","Given email is already exists");
		return "register";
	}
	}
	return "register";
	}
	
//	@PostMapping("/userDetails")
//	public String userDetails( UserDto userDto, Model model) {
//
//	System.out.println("mail id ======" + userDto.getId());
//	System.out.println("mail id ======" + userDto.getEmail());
//	System.out.println("mail id ======" + userDto.getPassword());
//		userService.createUser(userDto);
//     model.addAttribute("message","Your Registration is Successfull");
//		 HttpHeaders headers = new HttpHeaders();
//		 headers.setContentType(MediaType.TEXT_HTML);
//		return "success1";
//	}
	
    //checking and opening the user page
	@PostMapping("/success")
	public String loginUser(LoginDto loginDto,Model model ) {
    Users user=null;
	System.out.println("email : "+loginDto.getEmail());
	System.out.println("email : "+loginDto.getPassword());
	boolean isSuccess=false;
	while(!isSuccess) {
	try {
		
		String email=loginDto.getEmail();
		Authentication auth=
				authManager.authenticate(
						new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword())
						);
		System.out.println(auth);
		SecurityContextHolder.getContext().setAuthentication(auth);
		
		System.out.println(auth);
		//String token=jwtTokenProvider.generateToken(auth);//generates the token and save it to token
	    user=userRepository.findByEmail(email)
				         .orElseThrow(() -> new UserNotFound(String.format("Uasr with %d not found", email)));
		System.out.println("token generated ");
		model.addAttribute("name",user.getName());
		isSuccess=true;
		    return "meat";
	} 
	catch (UserNotFound e) {
		model.addAttribute("error","Given Username Or Password is Incorrect");
		return "login";
		
	}
	catch (Exception e) {
		
		model.addAttribute("error","Given Username Or Password is Incorrect");
		return "login";
			
	 }
	}
	return "login";
	}
		
	//post the userdetails inside user details table
	@PostMapping("/additionalDetails")
	public String additionalDetails(UserDetailsDto userDetailsDto,Model model) {
		System.out.println("mobileNo  ======" + userDetailsDto.getMobileNumber());
		System.out.println("email  ======" + userDetailsDto.getEmail());
		System.out.println("add ======" + userDetailsDto.getAddress());
		
		boolean isExists=false;
		
		while(!isExists) {
		
			try {
				
				 String email=userDetailsDto.getEmail();
				userDetailsService.saveusUserDetails(userDetailsDto);
				Users user=userRepository.findByEmail(email)
				         .orElseThrow(() -> new UserNotFound(String.format("Uasr with %d not found", email)));;
		        System.out.println("token generated ");
		        model.addAttribute("name",user.getName());
		        isExists=true;
				return "meat";
				
				
			}
			catch (DataNotMatched e) {
				model.addAttribute("email",userDetailsDto.getEmail());
				model.addAttribute("msg","Mobile number is already exists");
				return "UserDetails";
				
			}catch (Exception e) {
				model.addAttribute("email",userDetailsDto.getEmail());
				  model.addAttribute("msg","Please provide all the important fields");

				return  "UserDetails";
			}
		}
		return  "UserDetails";
		
		
	}
	

}
