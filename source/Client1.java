package source;


//JAVA PACKAGES
import java.util.*;
import java.io.*;

public class Client1
{
	
	//DATA MEMBERS
	static String [] admin = {"ShivangiS","SiddhantG","SkandaS"};
	static String [] pswd = {"01fb14ecs225","01fb14ecs240","01fb14ecs242"};
	public static int adminL = admin.length;
	public static int pswdL = pswd.length;
	public static Graph gr= new Graph();
	
	public static Scanner sc= new Scanner(System.in);	
	
	//FUNCTION FOR MAIN MENU
	public static void mainM()
	{
		//FOR CLEAR SCREEN
		System.out.print("\u001b[2J");
		System.out.flush();
		System.out.println("WELCOME TO INDIGO!!!");
		gr.enter();
		System.out.println("\n");
		System.out.println("SYSTEM FOR ADMINISTRATION OF INDIGO...");
		System.out.print("1.Login for Existing Admin\n2.Sign-Up for new Admin\n3.Exit\n\nEnter choice: ");
		int y=sc.nextInt();
		
		if(y==1)
		{
//			logA();
		
		}
		
		else if(y==2)
		{	
			admn();
			System.out.println("You're now registered on Indigo Admin System.");
//			logA();
			
		}
		
		else if(y==3)
		{	
			System.out.println("EXITTING!");
			System.exit(0);
			
		}
		
		else
		{
			System.out.println("Invalid Input!");
			mainM();
		}
		
	}
	//FUNCTION FOR NEW ADMIN CREATION IN RECORD
	public static void admn()
	{
		//FOR CLEAR SCREEN
		System.out.print("\u001b[2J");
		System.out.flush();
		System.out.println("\n\n------------Welcome new Admin!------------\nPlease complete formalities of Sign-Up that follow...");
		System.out.print("\nEnter new Admin Name: ");
		String s=sc.next();
		String [] adm= new String[++adminL];
		for(int i=0; i<adminL-1; ++i)
		{	
			adm[i]=admin[i];
		}
		adm[adminL-1]=s;
		admin=adm;
		
		System.out.print("Enter password new Admin "+s+": ");
		String p=sc.next();
		String [] pwd= new String[++pswdL];
		for(int i=0; i<pswdL-1; ++i)
		{	
			pwd[i]=pswd[i];
		}
		pwd[pswdL-1]=p;
		pswd=pwd;
	}
	
	//FUNCTION FOR ACTIONS POST LOGIN OF ADMIN
	public static void postLog()
	{	String cho=""; int ch;
		//FOR CLEAR SCREEN
		System.out.print("\u001b[2J");
		System.out.flush();
		do
		{
			System.out.println("\n\n------------ WELCOME ADMIN ------------\n\n    OPEARTIONS:\n1.Display all flights leaving from a given airport\n2.Display all flights reaching a given airport\n3.Search for flights from given Departure city to given Arrival City\n4.Add a flight\n5.Remove a flight\n6.Book a seat on a flight\n7.Cancel reservation for a given flight\n8.Sign Out\n");
			System.out.print("Enter Choice: ");
			ch= sc.nextInt();
			switch(ch)
			{
						
						case 1://gr.disp();
							break;
						case 2://gr.disp2();
							break;
						case 3://gr.disp3();
							break;
						case 4://gr.AddFlight();
							break;
						case 5://gr.deleteFlight();
							break;
						case 6://gr.bookSeat();
							break;
						case 7:
						case 8:System.out.println("\n");
							//System.exit(0);
							break;
						
						default:System.out.println("Invalid Input");
							
			}
			if(ch!=8)
			{
				System.out.print("Do you want to continue?(y/n) :");
				cho=sc.next();
			}
		}while(cho.equalsIgnoreCase("y") &&ch !=8);
		System.out.println("------------SIGNING OUT!------------\n\n");
		mainM();
	}
	
	//FUNCTION FOR LOGIN OF EXISTING ADMIN AND PASSWORD CHECKING
	public static String logA(String name,String pwd)
	{
		String status="";
                //FOR CLEAR SCREEN
		System.out.print("\u001b[2J");
		System.out.flush();
		System.out.print("------------LOGIN------------\nEnter Admin Name: ");
	//	String name=sc.next();
		boolean found=false; int fo=-1;
	//	String pwd="";
		String cho="";
		for(int i=0; i<admin.length; ++i)
		{
			if(name.equalsIgnoreCase(admin[i]))
			{
				found=true;
				System.out.print("\n\tHello "+admin[i]+",\nEnter Password: ");
				//pwd=sc.next();
				fo=i;
			}
		}
		if(!found)
			status="NO SUCH ADMIN IN RECORD!";
		if(found)
		{	
			if(pswd[fo].equals(pwd))
			{
				status="Welcome "+admin[fo];
                               // postLog();
                                
				
			}
			
			
			else
			{
				status="Invalid Password for "+admin[fo];
				//mainM();
			}
		}
		return status;
	}
		
		
		
		
	//main() FUNCTION
	public static void main(String [] args)
	{
		/*System.out.println("WELCOME TO INDIGO!!!");
		gr.enter();
		System.out.println("\n");
		System.out.println("SYSTEM FOR ADMINISTRATION OF INDIGO...");
		System.out.print("1.Login for Existing Admin\n2.Sign-Up for new Admin\nEnter choice: ");
		int y=sc.nextInt();
		
		if(y==1)
		{
			logA();
		
		}
		
		else if(y==2)
		{	
			admn();
			System.out.println("You're now registered on Indigo Admin System.");
			logA();
			
		}
		
		else
			System.out.println("Invalid Input!");*/
		
		mainM();
			
	}
			
		

}