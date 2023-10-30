package assignment.work.nw;

import java.util.Scanner;

public class Pangram {
	
	public static void pangram(String str)
	{
		String check=str.toLowerCase();
		int count=0;
		String compare="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<compare.length();i++)
		{
			for(int j=0;j<check.length();j++)
			{
				if(compare.charAt(i)==check.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		if(count==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		}
	}

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter the string");
		String str=src.nextLine();
        pangram(str);
	}

}
