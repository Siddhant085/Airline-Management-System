package source;

import java.util.*;
public class Flight
{
	//DATA MEMBERS
	private String id;
	private int size;
	private String from;
	private String to;
	private Calendar dept;
	private Calendar arvl;
	public Passenger[] reservation;
	public int pas;

	
	
	//CONSTRUCTOR
	Flight(String idd, int sz, String fr, String t, Calendar dep, Calendar ar)
	{
		this.id=idd;
		this.size=sz;
		this.from=fr;
		this.to=t;
		this.dept=dep;
		this.arvl=ar;
		this.reservation= new Passenger[sz];
		for(int i=0; i<size; ++i)
			reservation[i]=null;
		this.pas=0;
	}
	
	Flight()
	{
		this.init();
		
	}
	
	Flight(String d, String a, Calendar art,String id,int hr,int min,int seats)
	{
		this.init(d,a,art,id,hr,min,seats);
		
	}
	//TO INITIALIZE (INPUTS FROM USER)
	public void init()
	{
		
		dept=Calendar.getInstance();
		arvl=Calendar.getInstance();
		dept.set(Calendar.YEAR,2015);
		dept.set(Calendar.MONTH,1);
		dept.set(Calendar.DAY_OF_MONTH,1);
		arvl.set(Calendar.YEAR,2015);
		arvl.set(Calendar.MONTH,1);
		arvl.set(Calendar.DAY_OF_MONTH,1);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ID: ");
		this.setId(sc.next());
		
		System.out.print("Enter Departure City: ");
		this.setFrom(sc.next());
		System.out.print("Enter Arrival City: ");
		this.setTo(sc.next());
		
		System.out.println("Enter Departure Time: ");
		System.out.print("Enter hours: ");
		int hr=sc.nextInt();
		dept.set(Calendar.HOUR_OF_DAY, hr);
		System.out.print("Enter mins: ");
		int min=sc.nextInt();
		dept.set(Calendar.MINUTE, min);
		
		System.out.println("Enter Arrival Time: ");
		System.out.print("Enter hours: ");
		hr=sc.nextInt();
		arvl.set(Calendar.HOUR_OF_DAY, hr);
		System.out.print("Enter mins: ");
		min=sc.nextInt();
		arvl.set(Calendar.MINUTE, min);
		System.out.print("Enter number of total seats: ");
		this.size=sc.nextInt();
		this.reservation= new Passenger[size];
		for(int i=0; i<size; ++i)
			reservation[i]=null;
		this.pas=0;
		
	}
	public void init(String d, String a, Calendar art,String id,int hr,int min,int seats)
	{
		
		dept=Calendar.getInstance();
		arvl=Calendar.getInstance();
		dept.set(Calendar.YEAR,2015);
		dept.set(Calendar.MONTH,1);
		dept.set(Calendar.DAY_OF_MONTH,1);
		arvl.set(Calendar.YEAR,2015);
		arvl.set(Calendar.MONTH,1);
		arvl.set(Calendar.DAY_OF_MONTH,1);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ID: ");
	//	my.Package.Client.obj.
                this.setId(id);
		
		this.setFrom(d);
		this.setTo(a);
		
		System.out.println("Enter Departure Time: ");
		System.out.print("Enter hours: ");
		//int hr=sc.nextInt();
		dept.set(Calendar.HOUR_OF_DAY, hr);
		System.out.print("Enter mins: ");
		//int min=sc.nextInt();
		dept.set(Calendar.MINUTE, min);
		
		arvl.set(Calendar.HOUR_OF_DAY, (dept.get(Calendar.HOUR_OF_DAY)+ art.get(Calendar.HOUR_OF_DAY)));
		arvl.set(Calendar.MINUTE, (dept.get(Calendar.MINUTE)+ art.get(Calendar.MINUTE)) );
		System.out.print("Enter number of total seats: ");
		this.size=seats;
		this.reservation= new Passenger[size];
		for(int i=0; i<size; ++i)
			reservation[i]=null;
		this.pas=0;
		
	}
		
	
	//GETTERS
	public String getId(){return id;}
	public int getSize(){return size;}
	public String getFrom(){return from;}
	public String getTo(){return to;}
	public Calendar getDept(){return dept;}
	public Calendar getArvl(){return arvl;}
	public Passenger[] getReservation(){return reservation;}	
	//SETTERS
	public void setId(String i) {id=i;}
	public void setSize(int s) {size=s;}
	public void setFrom(String f) {from=f;}
	public void setTo(String t) {to=t;}
	public void setDept(int h,int m) {dept.set(Calendar.HOUR_OF_DAY, h); dept.set(Calendar.MINUTE, m); }
	public void setReservation(Passenger[] r) {reservation=r;}
        public void setArvl(int h,int m) {arvl.set(Calendar.HOUR_OF_DAY, h); arvl.set(Calendar.MINUTE, m); }
		
	

}
