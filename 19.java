package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k, n, m;
		k = in.nextInt();
		m = in.nextInt();
		n = in.nextInt();

		if(k==n && m==n)
			System.out.println(3);
		else if(k==n || m==n)
			System.out.println(2);
		else
			System.out.println(0);
		in.close();
	}

}
