package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		if (n > 0)
			System.out.println(1);
		else if (n < 0)
			System.out.println(-1);
		else
			System.out.println(0);
		in.close();
	}

}
