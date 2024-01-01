package oop_02_01_24;

import java.sql.Date;

public class Person {
    protected String name;

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	protected Date birthday;
    
}
