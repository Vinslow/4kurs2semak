package com.rgrtu.lu.java.lesson1.task3;
import java.util.Scanner;

public class Calc 
{

	public static void main(String[] args) 
	{
		Calc app = new Calc();
		app.startCalc();
	}
	
	public void startCalc() 
	{
		double number1,number2,result;
		 Scanner in = new Scanner(System.in) ;
		 System.out.print("Введите первое число:");
		 number1 = in.nextDouble();
		 System.out.print("Введите второе число:");
		 number2 = in.nextDouble();
		 System.out.print("Введите операцию из доступных на данный момент (+,-,/,*):");
		 String operator = in.next();
		 in.close();

		 if (operator.equals("+")) 
		 {
			 result=sum(number1,number2);
			 System.out.println(result);
		 } 
		 else if (operator.equals("-")) 
		 {
			 result=diff(number1,number2);
			 System.out.println(result);
		 } 
		 else if (operator.equals("*")) 
		 {
			 result=multiply(number1,number2);
			 System.out.println(result);
		 } 
		 else if (operator.equals("/")) 
		 {
			 result=division(number1,number2);
			 System.out.println(result);
		 } 
		 else System.out.println("Неверная операция");
      
	}
	public double sum(double number1,double number2)
	{
		return number1 + number2;
	}
	
	public double diff(double number1,double number2)
	{
		return number1 - number2;
	}
	
	public double multiply(double number1,double number2)
	{
		return number1 * number2;
	}
	
	public double division(double number1,double number2)
	{
		return number1 / number2;
	}
		
}
