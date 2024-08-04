package basicJava;
import java.util.Scanner;

public class loops {
	Scanner sc=new Scanner(System.in);
	
//print table Using For lOOP
	void printTable() {
		System.out.println("Give a number which you want to print a table");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
//print table using while loop
	void printTableWithWhile() {
		System.out.println("Give a number which you want to print a table");
		int n=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
	}
//print table using do-while loop
	void printTableWithDoWhile() {
		System.out.println("Give a number which you want to print a table");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println(n*i);
			i++;
		}while(i<=10);
	}
	
	void checkPrime() {
		System.out.println("Give a number you check prime or not");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++){
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" not prime number");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops l=new loops();
		//l.printTable();
		//l.printTableWithWhile();
		//l.printTableWithDoWhile();
		l.checkPrime();

	}

}
