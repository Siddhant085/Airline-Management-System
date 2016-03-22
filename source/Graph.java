package source;

import java.util.*;
import javax.swing.JLabel;
public class Graph 
{
	//DATA MEMBERS
	public String [] cty= {"Delhi","Mumbai","Chennai","Bangalore","Pune","Jaipur","Cochin","Goa"};
	public int count= cty.length;
	public LinkedList gr[][];
	public arTime [] [] time;
	
	Scanner sc= new Scanner(System.in);
	
	//CONSTRUCTOR
	Graph()
	{	
		gr= new LinkedList[count][count];
		time= new arTime[count][count];
		
		for(int i=0; i<count; ++i)
		{
			for(int j=0; j<count; ++j)
			{
				if(i==j)
				{
					gr[i][j]=null;
					
					time[i][j]=null;
				}
				else
				{
					gr[i][j]=new LinkedList();
					
					time[i][j]=new arTime();
					time[i][j].getA().set(Calendar.MONTH,1);
					time[i][j].getA().set(Calendar.DAY_OF_MONTH,1);
					time[i][j].getA().set(Calendar.YEAR,2015);
				}
			}
		}
		
		
		
		this.set(count);
		initialize();
		
	}
	
	public void set(int c)
	{
		for(int i=0; i<c ; ++i)
		{
			for(int j=0; j<c; ++j)
			{
				if(i!=j)
				{
					//System.out.println(i+":"+j);
					time[i][j].getA().set(Calendar.MONTH,1);
					time[i][j].getA().set(Calendar.DAY_OF_MONTH,1);
					time[i][j].getA().set(Calendar.YEAR,2015);
				}
			}
		}     //yyyy/mm/dd initialised
		
		
		time[0][1].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[0][1].getA().set(Calendar.MINUTE, 30);
		time[0][2].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[0][2].getA().set(Calendar.MINUTE, 00);
		time[0][3].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[0][3].getA().set(Calendar.MINUTE, 45);
		time[0][4].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[0][4].getA().set(Calendar.MINUTE, 15);
		time[0][5].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[0][5].getA().set(Calendar.MINUTE, 45);
		time[0][6].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[0][6].getA().set(Calendar.MINUTE, 15);
		time[0][7].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[0][7].getA().set(Calendar.MINUTE, 35);
		
		time[1][0].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[1][0].getA().set(Calendar.MINUTE, 30);
		time[1][2].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[1][2].getA().set(Calendar.MINUTE, 55);
		time[1][3].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[1][3].getA().set(Calendar.MINUTE, 00);
		time[1][4].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[1][4].getA().set(Calendar.MINUTE, 45);
		time[1][5].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[1][5].getA().set(Calendar.MINUTE, 20);
		time[1][6].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[1][6].getA().set(Calendar.MINUTE, 40);
		time[1][7].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[1][7].getA().set(Calendar.MINUTE, 10);
		
		time[2][0].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[2][0].getA().set(Calendar.MINUTE, 00);
		time[2][1].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[2][1].getA().set(Calendar.MINUTE, 55);
		time[2][3].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[2][3].getA().set(Calendar.MINUTE, 10);
		time[2][4].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[2][4].getA().set(Calendar.MINUTE, 55);
		time[2][5].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[2][5].getA().set(Calendar.MINUTE, 30);
		time[2][6].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[2][6].getA().set(Calendar.MINUTE, 40);
		time[2][7].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[2][7].getA().set(Calendar.MINUTE, 10);
		
		time[3][0].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[3][0].getA().set(Calendar.MINUTE, 45);
		time[3][1].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[3][1].getA().set(Calendar.MINUTE, 00);
		time[3][2].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[3][2].getA().set(Calendar.MINUTE, 10);
		time[3][4].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[3][4].getA().set(Calendar.MINUTE, 10);
		time[3][5].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[3][5].getA().set(Calendar.MINUTE, 55);
		time[3][6].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[3][6].getA().set(Calendar.MINUTE, 00);
		time[3][7].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[3][7].getA().set(Calendar.MINUTE, 55);
		
		time[4][0].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[4][0].getA().set(Calendar.MINUTE, 15);
		time[4][1].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[4][1].getA().set(Calendar.MINUTE, 45);
		time[4][2].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[4][2].getA().set(Calendar.MINUTE, 55);
		time[4][3].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[4][3].getA().set(Calendar.MINUTE, 10);
		time[4][5].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[4][5].getA().set(Calendar.MINUTE, 35);
		time[4][6].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[4][6].getA().set(Calendar.MINUTE, 25);
		time[4][7].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[4][7].getA().set(Calendar.MINUTE, 35);
		
		time[5][0].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[5][0].getA().set(Calendar.MINUTE, 45);
		time[5][1].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[5][1].getA().set(Calendar.MINUTE, 20);
		time[5][2].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[5][2].getA().set(Calendar.MINUTE, 30);
		time[5][3].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[5][3].getA().set(Calendar.MINUTE, 55);
		time[5][4].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[5][4].getA().set(Calendar.MINUTE, 34);
		time[5][6].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[5][6].getA().set(Calendar.MINUTE, 47);
		time[5][7].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[5][7].getA().set(Calendar.MINUTE, 57);
		
		time[6][0].getA().set(Calendar.HOUR_OF_DAY, 3);
		time[6][0].getA().set(Calendar.MINUTE, 15);
		time[6][1].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[6][1].getA().set(Calendar.MINUTE, 40);
		time[6][2].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[6][2].getA().set(Calendar.MINUTE, 42);
		time[6][3].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[6][3].getA().set(Calendar.MINUTE, 00);
		time[6][4].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[6][4].getA().set(Calendar.MINUTE, 25);
		time[6][5].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[6][5].getA().set(Calendar.MINUTE, 45);
		time[6][7].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[6][7].getA().set(Calendar.MINUTE, 25);
		
		time[7][0].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[7][0].getA().set(Calendar.MINUTE, 35);
		time[7][1].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[7][1].getA().set(Calendar.MINUTE, 10);
		time[7][2].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[7][2].getA().set(Calendar.MINUTE, 05);
		time[7][3].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[7][3].getA().set(Calendar.MINUTE, 55);
		time[7][4].getA().set(Calendar.HOUR_OF_DAY, 2);
		time[7][4].getA().set(Calendar.MINUTE, 35);
		time[7][5].getA().set(Calendar.HOUR_OF_DAY, 1);
		time[7][5].getA().set(Calendar.MINUTE, 57);
		time[7][6].getA().set(Calendar.HOUR_OF_DAY, 0);
		time[7][6].getA().set(Calendar.MINUTE, 25);
	}
	
	public void enter()
	{
		System.out.print("We have flights connecting: ");
		for ( int i=0 ; i< count-1; ++i)
			System.out.print(cty[i]+",");
		System.out.println(cty[count-1]);
	}
	
	//INITIAL DATA
	public void initialize()
	{
		Node temp; int x=0,y=0,x1=0,y1=0;
		
		int id=10;
		for( int v=0; v<=2 ; ++v)
		{
			id+=10; 
			for(int i=0;i<count;i++)
			{
				for(int j=0;j<count;j++)
				{
					if(!(i==j))
					{
						id+=1;
						x=(int)Math.floor(Math.random()*24); 
						y=x +time[i][j].getA().get(Calendar.HOUR_OF_DAY); 
						x1=(int)Math.floor(Math.random()*60); 
						y1=x1+time[i][j].getA().get(Calendar.MINUTE);
						Calendar d1= Calendar.getInstance();
						d1.set(2015, 1, 1, x, x1, 0) ;
						Calendar d2= Calendar.getInstance();
						d2.set(2015, 1, 1, y, y1, 0);
						Flight f1 = new Flight("6E4"+id,30,cty[i],cty[j],d1,d2);
						temp = new Node(f1);
						gr[i][j].insert(temp);
					}
				}
			}
		}
	}
	
	//DISPLAY OF ALL FLIGHTS FROM A CITY
	public JLabel disp(String s,javax.swing.table.DefaultTableModel model)
	{
		javax.swing.JLabel data = new JLabel();
                data.setText("<html>");
                System.out.println("\n\nAIRPORTS:");
		for(int i=0; i<count;++i)
			System.out.println((i+1)+". "+cty[i]);
		System.out.println("Enter Departure city: ");
		//String s =sc.next();
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref=i;
		}
		if(ref==-1){
                    data.setText(data.getText()+"Invalid City Input!</html>");
                    System.out.println("Invalid City Input!");
                }
		else
		{
			for (int i=0; i<count; ++i)
			{
                                System.out.println("FLIGHTS FROM "+cty[ref]);
				if (gr[ref][i]!=null)
				{
                                        data.setText(data.getText()+"ARRIVAL CITY: "+cty[i]+"</br>");
					System.out.println("ARRIVAL CITY: "+cty[i]+"\n");
					gr[ref][i].display(model);  
				}
			}
		}
                return data;
	}
	
	//DISPLAY OF ALL FLIGHTS TO A CITY
	public void disp2(String s,javax.swing.table.DefaultTableModel model)
	{
		
		System.out.println("\n\nAIRPORTS:");
		for(int i=0; i<count;++i)
			System.out.println((i+1)+". "+cty[i]);
		System.out.println("\nEnter city: ");
		//String s =sc.next();
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref=i;
		}
		if(ref==-1)
			System.out.println("Invalid Arrival City Input!");
		else
		{
			for (int i=0; i<count; ++i)
			{
				System.out.println("FLIGHTS to "+cty[ref]);
				if (gr[i][ref]!=null)
				{
					System.out.println("DEPARTURE CITY: "+cty[i]+"\n");
					gr[i][ref].display(model);  
				}
			}
		}
	}
	
	//DISPLAY OF ALL FLIGHTS FROM A CITY TO A CITY
	public void disp3(String s,String d,javax.swing.table.DefaultTableModel model)
	{
		
		System.out.println("\n\nAIRPORTS:");
		for(int i=0; i<count;++i)
			System.out.println((i+1)+". "+cty[i]);
		System.out.println("\nEnter Arrival city: ");
		//String s =sc.next();
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref=i;
		}
		System.out.println("Enter Departure city: ");
		s =d;
		int ref1=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref1=i;
		}
		if(ref == -1 || ref1 == -1)
			System.out.println("Invalid City Input!");
		else
		{
			if (gr[ref1][ref]!=null && ref!=ref1)
				{	
					System.out.println("FLIGHTS FROM "+cty[ref1]+" TO "+cty[ref]);
					gr[ref1][ref].display(model);  
				}
			
		}
	}
	
	//ADD A FLIGHT
	public String AddFlight(String dept,String arr,String id,int hr,int min,int seats)
	{
		String status="";
                System.out.println("HELLO ADMIN!\nYou may now add a flight.\n");
		System.out.println("\n\nAIRPORTS:");
		for(int i=0; i<count;++i)
			System.out.println((i+1)+". "+cty[i]);
		
		System.out.println("\nEnter Arrival city: ");
		//String s =sc.next();
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(arr))		//checking if entered airport exists
				ref=i;
		}
		System.out.println("Enter Departure city: ");
		//s =sc.next();
		int ref1=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(dept))		//checking if entered airport exists
				ref1=i;
		}
		if(ref == -1 || ref1 == -1)
			{   status="Invlid City Input";
                            System.out.println("Invalid City Input!");}
		else
		{
			if (gr[ref1][ref]!=null)
			{
				gr[ref1][ref].insert2(cty[ref1], cty[ref], time[ref1][ref].getA(),id,hr,min,seats);  
                                status="Flight added successfully!";
                        }
			
		}
		return status;
	}
	
	//DELETE A FLIGHT
	public void deleteFlight(String s,String arr,String id,javax.swing.JLabel jb)
	{
		System.out.println("HELLO ADMIN!\nYou may now delete a flight.\n");
		System.out.println("Enter Departure city: ");
		//String s= sc.next();
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref=i;
		}
		System.out.println("\nEnter Arrival city: ");
                
		s =arr;
		int ref1=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref1=i;
		}
		
		if(ref == -1 || ref1 == -1){
			System.out.println("INVALID INPUT!");
                        jb.setText("INVALID INPUT!");
                }
		else
		{
			
			if (gr[ref][ref1]!=null)
			{
//				gr[ref][ref1].display();  
			}
			if (gr[ref][ref1]!=null)
			{
				System.out.println("Enter ID: ");
				//s=sc.next();
				gr[ref][ref1].delete(id);
			}
//			gr[ref][ref1].display();
		}
	}
	
	
	//BOOK A SEAT IN A FLIGHT
	public String bookSeat(String dept,String arr,String id,String n,int a,String p,String sex)
	{
		System.out.println("\n\nHELLO!\nYou may now book a seat on any flight.\n");
		System.out.println("Enter Departure city: ");
		String s= dept;
                String output="";
		int ref=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref=i;
		}
		System.out.println("\nEnter Arrival city: ");
		s =arr;
		int ref1=-1;
		for (int i=0; i<count; ++i)
		{
			if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
				ref1=i;
		}
		
		if(ref == -1 || ref1 == -1)
			System.out.println("INVALID INPUT!");
		else
		{
			
			if (gr[ref][ref1]!=null)
			{
//				gr[ref][ref1].display();  
			}
			if (gr[ref][ref1]!=null)
			{
				System.out.println("Enter ID: ");
				s=id;
				output=gr[ref][ref1].reserve(s,n,a,p,sex);
			}
			//gr[ref][ref1].display();
		}
                return output;
	}
        //CANCEL A RESERVATION ON A FLIGHT
    public String cancelSeat(String dept,String arr,String id,String n)
    {
        String output="";
        System.out.println("\n\nHELLO!\nYou may now cancel a reservation on any flight.\n");
        System.out.println("Enter Departure city: ");
        String s= dept;
        int ref=-1;
        for (int i=0; i<count; ++i)
        {
            if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
                ref=i;
        }
        System.out.println("\nEnter Arrival city: ");
        s =arr;
        int ref1=-1;
        for (int i=0; i<count; ++i)
        {
            if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
                ref1=i;
        }
        
        if(ref == -1 || ref1 == -1){
            System.out.println("INVALID INPUT!");
            output+="INVALID INPUT!<br>";
        }
        else
        {
            
            if (gr[ref][ref1]!=null)
            {
 //               gr[ref][ref1].display();
            }
            if (gr[ref][ref1]!=null)
            {
                System.out.println("Enter ID: ");
                s=id;
                output+=gr[ref][ref1].reserveBack(s,n);
            }
            //gr[ref][ref1].display();
        }
        return output;
    }

    //GET LIST OF PASSENGERS ON A SPECIFIC FLIGHT
    public void getList(String dept,String arr,String id,javax.swing.table.DefaultTableModel model)
    {
        System.out.println("\n\nGet List For A Specific Flight\n");
        System.out.println("Enter Departure city: ");
        String s= dept;
        int ref=-1;
        for (int i=0; i<count; ++i)
        {
            if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
                ref=i;
        }
        System.out.println("\nEnter Arrival city: ");
        s =arr;
        int ref1=-1;
        for (int i=0; i<count; ++i)
        {
            if(cty[i].equalsIgnoreCase(s))		//checking if entered airport exists
                ref1=i;
        }
        
        if(ref == -1 || ref1 == -1)
            System.out.println("INVALID INPUT!");
        else
        {
            
            if (gr[ref][ref1]!=null)
            {
  //              gr[ref][ref1].display();
            
                System.out.println("Enter ID: ");
                s=id;
                gr[ref][ref1].allPass(s,model);
            }
        }


        
    }
				
}