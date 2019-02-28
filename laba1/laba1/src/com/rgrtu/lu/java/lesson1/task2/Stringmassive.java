package com.rgrtu.lu.java.lesson1.task2;
import java.util.Scanner;

public class Stringmassive 
{

	public static void main(String[] args) 
	{
		Stringmassive app = new Stringmassive();
		app.startMassiveWork();
	}
	
	
    public void startMassiveWork() 
    {
    	 Scanner in = new Scanner(System.in);
    	 System.out.print("Введите количество строк: ");
    	 int n = in.nextInt();
    	 in.nextLine();

    	 if (n <= 1) 
    	 {
    		System.out.print("Невозможно найти среднюю длину");
    		System.exit(0);
    	 }
    	 
    	 String[] words = inputWords(n, in);
    	 int sumLen = sumLength(words);
    	 averageStringLength(words, sumLen);
    	 in.close();
    }
    
    
    public String[] inputWords(int n, Scanner in)
    {
    	 String[] words = new String[n];
    	 for (int i=0; i < words.length; i++) 
    	 {
    	   	words[i] = in.nextLine();
    	 }
    	 
    	 return words;
    }
    
    public int sumLength(String[] words) 
    {
    	 int sumlen = 0;
    	 for (int i=0; i<words.length; i++) 
    	 {
    	    sumlen += words[i].length();   
    	 }
    	 
    	 return sumlen;
    }
    
    public void averageStringLength(String[] words, double sumlen) 
    { 	 
    	 double average = sumlen / words.length;
    	 for (int i = 0; i < words.length; i++) 
    	 {
    		if (words[i].length() > average) 
    		{
    			System.out.println(words[i] + " - длинна строки =  " + words[i].length());
    		}
    	 }
    }
}
