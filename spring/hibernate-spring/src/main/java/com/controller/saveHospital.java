package com.controller;

import java.util.ArrayList;
import java.util.List;

import com.Dao.hospitalDao;
import com.dto.Branch;
import com.dto.Hospital;

public class saveHospital {

	public static void main(String[] args) {
		List<Branch> b=new ArrayList<Branch>();
		Hospital h=new Hospital();
		h.setName("ABC");
		h.setEmail("abc@gmail.com");
		h.setPhoneNo(924978412);
		
		Branch b1=new Branch();
		b1.setEmail("abcHyd@gmail.com");
		b1.setPhoneNo(20589298);
		b1.setName("abcHyd");
		b1.setHos(h);
		Branch b2=new Branch();
		b2.setEmail("abcBlr@gmail.com");
		b2.setPhoneNo(456346);
		b2.setName("abcBlr");
		b2.setHos(h);
		b.add(b1);
		b.add(b2);
		h.setBranches(b);
		System.out.println(h.getId());
		hospitalDao hos=new hospitalDao();
		hos.saveUser(h);
		System.out.println(h.getId());
		
	}
}
