package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		a = in.nextInt();
		b = in.nextInt();
		if (a > b)
			System.out.println(a);
		else
			System.out.println(b);
		in.close();
	}

}
