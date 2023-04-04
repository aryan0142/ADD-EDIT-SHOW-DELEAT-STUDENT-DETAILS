public class Students {
	
	
	String sname[]=new String[10];
	int rollno[]=new int[10];
	String mob[]=new String[10];
	String sname1=null,mob1=null;
	int rollno1,rno;
	int i=0,k;

	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	public void add(){
		System.out.println("Enter Student Details : ");
		
		System.out.println("Enter Student Name\t: ");
		sname[i]=sc.nextLine();
		sname[i]=sc.nextLine();
		System.out.println("Enter Student Rollno\t: ");
		rollno[i]=sc.nextInt();
		System.out.println("Enter Student Mobile number\t: ");
		mob[i]=sc.next();
		i++;
		start();
	}
	public void edit(){
		

		System.out.println("Student Rollno\t: ");
		rno=sc.nextInt();
		for (k=0;k<10;k++ ) {
			if (rollno[k]==rno) {
				System.out.println();
				System.out.println("1. name\t:"+sname[k]);
				System.out.println("2. Roll no\t:"+rollno[k]);
				System.out.println("3. Mobile\t:"+mob[k]);
				System.out.println("4. Exit");				
				System.out.println("Select Choice which is to be updated: ");
				int ch=sc.nextInt();
				switch (ch) {
					case 1: System.out.println("Student Name\t: ");
							sname1=sc.next();
							sname[k]=String.valueOf(sname1);
							start();
							break;
					case 2: System.out.println("Roll no\t: ");
							 rollno1=sc.nextInt();
							rollno[k]=rollno1;
							start();
							break;
					case 3: System.out.println("Mobile \t: ");
							mob1=sc.next();
							mob[k]=mob1;
							start();
							break;
					case 4: 
							System.exit(0);	
					default: System.out.println("INVALID CHOICE !");														
				}
			}
			
		}
		
	}
	public void delete()
	{
		System.out.println("Student Rollno\t: ");
		rno=sc.nextInt();
		for (k=0;k<10;k++ ) {
			if (rollno[k]==rno) {
				sname[k] = null;
				mob[k]= null;
				rollno[k]=0;
				start();
			}
			
		}
	}
	public void show(){
		System.out.println("Student Details : ");
		System.out.println("---------------------------------------------");
		System.out.println("Name\t\tRollno\t\t Mobile");
		System.out.println("---------------------------------------------");
		for (int j=0;j<10;j++ ) {
			System.out.println(sname[j]+"\t\t"+rollno[j]+"\t\t"+mob[j]);			
		}
		System.out.println("---------------------------------------------");
		start();
	}
	public void start(){
		System.out.println("Select Options: ");
		System.out.println("1. Add Student");
		System.out.println("2. Edit Student");
		System.out.println("3. Delete Student");
		System.out.println("4. Show Student");
		System.out.println("5. Exit");
		int ch=sc.nextInt();
		switch (ch) {
			case 1: add();
					break;
			case 2: edit();
					break;
			case 3: delete();
					break;
			case 4: show();
					break;	
			case 5: 
					break;
			default: System.out.println("INVALID CHOICE !");															
		}
	}


	
	
	

	public static void main(String[] args)
	{
		
				java.util.Scanner sc=new java.util.Scanner(System.in);
				Students sdb=new Students();
				sdb.start();
			}
	}
