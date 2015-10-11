package com.lara;

public class Manager07 {
	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		pDao.update(4, "vinod", 25);
		System.out.println("updated !!!");
	}
}
