package source;

import java.util.*;
public class Node 
{
	//DATA MEMBERS
	
	public Flight f;
	private Node next;

	//CONSTRUCTOR for "flight" class
	Node(Flight f1)
	{
		f=f1;
		next=null;
		
	}
	
	Node()
	{
		f= new Flight();
		next=null;
	}
	
	Node(String d, String a, Calendar art,String id,int hr,int min,int seats)
	{
		f= new Flight(d,a, art,id,hr,min,seats);
		next=null;
	}
	
	

	//GETTERS
	
	public Node getnext()
	{
		return next;
	}

	//SETTERS
	

	public void setnext(Node n)
	{
		next=n;
	}
	
}
  













