package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, d;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();

		if (a==0 && b==0)
			System.out.println("INF");
		else if (a==0 || b%a != 0 || (b==0 && d==0))
			System.out.println("NO");
		else
			System.out.println(-b/a);
		in.close();
	}

}
