package source;

import java.util.*;

public class Passenger
{
	String name;
	int age;
	String ph;
    String sex;
	
        Passenger(String n,int a,String p,String s)
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        name =n;
        System.out.print("Enter age: ");
		age = a;
        System.out.print("Enter phone number: ");
		ph = p;
        System.out.print("Enter sex (M / F): ");
        sex=s;
	}
}