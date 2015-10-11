package com.lara;

public class Manager05 {
	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		pDao.setUp();
		System.out.println("done !!!");
	}
}
