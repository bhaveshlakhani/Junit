package com.ibaset.JunitTest;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestclass {
	
	Student s1=new Student(2,"Bhavesh LAKHANI");
	
	int checkid=s1.getId();
	
	int testid=2;
		
	@Test
	public void testgetName()
	{
		assertEquals(checkid, testid);
		
		System.out.println("test cases executed");
		
	}
	
	@Before
	public void method()
	{
		System.out.println("before test cases executed");
		
	}

	@After
	public void method2()
	{
		System.out.println("After test cases executed");
		
	}

}
