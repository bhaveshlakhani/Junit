package com.ibaset.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTestclass {

	Student s1 = new Student(2, "Bhavesh LAKHANI");

	int checkid = s1.getId();

	int testid = 2;

	@BeforeClass
	public static void initialtest() {

		System.out.println("intially this method will executed");
	}

	@AfterClass
	public static void afterAlltest() {

		System.out.println("this will execute after all test cases");
	}

	@Test
	public void testgetName() {
		assertEquals(checkid, testid);

		System.out.println("test cases for getname executed");

	}

	@Test
	@Ignore

	public void dual() {
		System.out.println("this test class we should ignore");

		assertEquals(4, "good".length());
	}

	@Before
	public void method() {
		System.out.println("before test cases executed");

	}

	@After
	public void method2() {
		System.out.println("After test cases executed");

	}

	@Test(expected = CustomException.class)
	public void testExp() throws CustomException {

		Student n = new Student(12, "bhavesh");

		n.setName("bhaveshlakhani1233w4738");

	}

	@Test(timeout = 200)
	public void exetime() {

		System.out.println("set time out logic here");
	}

}
