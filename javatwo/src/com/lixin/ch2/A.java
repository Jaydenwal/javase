package com.lixin.ch2;

public class A
{
	
	public static void main(String[] args)
	{
		Stu s  = new Stu();
		s.setName("����");
		System.out.println(s.getName());
		s.setScore(20.0f);
		
		
		Emp  e = new Emp();
		e.setName("����");
		System.out.println(e.getName());
		e.setSalary(20);
	}

}
