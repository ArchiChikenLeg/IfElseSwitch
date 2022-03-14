package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a >= b && a >= c)
			System.out.println(a);
		else if (b >= a && b >= c)
			System.out.println(b);
		else
			System.out.println(c);
		in.close();
	}

}
