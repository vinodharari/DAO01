package com.lara;

public class Manager06 {
	public static void main(String[] args) {
		PersonDAO pDao=(PersonDAO)Util.getObject("personDao");
		pDao.save(1, "ramu", 22);
		pDao.save(2, "vijay", 29);
		pDao.save(3, "kiran", 26);
		pDao.save(4, "swathi", 22);
		pDao.save(5, "manu", 23);
		pDao.save(6, "swetha", 25);
		System.out.println("done !!!");
	}
}
