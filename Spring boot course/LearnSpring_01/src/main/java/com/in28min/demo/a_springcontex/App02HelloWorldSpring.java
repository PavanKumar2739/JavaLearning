package com.in28min.demo.a_springcontex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		//1: Launch Spring context
		//config is not sufficient we need below beans. we need contex to launch the config class
		var contex = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//configure the things that spring needs to manage
		//helloworldConfiguration - @Configuration
		//name - @Bean.
		
		//3:we need to pass the method name of the bean
		//Retrieving beans managed by spring
		System.out.println(contex.getBean("name"));
		System.out.println(contex.getBean("age"));
		System.out.println(contex.getBean("person"));
		//System.out.println(contex.getBean("address"));//this will fail since its name changed to address2
		System.out.println(contex.getBean("address2"));
		
		//in this we are passing the method names no params has been passed,
		// bean will inject the paramas by itself in if its under spring configuration
		System.out.println(contex.getBean("person2MethodCall"));
		System.out.println(contex.getBean("person3Parameters"));
		
		
		
		//System.out.println(contex.getBean(Address.class));
		// fails due to its confuses for spring to pick multiple methods if we go with class level; throws below error.
		//if we dont explicity mentioned it.like primary one or not.
		//No qualifying bean of type 'com.in28min.demo.a_springcontex.Address' available: expected single matching bean but found 2: address2,address3
		
		
		//if we dont mention the qualifier name or the primary one, it will confuse to pick the bean 
		System.out.println(contex.getBean("person5Parameters"));
		
		//this will work because we have gave the qulier name here sprig wont confuse
		System.out.println(contex.getBean("person4Parameters"));
		
		
	
		
		
	}
	
	//---IMP details----
	
	/*When multiple beans of same type exist, Spring tries:

		🥇 1. By TYPE

		👉 Finds all beans of that type

		🥈 2. By NAME (parameter name)

		👉 Matches parameter name with bean name

		🥉 3. By @Qualifier

		👉 If provided, it overrides everything

		🏅 4. By @Primary

		👉 Default bean if no name match
		
		Your Example (Address case)

You have:

@Bean(name = "address2")
public Address address() { ... }

@Bean(name = "address3")
public Address address3() { ... }
🟢 Case 1: Name matches → ✅ Works
public Person person(String name, int age, Address address2)

👉 Spring:

Type → Address (2 beans found)
Name → address2 ✔️ match

✅ Injects address2

🔴 Case 2: Name DOES NOT match → ❌ Error
public Person person(String name, int age, Address myAddress)

👉 Spring:

Type → Address (2 beans)
Name → myAddress ❌ no match
No @Qualifier
No @Primary

❌ ERROR:

No qualifying bean of type 'Address' available
🟢 Case 3: Using @Qualifier → ✅ Works always
public Person person(String name, int age,
    @Qualifier("address3") Address myAddress)

👉 Spring ignores name
👉 Uses qualifier

✅ Injects address3

🟢 Case 4: Using @Primary → fallback
@Bean
@Primary
public Address address() { ... }

👉 If no name match:
✔️ Spring uses primary bean

🧠 FINAL CORRECT UNDERSTANDING

✔️ If multiple beans of same type exist:
→ Spring first checks type
→ then tries parameter name
→ if no match → checks @Qualifier / @Primary
→ if still no match → throws error

🔥 One-line Rule (MEMORIZE THIS)

Multiple beans → name must match OR use @Qualifier/@Primary, else Spring throws error

✅ Your Understanding Status

You are now:

✔️ Correct on concept
✔️ Thinking like Spring internally
✔️ Reaching interview-level clarity
	
	*/
	
	

}
