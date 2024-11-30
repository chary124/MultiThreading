package com.chary.Educationdinstituatecourse;

public class Course 
{
int courseId;
String courseName;
double coutseFee;
public Course(int courseId, String courseName, double coutseFee) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.coutseFee = coutseFee;
}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public double getCoutseFee() {
	return coutseFee;
}

public void setCoutseFee(double coutseFee) {
	this.coutseFee = coutseFee;
}

@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coutseFee=" + coutseFee + "]";
}

 

}
