package Packages;

public class Shadhiprofile
{
private String name;
private int age;
private String gender;
private String toatlar;
private String nri;
private double salary;
public void shaadi_Users(String name,int age,String gender,String toatlar,String nri,double salary)
{
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.toatlar=toatlar;
	this.nri=nri;
	this.salary=salary;
}
@Override
public String toString()
{
	return("name:"+name+"age:"+age+"gender:"+gender+"toatlar:"+toatlar+"Nri:"+nri+"salary:"+salary);
}
}
