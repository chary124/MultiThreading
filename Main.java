package com.chary.Educationdinstituatecourse;

import java.awt.image.SampleModel;

import com.chary.functionalinterface.RunnableFun;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 
		Course c1 = new Course(121, "java", 3000);
		Course c2 = new Course(122, "python", 3000);
		Course c3  = new Course(123, "sql", 4000);
		Course[] course = {c1,c2,c3};
		
		  
		 Offer f1 = new Offer("for enrolling in the two course at a time you can the 20% of discount");
		 Offer f2 = new Offer("with in the one week if you have entered into the course you can get the 10% dicount ");
		 Offer offer[] = {f1,f2};
		 EducationInstitute cmr = new EducationInstitute(course,offer);
		  Thread t =  new  Thread()
				  {
			   @Override
			   public void run()
			   {
				   synchronized (cmr) {
					
				
				   Student sunny = new Student("mahesh", cmr);
				   sunny.viewCoursesAndFees();
				   sunny.viewOffer();
				   sunny.enrollInCourse(121);
 
				   
				   }
			   }
				  };
				  t.start();
				   
				 Thread t2 =  new  Thread()
				  {
			   @Override
			   public void run()
			   {
				   synchronized (cmr) {
					
				    
					 
				
				   Student  chintu = new Student("sampath", cmr);
				   chintu.enrollInCourse(122);
				   }
			   }
				  } ;
				  t2.start();
				  
				 Runnable r = ()->
				 {
					 synchronized (cmr) {
						
					
					Student sachin = new Student("sachin", cmr) ;
					sachin.enrollInCourse(123);
					 }
				 };
				 Thread t3 = new Thread(r);
				 t3.start();
				  
	}
}


