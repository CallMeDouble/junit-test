package com.zsl.util;


import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
//静态导入
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class TestCalcuate {
	Calcuate cal;
	
	@Before
	public void setUp(){
		System.out.println("setUp");
		cal=new Calcuate();
	}
	
	@Test(timeout=200)
	public void testChen(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int act = cal.chen(2, 3);
		assertEquals(6, act);
	}
	
	
	@Test
	public void testAdd(){
		int a=12;
		int b=22;
		System.out.println(a+"+"+b);
		int act = add(a, b);
		assertEquals("加法有问题",35 , act );
	}

	public int add(int a, int b) {
		int act = cal.jia(a, b);
		return act;
	}
	
	@Test(expected=ArithmeticException.class)
	public void testChuException(){
		int act =cal.chu(2, 1);
		List l=new ArrayList();
		for (Object object : l) {
			
		}
	}
	
	@Test
	public void testHamcrest(){ 
		assertThat(50, allOf(greaterThan(20), Matchers.lessThan(60)));
	}
}
