package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k, n, m;
		k = in.nextInt();
		m = in.nextInt();
		n = in.nextInt();

		System.out.println((n/k + n%k)*2*m);
		in.close();
	}

}
