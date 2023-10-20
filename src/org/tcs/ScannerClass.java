package org.tcs;
import java.util.Scanner;
public class ScannerClass {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter emp id");
	int id = scan.nextInt();
    System.out.println("emp id is:"+id);
    System.out.print("enter emp name");
	String name=scan.nextLine();
	System.out.println("emp name is:"+name);
    System.out.print("enter emp email");
	String email=scan.next();
	System.out.println("emp email is:"+email);
	System.out.println("enter emp phoneno");
	long phoneno=scan.nextLong();
	System.out.println("emp phoneno is:"+phoneno);
	System.out.println("enter emp salary");
	int salary = scan.nextInt();
	System.out.println("emp salary is:"+salary);
	System.out.println("enter emp gender");
	String gender=scan.next();
	System.out.println("emp gender is:"+gender);
	System.out.println("enter emp city");
	String city=scan.next();
	System.out.println("emp city is:"+city);


}
}