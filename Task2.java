import java.util.Scanner;
class Task2
{
	int id,size1,size2;
	String name;
	float percent;
	int sum=0,sum1=0,sum2=0; 

	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter name:");
		name=scan.nextLine();
		System.out.println("\nEnter id:");
		id=scan.nextInt();
		System.out.println("\nEnter the number of theory subjects:");
		size1=scan.nextInt();
		System.out.println("\nEnter the number of practical subjects:");
		size2=scan.nextInt();
	}
	void total()
	{
		int tmarks[]=new int[size1];
		int pmarks[]=new int[size2];

		Scanner scan=new Scanner(System.in);

		System.out.print("\nEnter marks of each theory subject: ");
		for(int i=0;i<tmarks.length;i++)
			tmarks[i]=scan.nextInt();
	
		System.out.print("\nEnter marks of each practical subject: ");
		for(int i=0;i<pmarks.length;i++)
			pmarks[i]=scan.nextInt();

		for(int i=0;i<tmarks.length;i++)
			sum1=sum1+tmarks[i];
		
		for(int i=0;i<pmarks.length;i++)
			sum2=sum2+pmarks[i];
		
		sum=sum1+sum2;
		}

	void percent()
	{
		percent=((sum)/(float)(size1+size2));
		
	}
 	void grade()
	{
		if(percent>=75)
			System.out.println("Grade = Distinction");
		else if(percent>=60)
			System.out.println("Grade = I Division");
		else if(percent>=48)
			System.out.println("Grade = II Division");
		else if(percent>=33)
			System.out.println("Grade = III Division");
		else
			System.out.println("Grade = Fail");
	}

	void display()
	{
		System.out.println("\nName = " +name);
		System.out.println("Id = "+id );
		System.out.println("Total marks of theory subjects: "+sum1);
		System.out.println("Total marks of practical subjects: "+sum2);
		System.out.println("Total marks  = " + sum);
		System.out.println("Percentage = "+percent );
		
	}
	public static void main(String a[])
	{
		Task2 r1=new Task2();
		r1.input();
		r1.total();
		r1.percent();
		r1.display();
		r1.grade();
	}
}