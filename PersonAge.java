package Assessment1;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		
	
	int age=5;
		int children=0;
		int Adult=0;
		int seniorcitizen=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
	
	    int age1=sc.nextInt();
	
	    int a[]=new int[age];
	
	   System.out.println("Enter age");
	
	for(int i=0;i<age;i++)
	{
		a[i]=sc.nextInt();
	}
		
	for(int j=0;j<a.length;j++)
	{
		
       if(a[j]<=18)
		{
			System.out.println("It is children");
		   children++;
		}
		
		else if(a[j]>=18 && a[j]==54)
		{
			System.out.println("It is Adult");
			Adult++;
	}
	
	
	else 
	{
		
	System.out.println("it is seniorcitizen");
		seniorcitizen++;
	}
	
		
		System.out.println("Number of children is "+children);
	
	System.out.println("Number of Adult is "+Adult);
	
	System.out.println("Number of senior citizen is "+seniorcitizen);
	}

}
}
