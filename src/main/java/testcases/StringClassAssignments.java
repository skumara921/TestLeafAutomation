package testcases;

import java.util.Arrays;

import org.testng.annotations.Test;

public class StringClassAssignments {
	static int a=9; //any latest changes to this variable in the program, will be updated to the static variable and that will be the final value supplied
//	int a = 9;// any latest changes to this variable, will not be updated here if it done by object level.. it is maintains it value. each object maintains its own copy.
	@Test //Assignment 
	public void instanceMethod()
	{
		
		StringClassAssignments sca1 = new StringClassAssignments();
		StringClassAssignments sca2 = new StringClassAssignments();
		sca1.a=5;
		sca2.a=7;
//		a=10;
		System.out.println("Obj1 a value is: "+sca1.a);
		System.out.println("Obj2 a value is: "+sca2.a);
		System.out.println("a value is: "+a);
		
//		a = 10;
//		System.out.println(a);
	}
	
	@Test//3rd assignment
	public void stringConcat()
	{
		String str1 = "ChintuKumaran";
		String str2 = "*";
		
//		int str1Len = str1.length();
		System.out.println(str1.substring(0, 6));
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 6)+str2+str1.substring(6));
	}
	
	@Test//4thAssignments
	public void stringReverse()
	{
		String str1 = "ChintuKumaran", temp="";	
		int str1Len = str1.length();
		for(int i=str1Len-1;i>=0;i--)
		{
//			System.out.print(str1.charAt(i));
			temp = temp+str1.charAt(i);
		}
		System.out.println(temp);
		char[] chars = str1.toCharArray();
		for(int i=str1Len-1;i>=0;i--)
		{
//			System.out.print(chars[i]);
			temp = temp+chars[i];
		}
		System.out.println(temp);
//		for (char c : chars) {
//			temp = temp+(chars.length);
//		}
//		System.out.println(temp);
	}
	@Test//7th assignments
	public void findDuplicates()
	{
		String str1 = "ALLLLIISSWellW", finalVal ="";
		int count=0;
		for(int i =0;i<str1.length();i++)
		{
			for(int j=i+1;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
					{
						count++;
					}
			}
			if(count == 0)
			{
				finalVal=finalVal+str1.charAt(i);
			}
			count=0;
		}
		System.out.println(finalVal);
	}
	
	
	@Test//8th Assignment
	public void printAlphaNumSplChars()
	{
		String str1 = "All(is34*_5wel!@#$8K9eep";
		String numbers = "", alpha="", splChars="";
		char[] charArray = str1.toCharArray();
		for(char c: charArray)
		{
			if(Character.isDigit(c)) 
			{
				numbers = numbers+c;
			}
			else if(Character.isAlphabetic(c))
			{
				alpha = alpha+c;
			}
			else
			{
				splChars = splChars+c;
			}
		}
		System.out.println("Numbers from the given strings are: "+numbers);
		System.out.println("Alphabets from the given strings are: "+alpha);
		System.out.println("Special Characters from the given strings are: "+splChars);
//		for(int i=0;i<str1.length();i++)
//		{
//			char charA = str1.charAt(i);
//			if(Character.isDigit(charA))
//			{
//				numbers = numbers+charA;
//			}else if(Character.isAlphabetic(charA))
//			{
//				alpha = alpha+charA;
//			}else
//			{
//				splChars = splChars+charA;
//			}
//		}
	}
	
	@Test
	public void numberOfOccurance()
	{
		String str = "I am a wonderful person";
		String str1 = str.toLowerCase();
		int count =0;
		char[] charArray = str1.toCharArray();
		for(char i = 'a';i<='z';i++)
		{
			for(char c: charArray)
			{
				if(c==i)
				{
					count+=1;
				}
			}
			if(count!=0)
			{
				System.out.println(i+" is appread "+count+" times");
				count=0;
			 }
		  }
		}	
	@Test
	public void anagrams()
	{
		String str1 = "Listen", str2="Silnnt";
		boolean flag;
		if(str1.length() != str2.length())
		{
			flag = false;
		}
		else
		{
			str1 = str1.toUpperCase();
			str2 = str2.toUpperCase();
			char[] charArr1 = str1.toCharArray();
			char[] charArr2 = str2.toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			flag = Arrays.equals(charArr1, charArr2);
		}
		if(flag == true)
		{
			System.out.println("Given words are Anagrams");
		}
		else
		{
			System.out.println("Given words are not Anagrams");
		}
		
		
	}
	
}
