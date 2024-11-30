package com.chary.Educationdinstituatecourse;


public class EducationInstitute {
	
	Course course[];
	Offer offer[];
	public EducationInstitute(Course[] course, Offer[] offer) {
		super();
		this.course = course;
		this.offer = offer;
	}
	
	public Course[] getCourses()
	{
	 return  this.course;
	}
	public Offer[] getOffers()
	{
		return this.offer;
	}
	public void enrollCourse(int id,String name)
	{
		for(int i=0;i<course.length;i++)
		{
			if(course[i].getCourseId()==id)
			{
				System.out.println(id + " " + name + " enrolled in  " + course[i].getCourseName());
				break;
			}
			else
			{
				System.out.println(id + " id is undefined ");
			}
		}
	}

}