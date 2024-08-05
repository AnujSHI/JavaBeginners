package basicJava;

import java.util.Scanner;

public class Array {
	
	void arrayDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give size of array:");
		int size=sc.nextInt();
		int [] age=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Give value of  your array index:"+i);
			age[i]=sc.nextInt();
//			System.out.println(age[i]);
		}
		System.out.print("Your array is :[");
		for(int i=0;i<size;i++) {
			System.out.print(" "+age[i]);
		}
		System.out.print(" ]");
	}
	
	void findIndex() {
		int []arr= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("give number You want search index:");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(n+"-> is at index:"+i);
			}
		}
	}
	//2-D Array
	void twoDArrayDemo() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give array size:");
		int s=sc.nextInt();
		System.out.println("Give size of sub array");
		int s2=sc.nextInt();
		int [][]arr=new int[s][s2];
		for(int i=0;i<s;i++) {
			for(int j=0;j<s2;j++) {
				System.out.print("Give value");
				System.out.println("[ "+i+" ][ "+j+" ]:");
				arr[i][j]=sc.nextInt();			}
		}
		System.out.println("your array is:");
		for(int i=0;i<s;i++) {
			System.out.println();
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]);
						}
		}
		
	}
	void searchElement() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give array size:");
		int s=sc.nextInt();
		System.out.println("Give size of sub array");
		int s2=sc.nextInt();
		int [][]arr=new int[s][s2];
		for(int i=0;i<s;i++) {
			for(int j=0;j<s2;j++) {
				System.out.print("Give value");
				System.out.println("[ "+i+" ][ "+j+" ]:");
				arr[i][j]=sc.nextInt();			}
		}
		
		System.out.println("Give a number to find index of it:");
		int n=sc.nextInt();
		for(int i=0;i<s;i++) {
			System.out.println();
			for(int j=0;j<arr[i].length;j++) {
				
				if(arr[i][j]==n) {
					System.out.print("index Is:[ "+i+" ][ "+j+" ]");
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a=new Array();
		//a.arrayDemo();
		//a.findIndex();
		//a.twoDArrayDemo();
		a.searchElement();
	}
}
