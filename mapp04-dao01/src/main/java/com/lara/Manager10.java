package com.lara;

import java.util.List;
import java.util.Map;

public class Manager10 {

	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		List<Map<String, Object>> record=pDao.read(3);
		Map<String, Object> map=record.get(0);
		System.out.println(map);
		System.out.println("listed !!!");
	}
}
