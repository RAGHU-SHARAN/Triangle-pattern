package loop;

import java.util.Scanner;

public class PatternMethod {
public void myMethod(int x) {
	for(int i=0;i<=x;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number of rows:");
		int a = sc.nextInt();
		PatternMethod obj= new PatternMethod();
		obj.myMethod(a);

	}

}
