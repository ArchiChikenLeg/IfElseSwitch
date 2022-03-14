package demo;

import java.util.Scanner;

public class IfElseSwitch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fRow,fCol,sRow,sCol;
		fRow = in.nextInt();
		fCol = in.nextInt();
		sRow = in.nextInt();
		sCol = in.nextInt();
		if (fRow==sRow || fCol==sCol)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}

}
