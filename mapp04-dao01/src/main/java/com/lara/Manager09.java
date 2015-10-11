package com.lara;

import java.util.List;
import java.util.Map;

public class Manager09 {

	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		List<Map<String, Object>> records=pDao.readAll();
		for(Map<String, Object> record:records){
			System.out.println(records);
		}
		
		System.out.println("listed !!!");
	}
}
