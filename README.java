import java.io.*;
import java.util.*;
class Check
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
                   int b=input.nextInt();
	int flag=0;
	int arr[]=new int[a];      
	for(int i=0;i<a;i++)
	{
		arr[i]=input.nextInt();
		System.out.println("");
	}
	
	for(int j=0;j<a;j++)
	{
		if(arr[j]==b)
		{
			flag=1;
		}	
	}
	if(flag==1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
  }
}
	
