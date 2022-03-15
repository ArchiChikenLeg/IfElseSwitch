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
		
		int e = c - a;
		int f = d - b;
		if(f < 0) {
			e -= 1;
			f += 100;
		}
		
		System.out.println(e + " " + f);
		in.close();
	}

}
