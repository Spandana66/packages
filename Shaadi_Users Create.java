package Packages;

import java.util.Scanner;

public class Shaadi_Users Create()
{
	System.out.println("Welcome to profile page:");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	String name=sc.nextLine();
	System.out.println("Enter the age:");
	int age=sc.nextInt();
	System.out.println("Enter the gender:");
	String gender=sc.next();
	System.out.println("Enter whether you are Teatotalar or not:");
	String toatlar=sc.next();
	System.out.println("Are you a NRI Yes/No:");
	String nri=sc.next();
	System.out.println("Enter the Salary:");
	double salary=sc.nextDouble();
	Shaadi_Users u=new Shaadi_Users(name,age,gender,toatlar,nri,salary);
	return u;
}
