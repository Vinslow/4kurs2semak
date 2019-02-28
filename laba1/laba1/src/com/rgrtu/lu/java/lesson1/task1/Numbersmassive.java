package com.rgrtu.lu.java.lesson1.task1;

public class Numbersmassive 
{

   public static void main(String[] args) 
   {
	   Numbersmassive app = new Numbersmassive();
	   app.startMassiveWork();
   }
	
   public void startMassiveWork() 
   {
	   int start = -10;
	   int end = 20;
	   int[] numbers = new int[20];
	   for (int i = 0; i < numbers.length; i++) 
	   {
		   numbers[i] = start + (int)(Math.random()*end);
	   }
	   int summa = finderSum(numbers);
	   print(numbers, summa);
   }
   
   public int finderSum(int[] numbers) 
   {
	   int sum = 0;
	   for (int i = 0; i < numbers.length;i++) 
	   {
		   if ((i % 2) != 0) 
		   {
			   sum += numbers[i];
		   }  
	   }
	   return sum;
   }
	   
   public void print(int[] numbers, int summa) 
   {
	   for (int i = 0; i < numbers.length; i++)
	   {
		   System.out.print(numbers[i] + " ");
	   }
	   System.out.println();
	   System.out.println(summa + " - сумма чисел на четных местах.");
   }
}
