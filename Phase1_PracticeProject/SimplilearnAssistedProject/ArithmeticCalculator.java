 package Simplilearn.com;
 import java.util.Scanner;
 public class ArithmeticCalculator {
	public static void main(String[] args) {
		   
 @SuppressWarnings("resource")
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter First Number");
 
 double number1=sc.nextDouble();
 System.out.println("please select operator method : + - * % " );	
 
 char choice=sc.next().charAt(0);
 System.out.println("Enter Second Number");	
 
 double number2=sc.nextDouble();
 double result=0.0;
		
 switch(choice)
{
 case '+':
 result=number1+number2;
 System.out.println(result);
        break;
			
 case '-':
	result=number1-number2;
	System.out.println(result);
		break;
			
 case '*':
		result=number1*number2;
		System.out.println(result);
		break;
			
 case '/':
		result=number1/number2;
		System.out.println(result);
		break;
			
		default:
	System.out.println("Invalid operator");
		break;
					
			
		}
				
	}

}

