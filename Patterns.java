package basicJava;

public class Patterns {
	
	void rectanglePattern() {
		for(int i=0;i<4;i++) {
			System.out.println("");
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
		}
	}
	
void holoRectangle() {
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++) {
		System.out.println("");
		for(int j=1;j<=m;j++) {
			if (i==1 || i==n ||j==1 || j==m  ) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
	}
}

void Pattern3() {
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++) {
		System.out.println();
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}
	}
}
void Pattern4() {
	int n=4;
	int m=5;
	for(int i=n;i>=1;i--) {
		System.out.println();
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	}
}
void Pattern5() {
	int n=4;
	int m=5;
	for(int i=1;i<=n;i++) {
		System.out.println();
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			
			System.out.print("*");
		}
	}
}
void pattern6() {
	int n=4;
	int m=5;
	for(int i=1;i<=m;i++) {
		System.out.println();
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
	}
}
void pattern7() {
	int n=4;
	int m=5;
	for(int i=m;i>=1;i--) {
		System.out.println();
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
	}
}

void pattern8() {
	int n=4;
	int m=5;
	for(int i=1;i<=m;i++) {
		System.out.println("");
		for(int j=1;j<=i;j++) {
			if((i+j)%2==0) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}
	}
}
void butterFlyPattern() {
	int m=5;
	//upper half
	
	for(int i=1;i<=m;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		int space=2*(m-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=m;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		int space=2*(m-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
void solidRombusPattern() {
	int n=6;
	for(int i=1;i<n;i++) {
		int space = n-i;
		for(int j=1;j<space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
void pyramidPattern() {
	int n=5;
	for(int i=1;i<=n;i++) {
		int space = n-i;
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
void pallindromPyramidPattern() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		for(int j=2;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
void diamondPattern() {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print("*");
		}
		for(int j=2;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patterns p=new Patterns();
		//p.rectanglePattern();
		//p.holoRectangle();
		//p.Pattern3();
		//p.Pattern4();
		//p.Pattern5();
		//p.pattern6();
		//p.pattern7();
		//p.pattern8();
		// p.butterFlyPattern();
		//p.solidRombusPattern();
		//p.pyramidPattern();
		//p.pallindromPyramidPattern();
		p.diamondPattern();
	}

}
