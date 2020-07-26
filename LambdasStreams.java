package com.epam.Lambdas_Streams; 
import java.util.function.Predicate; 
import java.io.*; 
import java.util.*;

class Palindrome 
{
  
	   public static boolean ispal(String s)
	   {
	       String reverse = new StringBuffer(s).reverse().toString();
	      if (s.equals(reverse))
	      return true;
	      else
	      return false;
	}
}

public class LambdasStreams
{ 
	public static void main(String args[]) 
	{ 
		String strArray[]={"america","arc","atlantic","india","madam","malayalam","add","ace","madam","malayalam","tit","tat"};
                List<Integer> list1=Arrays.asList(1,2,3,4,5,6);     
		List<String> list = Arrays.asList(strArray); 
        
	        average(list1);
                System.out.print("string which strats with 'a' and have length as 3 are:")
		System.out.println(lowercase_a(list,(String str) -> str.startsWith("a") && str.length()==3 ));
                System.out.print("Palindrome in the given String list are:")
                System.out.println(lower(list ,Palindrome::ispal));
	}
		

              public static void average(List<Integer> list1)
		{
                    int sum=0;
                    for(int i:list1)
                        sum+=i;
                    System.out.print("Average of the list is:");
                    System.out.println(sum/(list1.size()));   
		}

		public static List<String> lowercase_a(List<String> list,Predicate<String> predicate)
		{
		      List<String> list2=new ArrayList<String>();
		      for(String str:list)
		      {
		          if(predicate.test(str))
		          list2.add(str);
		      }
		       return (list2);  
		}

               public static List<String> lower(List<String> list,Predicate<String> predicate)
		{
		      List<String> list3=new ArrayList<>();

		      for(String str:list)
		      {
		          if(predicate.test(str))
		          list3.add(str);
		      }
		       return (list3);  		       
		}

} 
