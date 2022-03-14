package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();

		if (n%4 == 0 && (n/4)%2==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
