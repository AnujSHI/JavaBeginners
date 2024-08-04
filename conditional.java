package basicJava;

import java.util.*;

public class conditional {
	Scanner sc=new Scanner(System.in);
	void isEven() {
		System.out.print("Give a number to check odd even :");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	void findGreater() {
	System.out.println("give two numbers for comparision: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b) {
		System.out.println("greater and value is: "+a);
	}else if(b>a){
		System.out.println("greater and value is: "+b);
	}else {
		System.out.println("Both are same "+a+"="+b);
	}
	}
	
	void printGreeting() {
		
		System.out.println("press number b/t 1-3 for Greeting");
		int but=sc.nextInt();
		if(but==1) {
			System.out.println("Hello");
		}else if(but==2) {
			System.out.println("Namaste");
		}else if(but==3){
			System.out.println("Bonjour");
		}else {
			System.out.println("invalid");
		}
	}
	
	//by using switch statement
	
	void printGreeting2() {
		System.out.println("press number b/t 1-3 for Greeting");
		int but=sc.nextInt();
		switch(but) {
		case 1:
			System.out.println("Hello");
			
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("invalid");
		}
	}
	
	void calculator() {
		System.out.println("Welcome to my Calculater");
		System.out.println("give number 1");
		int x=sc.nextInt();
		System.out.println("click 1 to Addition");
		System.out.println("click 2 to subtract");
		System.out.println("click 3 to multiply");
		System.out.println("click 4 to division");
		System.out.println("click 5 to get remainder");
		int oprator=sc.nextInt();
		System.out.println("give number 2");
		int y=sc.nextInt();
		switch(oprator) {
		case 1:
			System.out.println("You clicked 1 for Addition And your result is:"+(x+y));
			break;
		case 2:
			System.out.println("You clicked 2 for Sub And your result is:"+(x-y));
			break;
		case 3:
			System.out.println("You clicked 3 for Mult And your result is:"+(x*y));
			break;
		case 4:
			System.out.println("You clicked 4 for Div And your result is:"+(x/y));
			break;
		case 5:
			System.out.println("You clicked 5 for Rem And your result is:"+(x%y));
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	
	void printMonth() {
		System.out.println("Give number to print a month name According number 1-12");
		int m=sc.nextInt();
		switch(m) {
		case 1:
			System.out.println("Month is JANY");
			break;
		case 2:
			System.out.println("Month is FEB");
			break;
		case 3:
			System.out.println("Month is MAR");
			break;
		case 4:
			System.out.println("Month is APR");
			break;
		case 5:
			System.out.println("Month is MAY");
			break;
		case 6:
			System.out.println("Month is JUNE");
			break;
		case 7:
			System.out.println("Month is JULY");
			break;
		case 8:
			System.out.println("Month is AUG");
			break;
		case 9:
			System.out.println("Month is SEP");
			break;
		case 10:
			System.out.println("Month is OCT");
			break;
		case 11:
			System.out.println("Month is NOV");
			break;
		case 12:
			System.out.println("Month is Dec");
			break;
		default:
			System.out.println("Invalid number ");	
		}
		
		
	}
	

	public static void main(String[] args) {
		conditional c=new conditional();
		//c.isEven();
		//c.findGreater();
		//c.printGreeting2();
		//c.calculator();
		c.printMonth();

	}
	

}
