package source;

import java.util.*;
class LinkedList
{
	//DATA MEMBERS
	private Node head;
   	
   	//CONSTRUCTOR
   	LinkedList()
   	{
   		head=null;
   	}
   	
   	public void insert(Node temp)
   	{
        Node p,q;
        p=null;
        q=head;
        
        //create new node to insert
         Calendar x=temp.f.getDept();
        while((q!=null) &&(q.f.getDept().compareTo(x)<0)) 	//check for how to compare??
        {
            p=q;
            q=q.getnext();
        }
        if(q==null)
        {
            if(p==null) 		 	//list empty, new node is the first node
                head=temp;
            else 			 	// new node gets inserted after the last node
                p.setnext(temp);
        }
        else
        {
            if(p==null)		 	//list already present,new node is the first
            {
                temp.setnext(q);
                head=temp;
            }
            else
            {
                p.setnext(temp);	//insert in middle
                temp.setnext(q);
            }
        }
    }

   	//INSERTING IN ASCENDING DEPARTURE TIME
   	public void insert()
   	{
   		Node p,q,temp;
   		p=null;
   		q=head;

   		//create new node to insert
   		temp=new Node();
   		Calendar x=temp.f.getDept();
   		while((q!=null) &&(q.f.getDept().compareTo(x)<0)) 	//check for how to compare??
   		{
   			p=q;
   			q=q.getnext();
   		}
   		if(q==null)
		{
			if(p==null) 		 	//list empty, new node is the first node
				head=temp;
			else 			 	// new node gets inserted after the last node
				p.setnext(temp);
		}
		else
		{
			if(p==null)		 	//list already present,new node is the first
			{
				temp.setnext(q);
				head=temp;
			}
			else
			{
				p.setnext(temp);	//insert in middle
				temp.setnext(q);
			}
		}
	}
	
	//INSERT GIVEN DEPARTURE AND ARRIVAL CITIES
	public void insert2(String d, String a, Calendar ar,String id,int hr,int min,int seats)
   	{
   		Node p,q,temp;
   		p=null;
   		q=head;

   		//create new node to insert
   		temp=new Node(d, a, ar,id,hr,min,seats);
   		Calendar x=temp.f.getDept();
   		while((q!=null) &&(q.f.getDept().compareTo(x)<0)) 	//check for how to compare??
   		{
   			p=q;
   			q=q.getnext();
   		}
   		if(q==null)
		{
			if(p==null) 		 	//list empty, new node is the first node
				head=temp;
			else 			 	// new node gets inserted after the last node
				p.setnext(temp);
		}
		else
		{
			if(p==null)		 	//list already present,new node is the first
			{
				temp.setnext(q);
				head=temp;
			}
			else
			{
				p.setnext(temp);	//insert in middle
				temp.setnext(q);
			}
		}
	}
	
	//DISPLAY ALL
	public void display(javax.swing.table.DefaultTableModel model)
	{
		Node temp;
		temp=head;
        if(head==null){
//            data.setText(data.getText()+"No Flights! "+"</br>");
            System.out.println("No Flights! ");
        }
		//traverse till the end of the list and display
		else
        {
            while(temp!=null)
            {
                Object[] row = this.disp(temp);
                model.addRow(row);
                temp=temp.getnext();
            }
        }
	}
	
	//DISPLAY (for a single Node )
	public Object[] disp(Node x)
	{ 	
		//Setting display correctly for minutes and seconds if less than 10.
		String s1="",s2="",s3="",s4="";
		int t1=x.f.getDept().get(Calendar.HOUR_OF_DAY);
		if(t1<10)
			s1=s1+"0"+t1;
		else
			s1=s1+t1;
		int t2=x.f.getDept().get(Calendar.MINUTE);
		if(t2<10)
			s2=s2+"0"+t2;
		else
			s2=s2+t2;
		int t3=x.f.getArvl().get(Calendar.HOUR_OF_DAY);
		if(t3<10)
			s3=s3+"0"+t3;
		else
			s3=s3+t3;
		int t4=x.f.getArvl().get(Calendar.MINUTE);
		if(t4<10)
			s4=s4+"0"+t4;
		else
			s4=s4+t4;
		
		//DISPLAYS DETAILS OF A SPECIFIC FLIGHT
		System.out.println("FLIGHT\t\tDEPARTURE CITY\t\tDEPARTURE TIME\t\tARRIVAL CITY\t\tARRIVAL TIME");
		System.out.println(x.f.getId()+"\t\t\t"+x.f.getFrom()+"\t\t\t"+s1+":"+s2+"\t\t\t"+x.f.getTo()+"\t\t"+s3+":"+s4);
		Object[] row = {x.f.getId(),x.f.getFrom(),s1+":"+s2,x.f.getTo(),s3+":"+s4};
                System.out.println("\n");
                return row;
	}
	
	
	//SEARCH FLIGHTS
	public void Search(Date x)
	{
		Node temp;
		temp=head;
		boolean found=false;
		
		if(head==null)
			System.out.println("NO FLIGHTS CONNECTING GIVEN CITIES");
		else
		{
			//traverse till the end of the list or till not ofund
			while(temp!=null && !found)
			{
				if (temp.f.getDept().equals(x))
				{
					found=true;
					disp(temp);
				}
				temp=temp.getnext();
			}
		}
		if(!found && head!=null)
			System.out.println("NO FLIGHT MATCHES YOUR SEARCH!");
		
	}
	
	//REMOVE GIVEN FLIGHT
	public void delete(String x)
	{
		Node p,q;
		q=head;
		p=null;
		
		//loop till x is found or end of the list is encountered
		while((!q.f.getId().equalsIgnoreCase(x))&&(q!=null))
		{
			p=q;
			q=q.getnext();
		}		
	  
		if(q==null)
			System.out.println("FLIGHT TO BE REMOVED NOT FOUND!");
		else
		{
			if(p==null)				//first or the only node
				head=q.getnext();
			else
				p.setnext(q.getnext()); 	//link the nodes after deleting node
		}
	
	}
	
	public String reserve(String s,String n,int a,String p,String sex)
	{	
		Node temp;
		temp=head;
		boolean found=false; boolean book=false; int count=0;
		String output="";
		if(head==null)
			System.out.println("NO FLIGHTS CONNECTING GIVEN CITIES");
		else
		{
			//traverse till the end of the list or till not ofund
			while(temp!=null && !found)
			{
				if (temp.f.getId().equals(s))
				{
					found=true;
					disp(temp);
				}
				if(!found)
					temp=temp.getnext();
			}
			if(found)
			{
				//disp(temp);
				//System.out.println(temp.f.getSize());
				for(int i=0; i<temp.f.getSize(); ++i)
				{
					if(temp.f.reservation[i]==null)
						count++;
					if(temp.f.reservation[i]==null && !book)
					{
						temp.f.reservation[i]=new Passenger(n,a,p,sex);
						book=true;
						temp.f.pas++;
						//count++;
					}
					
					
				}
				if(!book )
					output= "NO SEATS AVAILABLE!";
				else
					output="Congratulations! Your seat has been booked.\n</br>Have a great flight!";
				output+="\n</br>Number of Available seats on flight: "+(count-1);
			}
			
			
		}
		if(!found && head!=null)
			System.out.println("NO FLIGHT MATCHES YOUR SEARCH!");
                return output;
	}
    
    //DELETE RESERVATION ON A FLIGHT
    public String reserveBack(String s,String name)
    {
        Node temp;
        temp=head;
        String output="";
        boolean found=false; boolean cancel=false; int count=temp.f.getSize() - temp.f.pas;
        
        if(head==null)
            System.out.println("NO FLIGHTS CONNECTING GIVEN CITIES");
        else
        {
            //traverse till the end of the list or till not ofund
            while(temp!=null && !found)
            {
                if (temp.f.getId().equals(s))
                {
                    found=true;
                    disp(temp);
                }
                if(!found)
                    temp=temp.getnext();
            }
            if(found)
            {
                //disp(temp);
                //System.out.println(temp.f.getSize());
                Scanner sc= new Scanner(System.in);
                int fou=-1;
                System.out.println("Enter name: ");
                
                for( int i=0; i<temp.f.pas; ++i)
                {
                    if(name.equalsIgnoreCase(temp.f.reservation[i].name))
                    {
                        fou=i;
                    }
                }
                
                if(fou != -1)
                {
                    temp.f.reservation[fou]=null;
                    cancel=true;
                    temp.f.pas--;
                }
                
                
                
                
                
                if(!cancel ){
                    System.out.println("NO SUCH RESERVATION MADE!");
                    output+="NO SUCH RESERVATION MADE!<br>";
                }
                else{
                    System.out.println("Success!");
                    output+="Success!<br>";
                }
                System.out.println("Number of Available seats on flight: "+(count));
                output+="Number of Available seats on flight: "+(count)+"<br>";
            }
            
            
        }
        if(!found && head!=null){
            System.out.println("NO FLIGHT MATCHES YOUR SEARCH!");
            output+="NO FLIGHT MATCHES YOUR SEARCH!<br>";
        }
        return output;
    }
    
    //LIST OF ALL PASSENGERS ON A FLIGHT
    public void allPass(String s,javax.swing.table.DefaultTableModel model)
    {
        Node temp;
        temp=head;
        boolean found=false; boolean book=false; int count=0;
        
        if(head==null)
            System.out.println("NO FLIGHTS CONNECTING GIVEN CITIES");
        else
        {
            //traverse till the end of the list or till not ofund
            while(temp!=null && !found)
            {
                if (temp.f.getId().equals(s))
                {
                    found=true;
                    disp(temp);
                }
                if(!found)
                    temp=temp.getnext();
            }
            if(found)
            {
                if(temp.f.pas==0)
                    System.out.println("No bookings done yet!");
                else
                {
                    System.out.println("   NAME\t\t\t\tAGE\t\tGENDER\t\tCONTACT NUMBER");
                    for(int i=0; i<temp.f.pas; ++i)
                    {
                        System.out.println((i+1)+". " +temp.f.reservation[i].name+"\t\t"+temp.f.reservation[i].age+"\t\t"+temp.f.reservation[i].sex+"\t\t"+temp.f.reservation[i].ph);
                        Object[] row={temp.f.reservation[i].name,temp.f.reservation[i].age,temp.f.reservation[i].ph,temp.f.reservation[i].sex};
                        model.addRow(row);
                    }
                }
                
            }
        }
        if(!found && head!=null)
            System.out.println("NO FLIGHT MATCHES YOUR SEARCH!");
        
    }
		
	
}//LinkedList class end

   	