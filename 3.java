package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test, schol;
		test = in.nextInt();
		schol = in.nextInt();
		if ((test == 1 && schol == 1)||(test != 1 && schol!= 1))
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
