package org.tcs;

import java.util.Scanner;

public class ScannerClass2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the student name");
	String studentName=scan.nextLine();
	System.out.println("the student name is:"+studentName);
	System.out.println("enter the student id");
	int studentId=scan.nextInt();
	System.out.println("the student id is:"+studentId);
	System.out.println("enter the mark1");
	int a=scan.nextInt();
	System.out.println("enter the mark2");
	int b= scan.nextInt();
	System.out.println("enter the mark3");
	int c= scan.nextInt();
	System.out.println("enter the mark4");
	int d= scan.nextInt();
	System.out.println("enter the mark5");
    int e= scan.nextInt();
    int sum=a+b+c+d+e;
    System.out.println("the sum of these marks are:"+sum);
    int average=a+b+c+d+e/5;
    System.out.println("the average of these marks are:"+average);
}
}
