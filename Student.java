package com.chary.Educationdinstituatecourse;

public class Student {
	String  stdName;
	EducationInstitute ins;
	public Student(String stdName, EducationInstitute ins) {
		super();
		this.stdName = stdName;
		this.ins = ins;
	}
	public void viewCoursesAndFees()
	{
		for(int i=0;i<ins.course.length;i++)
		{
			System.out.println(ins.course[i]);
		}
	
	}
	public void viewOffer()
	{
Offer offer[] = ins.getOffers();
		
		for(Offer f : offer)
		{
			System.out.println(f);
		}
	}
	public void enrollInCourse(int courseId)
	{
	    ins.enrollCourse(courseId, stdName);
	}
	
	

}
