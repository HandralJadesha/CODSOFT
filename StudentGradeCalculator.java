package com.SGC.java;
import java.util.*;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***STUDENT GRADE CALCULATOR***");
		int numberOfSubjects;
		System.out.print("Enter the number of subjects:");
		numberOfSubjects=sc.nextInt();
		int []marks=new int[numberOfSubjects];
		for(int i=0;i<numberOfSubjects;i++) {
			System.out.print("Enter Marks for the Subject "+(i+1)+" (Out of 100):");
			marks[i]=sc.nextInt();
		}
		
		int totalMarks=calculateTotalMarks(marks);
		
		double averagePercentage=calculateAveragePercentage(totalMarks,numberOfSubjects);
		
		char grade=calculateGrade(averagePercentage);
		System.out.println("------Displaying The Student Results------");
		System.out.println("Total Marks Obtained: "+totalMarks+" Out Of "+numberOfSubjects*100+" Marks");
		System.out.println("Average Percentage: "+averagePercentage);
		System.out.println("Grade: "+grade);

	}
	
	private static int  calculateTotalMarks(int []marks) {
		int count=0;
		for(int num:marks) {
			count+=num;
		}
		return count;
	}
   
	private static double calculateAveragePercentage(int totalMarks,int numberOfSubjects) {
		return (double)totalMarks/numberOfSubjects;
	}
	
	private static char calculateGrade(double averagePercentage) {
		if(averagePercentage>=90)
			return 'A';
		else if(averagePercentage>=80)
			return 'B';
		else if(averagePercentage>=70)
			return 'C';
		else if(averagePercentage>=60)
			return 'D';
		else
			return 'F';
	}
}
