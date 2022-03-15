package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k;
		k = in.nextInt();

		if((k%5)%3==0) 
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
