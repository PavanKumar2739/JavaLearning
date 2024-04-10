package first;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("first")
public class myConfig {
	@Bean
	public List getList() {
		System.out.println("array list");
		return new ArrayList();
	}
	@Bean
	@Primary
	public Map getMap() {
		return new HashMap();
	}
	@Bean
	public Set getSet() {
		return new HashSet();
	}

}
