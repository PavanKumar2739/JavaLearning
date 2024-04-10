package org.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class first {
	public static void main(String[] args) {
		try {
		Driver d= new Driver();
		DriverManager.registerDriver(d);
		System.out.println("successfully loaded");
		}
		catch(SQLException e){
			System.out.println(e);
			
		}
	}

}
