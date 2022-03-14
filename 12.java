package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, k;
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		if ((k%n == 0 && k/n < m) || (k%m == 0 && k/m < n))
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
