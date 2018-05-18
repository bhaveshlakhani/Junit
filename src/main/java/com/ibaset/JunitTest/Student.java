package com.ibaset.JunitTest;

public class Student {

	int id;
	String name;

	public Student(int id, String name) 
	{

		this.name = name;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws CustomException 
	{
		this.name = name;
		
		if(name.length()>15)
		{
			
			throw new CustomException();
		}
	}

}
