package com.Thymeleaf.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Thymeleaf.demo1.entity.ans;
import com.Thymeleaf.demo1.repo.AnsRepo;

@Service
public class AnsService {

	@Autowired
	private AnsRepo ansRepo;
	
	private void ser() {
		ans a=new ans();
		a.setAns("programming language");
		a.setId(1);
		ansRepo.save(a);

	}
}
