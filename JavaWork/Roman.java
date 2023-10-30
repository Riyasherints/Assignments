package assignment.work.nw;

import java.util.Scanner;

public class Roman {
	public static int chartoint(char a)
	{
		switch(a)
		{
		case'I':return 1;
		case'V':return 5;
		case'X':return 10;
		case'L':return 50;
		case'C':return 100;
		case'D':return 500;
		case'M':return 1000;
	    default:return -1;
		}
	}
	
	public static void romantoint(String roman) {
		int value=0,flag=0;
		for(int i=0;i<roman.length();i++)
		{
			int num1=chartoint(roman.charAt(i));
			if(num1!=-1)
			{
			if(i+1<roman.length())
			{
				int num2=chartoint(roman.charAt(i+1));
				if(num1>=num2)
				{
					value=value+num1;
				}
				else
				{
					value=value-1;
				}
			}
			else
			{
				value=value+num1;
			}
		  }
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		System.out.println(roman+": "+value);
		}
		else
		{
			System.out.println("invalid");
		}
	}

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter Roman letter");
		String roman=src.next();
        romantoint(roman);
	}

}
