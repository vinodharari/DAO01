package com.lara;

import java.util.List;
import java.util.Map;

public class Manager08 {
	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		pDao.delete(2);
		System.out.println("deleted !!!");
	}
}
