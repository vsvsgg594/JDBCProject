package Stattter;

import java.util.Scanner;

import Db.Students;
import Db.StudnetsDao;

public class Star {
	public static void main(String[] args) {
		System.out.println("welcome to database program");
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("press 1 to add");
			System.out.println("press 2 to delete ");
			System.out.println("press 3 to display");
			System.out.println("press 4 to exit");
			int n=sc.nextInt();
			
			if(n==1)
			{
				   System.out.println("enter id ");
	                int id=sc.nextInt();
					System.out.println("enter user name");
					String name=sc.next();
					System.out.println("enter age");
					int age=sc.nextInt();
					
					Students std= new Students(id,name,age);
					
					boolean ans=StudnetsDao.insertDb(std);
					System.out.println(ans);
			}
		}
	}

}
